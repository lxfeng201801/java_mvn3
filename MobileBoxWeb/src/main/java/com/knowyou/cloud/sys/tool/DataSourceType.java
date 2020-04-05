package com.knowyou.cloud.sys.tool;

/**
 * @author 作者 :bill.mei
 * @date 创建时间：2017年5月8日 上午11:23:15
 * @version 1.0
 */
public enum DataSourceType {
	ky_cloud("ky_cloud"), ky_mobile_box("ky_mobile_box");
	private final String text;

	private DataSourceType(final String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return text;
	}
}
