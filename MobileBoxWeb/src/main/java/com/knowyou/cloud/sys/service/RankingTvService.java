package com.knowyou.cloud.sys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.knowyou.cloud.sys.dao.RankingTvMapper;
import com.knowyou.cloud.sys.model.mobilebox.RankingTv;
import com.knowyou.cloud.sys.model.mobilebox.RankingTvExample;
import com.knowyou.cloud.sys.tool.PageHelp;


/** 
* @author 梁玲
* @date 2017-05-11
* @version 1.0 
*/
@Transactional
@Service
public class RankingTvService
{
	@Autowired
	protected RankingTvMapper rankingTvDao;

	public void insert(RankingTv record)
	{
		rankingTvDao.insert(record);
	}
	
	/**
	 * 获取Tv列表
	 * @return
	 */
	public String getRankingTvList(RankingTvExample example, int draw, int start, int len)
	{
		long count = rankingTvDao.countBySumExample(example);

		example.setLimitStart(start);
		example.setLimitEnd(len);
		
		List<RankingTv> list = rankingTvDao.selectBySumExample(example);
		
		return PageHelp.ToPageJson(draw, count, list);
	}
}
