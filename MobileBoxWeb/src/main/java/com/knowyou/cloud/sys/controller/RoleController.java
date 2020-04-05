package com.knowyou.cloud.sys.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.knowyou.cloud.sys.model.ParentModule;
import com.knowyou.cloud.sys.model.Role;
import com.knowyou.cloud.sys.model.RoleModule;
import com.knowyou.cloud.sys.model.User;
import com.knowyou.cloud.sys.service.RoleService;
import com.knowyou.cloud.sys.tool.DataSourceContextHolder;

/**
 * @author 作者 :bill.mei
 * @date 创建时间：2017年5月11日 上午11:39:06
 * @version 1.0
 */
@Controller
@RequestMapping(value = "/admin/role")
public class RoleController {

	@Autowired
	private RoleService server;

	@RequestMapping(value = "index")
	public String index() {
		return "/admin/role/index";
	}

	@RequestMapping(value = "edit")
	public ModelAndView edit(@RequestParam(value = "id", defaultValue = "0", required = false) int id,
			HttpSession session) {
		DataSourceContextHolder.setDbType("ky_cloud");
		ModelAndView mv = new ModelAndView();
		if (id > 0) {
			Role model = server.getModelById(id);
			mv.addObject("model", model);

			// 根据用户组获取模块信息
			User user = (User) session.getAttribute("user");
			if (user != null) {
				// 封装模块信息3级目录
				Map<Integer, ParentModule> dic1 = new HashMap<Integer, ParentModule>();
				Map<Integer, ParentModule> dic2 = new HashMap<Integer, ParentModule>();
				List<ParentModule> moduleList = server.getAllModuleList(user.getGid(), model.getId());
				for (ParentModule m : moduleList) {
					if (m.getPid() == 0) {
						dic1.put(m.getId(), m);
					} else {
						if (dic1.containsKey(m.getPid())) { // 二级目录
							dic2.put(m.getId(), m);
						} else { // 三级目录
							if (dic2.get(m.getPid()).getChild() == null)
								dic2.get(m.getPid()).setChild(new ArrayList<ParentModule>());
							dic2.get(m.getPid()).getChild().add(m);
						}
					}
				}
				for (ParentModule m : dic2.values()) {
					if (dic1.containsKey(m.getPid())) {
						if (dic1.get(m.getPid()).getChild() == null)
							dic1.get(m.getPid()).setChild(new ArrayList<ParentModule>());
						dic1.get(m.getPid()).getChild().add(m);
					}
				}
				List<ParentModule> mapValuesList = new ArrayList<ParentModule>(dic1.values());
				mv.addObject("module", mapValuesList);
			}
		}
		return mv;
	}

	@RequestMapping(value = "save")
	public String save(Role model) {
		DataSourceContextHolder.setDbType("ky_cloud");
		server.save(model);
		return "redirect:index";
	}

	@ResponseBody
	@RequestMapping(value = "list")
	public String list(HttpServletRequest request, int draw, int start, int length) {
		DataSourceContextHolder.setDbType("ky_cloud");
		Role model = new Role();
		model.setGid(1); // TODO:从系统中获取
		return server.getJsonList(draw, start, length, model);
	}

	@ResponseBody
	@RequestMapping(value = "del")
	public int del(String ids) {
		DataSourceContextHolder.setDbType("ky_cloud");
		return server.delete(ids);
	}

	@ResponseBody
	@RequestMapping(value = "roleModule")
	public int roleModule(Integer rid, Integer mid, Integer type) {
		DataSourceContextHolder.setDbType("ky_cloud");
		int result = 0;
		if (rid > 0 && rid > 0) {
			RoleModule record = new RoleModule();
			record.setMid(mid);
			record.setRid(rid);
			if (type == 1) {
				record.setCreateTime(new Date());
				result = server.saveModule(record);
			} else if (type == 2)
				result = server.deleteModule(record);

		}
		return result;
	}
}
