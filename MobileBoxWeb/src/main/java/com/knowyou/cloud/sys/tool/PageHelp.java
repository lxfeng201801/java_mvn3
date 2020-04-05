package com.knowyou.cloud.sys.tool;

import javax.servlet.http.HttpServletRequest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PageHelp {
	public static String GetWebBasePath(HttpServletRequest request) {
		String path = request.getContextPath();
		String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path
				+ "/";
		return basePath;
	}

	/**
	 * 将列表数据转换为json输出
	 * 
	 * @param draw
	 * @param recordsTotal
	 * @param t
	 * 
	 *
	 */
	public static <T> String ToPageJson(int draw, long recordsTotal, T t) {
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").serializeNulls().create();
		StringBuilder rt = new StringBuilder();
		rt.append("{");
		rt.append("\"draw\": ");
		rt.append(draw + 1);

		rt.append(",\"recordsTotal\": ");
		rt.append(recordsTotal);

		rt.append(",\"recordsFiltered\": ");
		rt.append(recordsTotal);

		rt.append(",\"data\": ");
		rt.append(gson.toJson(t));

		rt.append("}");
		return rt.toString();
	}
}
