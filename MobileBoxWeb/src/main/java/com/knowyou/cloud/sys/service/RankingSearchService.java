package com.knowyou.cloud.sys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.knowyou.cloud.sys.dao.RankingSearchMapper;
import com.knowyou.cloud.sys.model.mobilebox.RankingSearch;
import com.knowyou.cloud.sys.model.mobilebox.RankingSearchExample;


/** 
* @author 梁玲
* @date 2017-05-11
* @version 1.0 
*/
@Transactional
@Service
public class RankingSearchService
{
	@Autowired
	protected RankingSearchMapper rankingSearchDao;

	public void insert(RankingSearch record)
	{
		rankingSearchDao.insert(record);
	}
	
	/**
	 * 获取搜索排名
	 * @return
	 */
	public List<RankingSearch> getRankingSearchList(RankingSearchExample example)
	{
		return rankingSearchDao.selectByExample(null);
	}
	
	/**
	 * 获取搜索排名列表根据搜索的title分组
	 */
	public List<RankingSearch> getRankingSearchListByTitle(RankingSearchExample example)
	{
		return rankingSearchDao.selectBySumExample(example);
	}
	
}
