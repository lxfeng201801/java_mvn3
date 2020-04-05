package com.knowyou.cloud.sys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.knowyou.cloud.sys.dao.IndexKeyMapper;
import com.knowyou.cloud.sys.tool.FileKey;

/**
 * @author 作者 :bill.mei
 * @date 创建时间：2017年5月8日 下午5:37:29
 * @version 1.0
 */
@Transactional
@Service
public class IndexKeyService {

	@Autowired
	private IndexKeyMapper indexkeyMapper;

	public String getKey() {
		return FileKey.getInstall().getFileIndex(indexkeyMapper);
	}
}
