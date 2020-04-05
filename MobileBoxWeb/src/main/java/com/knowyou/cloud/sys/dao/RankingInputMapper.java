package com.knowyou.cloud.sys.dao;

import com.knowyou.cloud.sys.model.mobilebox.RankingInput;
import com.knowyou.cloud.sys.model.mobilebox.RankingInputExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RankingInputMapper {
    long countByExample(RankingInputExample example);

    int deleteByExample(RankingInputExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RankingInput record);

    int insertSelective(RankingInput record);

    List<RankingInput> selectByExample(RankingInputExample example);

    RankingInput selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RankingInput record, @Param("example") RankingInputExample example);

    int updateByExample(@Param("record") RankingInput record, @Param("example") RankingInputExample example);

    int updateByPrimaryKeySelective(RankingInput record);

    int updateByPrimaryKey(RankingInput record);
    
    List<RankingInput> selectByTitleExample(RankingInputExample example);
    
}