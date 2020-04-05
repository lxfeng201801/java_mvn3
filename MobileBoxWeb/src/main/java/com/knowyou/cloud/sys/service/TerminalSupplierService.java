package com.knowyou.cloud.sys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.knowyou.cloud.sys.dao.TerminalSupplierMapper;
import com.knowyou.cloud.sys.model.mobilebox.TerminalSupplier;


/** 
* @author 梁玲
* @date 2017-05-12
* @version 1.0 
*/
@Transactional
@Service
public class TerminalSupplierService {
	@Autowired
	protected TerminalSupplierMapper mapper;

	public TerminalSupplier selectByPrimaryKey(String sn) {
		return mapper.selectByPrimaryKey(sn);
	}
}
