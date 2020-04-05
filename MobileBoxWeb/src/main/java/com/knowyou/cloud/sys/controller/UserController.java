package com.knowyou.cloud.sys.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.knowyou.cloud.sys.model.User;
import com.knowyou.cloud.sys.model.UserRole;
import com.knowyou.cloud.sys.service.UserService;
import com.knowyou.cloud.sys.tool.DataSourceContextHolder;

/**
 * @author 作者 :bill.mei
 * @date 创建时间：2017年5月11日 上午8:53:50
 * @version 1.0
 */
@Controller
@RequestMapping(value = "/admin/user")
public class UserController {

	@Autowired
	private UserService server;

	@RequestMapping(value = "index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("index");
		return mv;
	}

	@RequestMapping(value = "edit")
	public ModelAndView edit(@RequestParam(value = "id", defaultValue = "0", required = false) int id,
			HttpSession session) {
		DataSourceContextHolder.setDbType("ky_cloud");
		ModelAndView mv = new ModelAndView();
		User loginUser = (User) session.getAttribute("user");
		if (id > 0) {
			User model = server.getModelById(id);
			mv.addObject("model", model);
		}
		if (loginUser != null) {
			List<UserRole> roleList = server.getAllRole(id, loginUser.getGid());
			mv.addObject("role", roleList);
		}
		return mv;
	}

	@RequestMapping(value = "save")
	public String save(User model, HttpSession session) {
		DataSourceContextHolder.setDbType("ky_cloud");
		User loginUser = (User) session.getAttribute("user");
		model.setGid(loginUser.getGid());
		server.save(model);
		return "redirect:index";
	}

	@ResponseBody
	@RequestMapping(value = "list")
	public String list(HttpServletRequest request, int draw, int start, int length) {
		DataSourceContextHolder.setDbType("ky_cloud");
		User model = new User();
		return server.getJsonList(draw, start, length, model);
	}

	@ResponseBody
	@RequestMapping(value = "del")
	public int del(String ids) {
		DataSourceContextHolder.setDbType("ky_cloud");
		return server.delete(ids);
	}

	@ResponseBody
	@RequestMapping(value = "userRole")
	public int userRole(Integer userId, Integer roleId, Integer type) {
		DataSourceContextHolder.setDbType("ky_cloud");
		int result = 0;
		if (userId != null && userId > 0 && roleId != null && roleId > 0) {
			UserRole record = new UserRole();
			record.setUserId(userId);
			record.setRoleId(roleId);
			if (type == 1) {
				record.setCreateTime(new Date());
				result = server.saveRole(record);
			} else if (type == 2)
				result = server.deleteRole(record);

		}
		return result;
	}
}
