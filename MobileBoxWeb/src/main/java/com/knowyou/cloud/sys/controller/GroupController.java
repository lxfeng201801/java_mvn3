package com.knowyou.cloud.sys.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.knowyou.cloud.sys.model.Group;
import com.knowyou.cloud.sys.model.GroupModule;
import com.knowyou.cloud.sys.model.ParentModule;
import com.knowyou.cloud.sys.model.User;
import com.knowyou.cloud.sys.service.GroupService;
import com.knowyou.cloud.sys.service.UserService;
import com.knowyou.cloud.sys.tool.DataSourceContextHolder;
import com.knowyou.cloud.sys.tool.Tool;

/**
 * 用户组控制器
 * 
 * @author 作者 :bill.mei
 * @date 创建时间：2017年5月3日 上午10:17:33
 * @version 1.0
 */
@Controller
@RequestMapping(value = "/admin/group")
public class GroupController {
	@Autowired
	protected GroupService groupService;

	@Autowired
	protected UserService userService;

	@RequestMapping(value = "index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("index");
		return mv;
	}

	@ResponseBody()
	@RequestMapping(value = "data_list", produces = "text/html;charset=UTF-8")
	public String dataList(int draw, int start, int length) {
		DataSourceContextHolder.setDbType("ky_cloud");
		return groupService.getList(draw, start, length);
	}

	@RequestMapping(value = "edit")
	public ModelAndView edit(Group group) {
		DataSourceContextHolder.setDbType("ky_cloud");
		ModelAndView mv = new ModelAndView();
		if (group != null && group.getId() != null) {
			group = groupService.getById(group.getId());
			mv.addObject("model", group);

			// 加载超级管理员信息
			User user = userService.getAdminByGID(group.getId());
			if (user == null)
				user = new User();
			if (user.getGid() == null || user.getId() == 0)
				user.setGid(group.getId());
			user.setPwd("");
			mv.addObject("user", user);

			// 封装模块信息3级目录
			Map<Integer, ParentModule> dic1 = new HashMap<Integer, ParentModule>();
			Map<Integer, ParentModule> dic2 = new HashMap<Integer, ParentModule>();
			List<ParentModule> moduleList = groupService.getAllModuleList(group.getId());
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
		return mv;
	}

	@RequestMapping(value = "addOrEdit")
	public String addOrEdit(Group group) {
		DataSourceContextHolder.setDbType("ky_cloud");
		int id = 0;
		if (group != null) {
			if (group.getId() != null) {// 更新操作
				if (groupService.edit(group) > 0) {
					id = group.getId();
				}
			} else {
				group.setCreateTime(new Date());
				if (groupService.add(group) > 0) {
					id = group.getId(); // 得到自动增长ID
				}
			}
		}
		return "redirect:edit?id=" + id;
	}

	@RequestMapping(value = "saveAdmin")
	public String saveAdmin(User user) {
		DataSourceContextHolder.setDbType("ky_cloud");
		String result = "redirect:edit";
		if (user != null) {
			if (user.getPwd() != null && !user.getPwd().isEmpty()) {
				user.setPwd(Tool.string2MD5(user.getPwd()));
			} else
				user.setPwd(null);
			user.setFlag((byte) 1);
			user.setStatus((byte) 1);
			userService.save(user);

			if (user.getGid() != null && user.getGid() > 0)
				result = "redirect:edit?id=" + user.getGid();
		}
		return result;
	}

	@ResponseBody()
	@RequestMapping(value = "delete")
	public Integer delete(String ids) {
		DataSourceContextHolder.setDbType("ky_cloud");
		return groupService.delete(ids);
	}

	@ResponseBody()
	@RequestMapping(value = "groupModule")
	public Integer groupModule(Integer gid, Integer mid, Integer type) {
		DataSourceContextHolder.setDbType("ky_cloud");
		int result = 0;
		if (gid > 0 && mid > 0) {
			GroupModule record = new GroupModule();
			record.setGid(gid);
			record.setMid(mid);
			record.setOrderIndex(0);
			if (type == 1) {
				record.setCreateTime(new Date());
				result = groupService.saveGroupModule(record);
			} else if (type == 2)
				result = groupService.deleteGroupModule(record);

		}
		return result;
	}

}
