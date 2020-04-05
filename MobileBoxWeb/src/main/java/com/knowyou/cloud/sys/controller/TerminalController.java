package com.knowyou.cloud.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.knowyou.cloud.sys.service.TerminalService;

/**
 * @author 作者 :bill.mei
 * @date 创建时间：2017年5月2日 上午10:03:13
 * @version 1.0
 */
@Controller
@RequestMapping(value = "/admin")
public class TerminalController
{
	@Autowired
	protected TerminalService terminalService;

	@RequestMapping(value = "report/user")
	public ModelAndView module()
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("user");

		return mv;
	}
}