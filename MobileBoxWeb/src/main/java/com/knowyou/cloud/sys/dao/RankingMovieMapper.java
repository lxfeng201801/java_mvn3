package com.knowyou.cloud.sys.dao;

import com.knowyou.cloud.sys.model.mobilebox.RankingMovie;
import com.knowyou.cloud.sys.model.mobilebox.RankingMovieExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RankingMovieMapper {
    long countByExample(RankingMovieExample example);

    int deleteByExample(RankingMovieExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RankingMovie record);

    int insertSelective(RankingMovie record);

    List<RankingMovie> selectByExample(RankingMovieExample example);

    RankingMovie selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RankingMovie record, @Param("example") RankingMovieExample example);

    int updateByExample(@Param("record") RankingMovie record, @Param("example") RankingMovieExample example);

    int updateByPrimaryKeySelective(RankingMovie record);

    int updateByPrimaryKey(RankingMovie record);
    
    List<RankingMovie> selectBySumExample(RankingMovieExample example);
    
    long countBySumExample(RankingMovieExample example);
}