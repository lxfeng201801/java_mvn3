package com.knowyou.cloud.sys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.knowyou.cloud.sys.dao.UserInputMapper;
import com.knowyou.cloud.sys.model.mobilebox.UserInput;
import com.knowyou.cloud.sys.model.mobilebox.UserInputExample;

/** 
* @author 梁玲
* @date 2017-05-11
* @version 1.0 
*/
@Transactional
@Service
public class UserInputService
{
	@Autowired
	protected UserInputMapper userInputDao;

	public void insert(UserInput record)
	{
		userInputDao.insert(record);
	}
	
	/**
	 * 根据用户接入方式列表（0：小时；1：天；2：月）
	 * @param example
	 * @param type
	 * @return
	 */
	public List<UserInput> getUserOnlineList(UserInputExample example)
	{
		return userInputDao.selectByExample(example);
	}
	
	public UserInput getUserOnline(UserInputExample example)
	{
		return userInputDao.selectBySumExample(example);
	}
}
