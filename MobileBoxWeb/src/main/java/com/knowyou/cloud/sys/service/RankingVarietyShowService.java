package com.knowyou.cloud.sys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.knowyou.cloud.sys.dao.RankingVarietyShowMapper;
import com.knowyou.cloud.sys.model.mobilebox.RankingVarietyShow;
import com.knowyou.cloud.sys.model.mobilebox.RankingVarietyShowExample;
import com.knowyou.cloud.sys.tool.PageHelp;

/** 
* @author 梁玲
* @date 2017-05-11
* @version 1.0 
*/
@Transactional
@Service
public class RankingVarietyShowService
{
	@Autowired
	protected RankingVarietyShowMapper rankingVarietyShowDao;

	public void insert(RankingVarietyShow record)
	{
		rankingVarietyShowDao.insert(record);
	}
	
	/**
	 * 获取综艺节目列表
	 * @param example
	 * @return
	 */
	public String getRankingVarietyShowDaoList(RankingVarietyShowExample example, int draw, int start, int len)
	{
		long count = rankingVarietyShowDao.countBySumExample(example);

		example.setLimitStart(start);
		example.setLimitEnd(len);
		
		List<RankingVarietyShow> list = rankingVarietyShowDao.selectBySumExample(example);
		
		return PageHelp.ToPageJson(draw, count, list);
	}
}