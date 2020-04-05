package com.knowyou.cloud.sys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.knowyou.cloud.sys.dao.VideoApplyMapper;
import com.knowyou.cloud.sys.model.mobilebox.VideoApply;
import com.knowyou.cloud.sys.model.mobilebox.VideoApplyExample;


/** 
* @author 梁玲
* @date 2017-05-16
* @version 1.0 
*/
@Transactional
@Service
public class VideoApplyService
{
	@Autowired
	protected VideoApplyMapper videoApplyDao;

	public void insert(VideoApply record)
	{
		videoApplyDao.insert(record);
	}
	
	/**
	 * 查询咪咕应用列表根据Name分组
	 * @return
	 */
	public List<VideoApply> getVideoApplyListGroupName(VideoApplyExample example)
	{
		return videoApplyDao.selectByExampleGroupName(example);
	}
	
	/**
	 * 按照类型统计咪咕游戏、咪咕音乐、咪咕学堂各个时段的值
	 * @param example
	 * @param type(0：小时；1：天；2：月)
	 * @return
	 */
	public List<VideoApply> getVideoApplyListByType(VideoApplyExample example, Integer type)
	{
		if(type == 0)
		{
			return videoApplyDao.selectByHourExample(example);
		}
		if(type == 1)
		{
			return videoApplyDao.selectByDayExample(example);
		}
		if(type == 2)
		{
			return videoApplyDao.selectByMonthExample(example);
		}
		
		return null;
	}
}
