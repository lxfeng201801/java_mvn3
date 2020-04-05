package com.knowyou.cloud.sys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.knowyou.cloud.sys.dao.RankingMovieMapper;
import com.knowyou.cloud.sys.model.mobilebox.RankingMovie;
import com.knowyou.cloud.sys.model.mobilebox.RankingMovieExample;
import com.knowyou.cloud.sys.tool.PageHelp;


/** 
* @author 梁玲
* @date 2017-05-11
* @version 1.0 
*/
@Transactional
@Service
public class RankingMovieService
{
	@Autowired
	protected RankingMovieMapper rankingMovieDao;

	public void insert(RankingMovie record)
	{
		rankingMovieDao.insert(record);
	}
	
	/**
	 * 获取电影排行榜列表
	 * @return
	 */
	public String getRankingMovieList(RankingMovieExample example, int draw, int start, int len)
	{
		long count = rankingMovieDao.countBySumExample(example);

		example.setLimitStart(start);
		example.setLimitEnd(len);
		
		List<RankingMovie> list = rankingMovieDao.selectBySumExample(example);
		
		return PageHelp.ToPageJson(draw, count, list);
	}
}
