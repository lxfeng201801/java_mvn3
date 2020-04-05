package com.knowyou.cloud.sys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.knowyou.cloud.sys.dao.VideoQualityMapper;
import com.knowyou.cloud.sys.model.mobilebox.VideoQuality;
import com.knowyou.cloud.sys.model.mobilebox.VideoQualityExample;


/** 
* @author 梁玲
* @date 2017-05-16
* @version 1.0 
*/
@Transactional
@Service
public class VideoQualityService
{
	@Autowired
	protected VideoQualityMapper videoQualityDao;

	public void insert(VideoQuality record)
	{
		videoQualityDao.insert(record);
	}
	
	/**
	 * 根据类型，获取码流占比
	 * @param example
	 * @param type
	 * @return
	 */
	public List<VideoQuality> getVideoQualityList(VideoQualityExample example)
	{
		return videoQualityDao.selectByExample(example);
	}
	
	public VideoQuality getVideoQuality(VideoQualityExample example)
	{
		return videoQualityDao.selectBySumExample(example);
	}
}
