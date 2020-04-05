package com.knowyou.cloud.sys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.knowyou.cloud.sys.model.mobilebox.RankingTv;
import com.knowyou.cloud.sys.model.mobilebox.RankingTvExample;

public interface RankingTvMapper {
    long countByExample(RankingTvExample example);

    int deleteByExample(RankingTvExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RankingTv record);

    int insertSelective(RankingTv record);

    List<RankingTv> selectByExample(RankingTvExample example);

    RankingTv selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RankingTv record, @Param("example") RankingTvExample example);

    int updateByExample(@Param("record") RankingTv record, @Param("example") RankingTvExample example);

    int updateByPrimaryKeySelective(RankingTv record);

    int updateByPrimaryKey(RankingTv record);
    
    List<RankingTv> selectBySumExample(RankingTvExample example);
    
    long countBySumExample(RankingTvExample example);
}