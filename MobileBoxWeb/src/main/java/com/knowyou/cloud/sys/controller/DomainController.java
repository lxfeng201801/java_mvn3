package com.knowyou.cloud.sys.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.knowyou.cloud.sys.model.Domain;
import com.knowyou.cloud.sys.service.DomainService;
import com.knowyou.cloud.sys.tool.DataSourceContextHolder;

/**
 * @author 作者 :bill.mei
 * @date 创建时间：2017年5月11日 下午1:50:07
 * @version 1.0
 */
@Controller
@RequestMapping(value = "/admin/domain")
public class DomainController {

	@Autowired
	private DomainService server;

	@RequestMapping(value = "index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("index");
		return mv;
	}

	@RequestMapping(value = "edit")
	public ModelAndView edit(@RequestParam(value = "id", defaultValue = "0", required = false) int id) {
		DataSourceContextHolder.setDbType("ky_cloud");
		ModelAndView mv = new ModelAndView();
		if (id > 0) {
			Domain model = server.getModelById(id);
			mv.addObject("model", model);
		}
		return mv;
	}

	@RequestMapping(value = "save")
	public String save(Domain model) {
		DataSourceContextHolder.setDbType("ky_cloud");
		server.save(model);
		return "redirect:index";
	}

	@ResponseBody
	@RequestMapping(value = "list")
	public String list(HttpServletRequest request, int draw, int start, int length) {
		DataSourceContextHolder.setDbType("ky_cloud");
		Domain model = new Domain();
		return server.getJsonList(draw, start, length, model);
	}

	@ResponseBody
	@RequestMapping(value = "del")
	public int del(String ids) {
		DataSourceContextHolder.setDbType("ky_cloud");
		return server.delete(ids);
	}
}
