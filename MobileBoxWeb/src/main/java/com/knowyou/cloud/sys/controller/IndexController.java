package com.knowyou.cloud.sys.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.knowyou.cloud.sys.model.ParentModule;
import com.knowyou.cloud.sys.model.User;
import com.knowyou.cloud.sys.service.UserService;
import com.knowyou.cloud.sys.tool.DataSourceContextHolder;

/**
 * @author 作者 :bill.mei
 * @date 创建时间：2017年5月2日 上午10:03:13
 * @version 1.0
 */
@Controller
public class IndexController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = { "/index" })
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/login")
	public String login(String name, String pwd, HttpSession session, HttpServletRequest request) {
		if (name != null && !name.isEmpty() && pwd != null && !pwd.isEmpty()) {
			DataSourceContextHolder.setDbType("ky_cloud");
			User user = userService.login(name, pwd);
			if (user != null) {
				// 获取用户菜单 封装模块信息3级目录
				Map<Integer, ParentModule> dic1 = new HashMap<Integer, ParentModule>();
				Map<Integer, ParentModule> dic2 = new HashMap<Integer, ParentModule>();
				List<ParentModule> moduleList = userService.selectUserRoleModule(user.getId());
				for (ParentModule m : moduleList) {
					if (m.getUrl() == null || m.getUrl().isEmpty())
						m.setUrl(null);
					else
						m.setUrl(request.getContextPath() + m.getUrl());
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
				List<ParentModule> mapValuesList = new ArrayList<ParentModule>(dic2.values());
				session.setAttribute("module", mapValuesList);
				session.setAttribute("user", user);
				return "redirect:index";
			}
		}
		return "login";
	}

	@RequestMapping(value = "/LoginOut")
	public String LoginOut(HttpSession session) {
		session.invalidate();
		return "redirect:login";
	}

	@RequestMapping(value = { "/screen" })
	public String screen()
	{
		return "screen";
	}

	@RequestMapping(value = { "/screen/overview" })
	public String overview()
	{
		return "screen/overview";
	}

	@RequestMapping(value = { "/screen/poster" })
	public String poster()
	{
		return "screen/poster";
	}

	@RequestMapping(value = { "/screen/channel" })
	public String channel()
	{
		return "screen/channel";
	}

	@RequestMapping(value = { "/screen/content" })
	public String content()
	{
		return "screen/content";
	}


	@RequestMapping(value = { "/screen/quality" })
	public String quality()
	{
		return "screen/quality";
	}
}
