package com.knowyou.cloud.sys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.knowyou.cloud.sys.dao.RankingInputMapper;
import com.knowyou.cloud.sys.model.mobilebox.RankingInput;
import com.knowyou.cloud.sys.model.mobilebox.RankingInputExample;

/** 
* @author 梁玲
* @date 2017-05-11
* @version 1.0 
*/
@Transactional
@Service
public class RankingInputService
{
	@Autowired
	protected RankingInputMapper rankingInputDao;

	public void insert(RankingInput record)
	{
		rankingInputDao.insert(record);
	}
	
	/**
	 * 获取RankingInput列表
	 * @return
	 */
	public List<RankingInput> getRankingInputList(RankingInputExample example)
	{
		return rankingInputDao.selectByExample(example);
	}
	
	/**
	 * 获取入口排名列表
	 * @param example
	 * @return
	 */
	public List<RankingInput> getRankingInputListByTile(RankingInputExample example)
	{
		return rankingInputDao.selectByTitleExample(example);
	}
}
