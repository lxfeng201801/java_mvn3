package com.knowyou.cloud.sys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.knowyou.cloud.sys.dao.VideoDelayMapper;
import com.knowyou.cloud.sys.model.mobilebox.VideoDelay;
import com.knowyou.cloud.sys.model.mobilebox.VideoDelayExample;


/** 
* @author 梁玲
* @date 2017-05-11
* @version 1.0 
*/
@Transactional
@Service
public class VideoDelayService
{
	@Autowired
	protected VideoDelayMapper videoDelayDao;

	public void insert(VideoDelay record)
	{
		videoDelayDao.insert(record);
	}
	
	/**
	 * 获取视频时延排行
	 * @return
	 */
	public List<VideoDelay> getVideoDelayList(VideoDelayExample example)
	{
		return videoDelayDao.selectByExample(example);
	}
	
	/**
	 * 获取视频时延统计
	 * @param example
	 * @return
	 */
	public VideoDelay getVideoDelay(VideoDelayExample example)
	{
		return videoDelayDao.selectBySumExample(example);
	}
}