package com.knowyou.cloud.sys.dao;

import com.knowyou.cloud.sys.model.mobilebox.RankingSearch;
import com.knowyou.cloud.sys.model.mobilebox.RankingSearchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RankingSearchMapper {
    long countByExample(RankingSearchExample example);

    int deleteByExample(RankingSearchExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RankingSearch record);

    int insertSelective(RankingSearch record);

    List<RankingSearch> selectByExample(RankingSearchExample example);

    RankingSearch selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RankingSearch record, @Param("example") RankingSearchExample example);

    int updateByExample(@Param("record") RankingSearch record, @Param("example") RankingSearchExample example);

    int updateByPrimaryKeySelective(RankingSearch record);

    int updateByPrimaryKey(RankingSearch record);
    
    List<RankingSearch> selectBySumExample(RankingSearchExample example);
}