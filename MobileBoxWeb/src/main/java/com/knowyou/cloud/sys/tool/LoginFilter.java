package com.knowyou.cloud.sys.tool;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

/**
 * @author 作者 :bill.mei
 * @date 创建时间：2017年5月11日 下午3:04:27
 * @version 1.0
 */
public class LoginFilter extends OncePerRequestFilter {

	/*
	 * 用户登录过滤
	 */
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		String url = request.getRequestURI();
		if (url.indexOf("static") == -1 && url.indexOf("screen") == -1
				&& !url.equals(request.getContextPath() + "/login")) {
			Object obj = request.getSession().getAttribute("user");
			request.getSession().setAttribute("url", url);
			if (null == obj) {
				response.sendRedirect(PageHelp.GetWebBasePath(request) + "screen");
				return;
			}
		}
		// 如果不执行过滤，则继续
		filterChain.doFilter(request, response);
	}
}
