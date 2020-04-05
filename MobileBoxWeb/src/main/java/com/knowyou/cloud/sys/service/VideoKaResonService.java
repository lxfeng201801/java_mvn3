package com.knowyou.cloud.sys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.knowyou.cloud.sys.dao.VideoKaResonMapper;
import com.knowyou.cloud.sys.model.mobilebox.VideoKaReson;
import com.knowyou.cloud.sys.model.mobilebox.VideoKaResonExample;

/** 
* @author 梁玲
* @date 2017-05-11
* @version 1.0 
*/
@Transactional
@Service
public class VideoKaResonService
{
	@Autowired
	protected VideoKaResonMapper videoKaResonDao;

	/**
	 * 获取卡顿列表
	 */
	public List<VideoKaReson> getVideoKaResonList(VideoKaResonExample example)
	{
		return videoKaResonDao.selectByExample(example);
	}
}