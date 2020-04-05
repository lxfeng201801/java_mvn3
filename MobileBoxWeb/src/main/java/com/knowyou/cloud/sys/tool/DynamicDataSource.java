package com.knowyou.cloud.sys.tool;

import java.util.logging.Logger;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author 作者 :bill.mei
 * @date 创建时间：2017年5月8日 上午11:13:22
 * @version 1.0
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

	@Override
	public Logger getParentLogger() {
		return null;
	}

	@Override
	protected Object determineCurrentLookupKey() {
		return DataSourceContextHolder.getDbType();
	}
}
