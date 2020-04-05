package com.knowyou.cloud.sys.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.knowyou.cloud.sys.model.Module;
import com.knowyou.cloud.sys.service.ModuleService;
import com.knowyou.cloud.sys.tool.DataSourceContextHolder;

/**
 * @author 作者 :bill.mei
 * @date 创建时间：2017年5月2日 上午10:03:13
 * @version 1.0
 */
@Controller
@RequestMapping(value = "/admin")
public class AdminController {
	@Autowired
	protected ModuleService moduleService;

	@RequestMapping(value = "index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("index");
		return mv;
	}

	@RequestMapping(value = "module/index")
	public ModelAndView module() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("index");
		return mv;
	}

	@RequestMapping(value = "module/edit")
	public ModelAndView editModule(HttpServletRequest request, Module model) {
		DataSourceContextHolder.setDbType("ky_cloud");
		ModelAndView mv = new ModelAndView();
		if (model != null) {
			if ("GET".equals(request.getMethod().toUpperCase())) { // 是GET
				if (model.getId() != null && model.getId() > 0) {
					model = moduleService.getById(model.getId());
					mv.addObject("model", model);
				}
			} else {
				model.setCreateTime(new Date());
				if (moduleService.save(model) > 0) {
					mv = new ModelAndView("redirect:index");
				}
			}
		}
		return mv;
	}

	@ResponseBody()
	@RequestMapping(value = "module/getPreNode", produces = "text/html;charset=UTF-8")
	public String getPreNode() {
		DataSourceContextHolder.setDbType("ky_cloud");
		List<Module> list = moduleService.getPreNode(1);
		Gson gson = new Gson();
		String jackJson = gson.toJson(list);
		return jackJson;
	}

	@ResponseBody()
	@RequestMapping(value = "module/data_list", produces = "text/html;charset=UTF-8")
	public String DataList(int draw, int start, int length) {
		DataSourceContextHolder.setDbType("ky_cloud");
		return moduleService.getList(draw, start, length);
	}

	@ResponseBody()
	@RequestMapping(value = "module/delete")
	public Integer delete(String ids) {
		DataSourceContextHolder.setDbType("ky_cloud");
		return moduleService.delete(ids);
	}
}
