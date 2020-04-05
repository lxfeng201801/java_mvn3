package com.knowyou.cloud.sys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.knowyou.cloud.sys.model.mobilebox.RankingVarietyShow;
import com.knowyou.cloud.sys.model.mobilebox.RankingVarietyShowExample;

public interface RankingVarietyShowMapper {
    long countByExample(RankingVarietyShowExample example);

    int deleteByExample(RankingVarietyShowExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RankingVarietyShow record);

    int insertSelective(RankingVarietyShow record);

    List<RankingVarietyShow> selectByExample(RankingVarietyShowExample example);

    RankingVarietyShow selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RankingVarietyShow record, @Param("example") RankingVarietyShowExample example);

    int updateByExample(@Param("record") RankingVarietyShow record, @Param("example") RankingVarietyShowExample example);

    int updateByPrimaryKeySelective(RankingVarietyShow record);

    int updateByPrimaryKey(RankingVarietyShow record);
    
    List<RankingVarietyShow> selectBySumExample(RankingVarietyShowExample example);
    
    long countBySumExample(RankingVarietyShowExample example);
}