package com.knowyou.cloud.sys.tool;

/**
 * @author 作者 :bill.mei
 * @date 创建时间：2017年5月8日 上午11:13:00
 * @version 1.0
 */
public class DataSourceContextHolder {
	//private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();
	private static String contextHolder;
	
	private static void setContextHolder(String contextHolder) {
		DataSourceContextHolder.contextHolder = contextHolder;
	}

	private static String getContextholder() {
		return contextHolder;
	}
	
	public static void setDbType(String dbType) {
		setContextHolder(dbType);
	}

	public static String getDbType() {
		return ((String) getContextholder());
	}

	public static void clearDbType() {
		setContextHolder("");
	}
}
