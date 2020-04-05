package com.knowyou.cloud.sys.service;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.knowyou.cloud.sys.dao.UserOnlineMapper;
import com.knowyou.cloud.sys.model.mobilebox.UserOnline;
import com.knowyou.cloud.sys.model.mobilebox.UserOnlineExample;

/** 
* @author  作者 :bill.mei 
* @date 创建时间：2017年5月8日 下午1:33:50 
* @version 1.0 
*/
@Transactional
@Service
public class UserOnlineService
{
	@Autowired
	protected UserOnlineMapper userOnlineDao;
	
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式  
	
	public void insert(UserOnline record)
	{
		userOnlineDao.insert(record);
	}

	public List<UserOnline> getUserOnlineList(UserOnlineExample example)
	{
		return userOnlineDao.selectByExample(example);
	}
	
	/**
	 * 根据type类型分组查询在线用户数据源（0：小时；1：天；2：月）
	 * @param example
	 * @param type
	 * @return
	 */
	public List<UserOnline> getUserOnlineListByType(UserOnlineExample example, Integer type)
	{
		if(type == 0)
		{
			return userOnlineDao.selectByHourExample(example);
		}
		if(type == 1)
		{
			return userOnlineDao.selectByDayExample(example);
		}
		if(type == 2)
		{
			return userOnlineDao.selectByMonthExample(example);
		}
		
		return null;
	}
	
	/**
	 * 按照日期倒序排列，第一条为最新在线人数
	 */
	public Integer getOnlineUserCount()
	{
		UserOnlineExample example = new UserOnlineExample();
		
		example.setLimitStart(0);
		example.setLimitEnd(1);
		
		example.setOrderByClause("date DESC");
		
		List<UserOnline> userOnlineList = userOnlineDao.selectByExample(example);
		
		if(userOnlineList != null && userOnlineList.size() > 0)
		{
			return userOnlineList.get(0).getVal();
		}
		
		return 0;
	}
}
