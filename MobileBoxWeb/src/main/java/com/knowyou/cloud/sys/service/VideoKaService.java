package com.knowyou.cloud.sys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.knowyou.cloud.sys.dao.VideoKaMapper;
import com.knowyou.cloud.sys.model.mobilebox.VideoKa;
import com.knowyou.cloud.sys.model.mobilebox.VideoKaExample;



/** 
* @author 梁玲
* @date 2017-05-11
* @version 1.0 
*/
@Transactional
@Service
public class VideoKaService
{
	@Autowired
	protected VideoKaMapper videoKaDao;

	public void insert(VideoKa record)
	{
		videoKaDao.insert(record);
	}
	
//	/**
//	 * 获取前10卡顿
//	 * @return
//	 */
//	public List<VideoKa> getVideoKaTop10List()
//	{
//		VideoKaExample example = new VideoKaExample();
//		
//		example.setLimitStart(0);
//		example.setLimitEnd(10);
//		example.setOrderByClause("ka_time DESC");
//		
//		return videoKaDao.selectByExample(example);
//	}
	
	/**
	 * 获取卡顿列表
	 */
	public List<VideoKa> getVideoKaList(VideoKaExample example)
	{
		return videoKaDao.selectByExample(example);
	}
	
	/**
	 * 获取视频时延统计
	 * @param example
	 * @return
	 */
	public VideoKa getVideoKa(VideoKaExample example)
	{
		return videoKaDao.selectBySumExample(example);
	}
}
