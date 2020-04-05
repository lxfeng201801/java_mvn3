package com.knowyou.cloud.sys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.knowyou.cloud.sys.dao.VideoTypeMapper;
import com.knowyou.cloud.sys.model.mobilebox.VideoType;
import com.knowyou.cloud.sys.model.mobilebox.VideoTypeExample;

/** 
* @author 梁玲
* @date 2017-05-11
* @version 1.0 
*/
@Transactional
@Service
public class VideoTypeService
{
	@Autowired
	protected VideoTypeMapper videoTypeDao;

	public void insert(VideoType record)
	{
		videoTypeDao.insert(record);
	}
	
	/**
	 * 根据类型，判断直播和重播的总次数
	 * @param example
	 * @param type
	 * @return
	 */
	public List<VideoType> getVideoTypeListByType(VideoTypeExample example, Integer type)
	{
		if(type == 0)
		{
			return videoTypeDao.selectByHourExample(example);
		}
		if(type == 1)
		{
			return videoTypeDao.selectByDayExample(example);
		}
		if(type == 2)
		{
			return videoTypeDao.selectByMonthExample(example);
		}
		
		return null;
	}
	
	/**
	 * 根据类型，判断直播和重播的总次数
	 * @param example
	 * @param type
	 * @return
	 */
	public List<VideoType> getVideoTypeList(VideoTypeExample example)
	{
		return videoTypeDao.selectByExample(example);
	}
	
	public VideoType getVideoType(VideoTypeExample example)
	{
		return videoTypeDao.selectBySumExample(example);
	}
}
