package com.knowyou.cloud.sys.dao;

import com.knowyou.cloud.sys.model.mobilebox.RankingAudience;
import com.knowyou.cloud.sys.model.mobilebox.RankingAudienceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RankingAudienceMapper {
    long countByExample(RankingAudienceExample example);

    int deleteByExample(RankingAudienceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RankingAudience record);

    int insertSelective(RankingAudience record);

    List<RankingAudience> selectByExample(RankingAudienceExample example);

    RankingAudience selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RankingAudience record, @Param("example") RankingAudienceExample example);

    int updateByExample(@Param("record") RankingAudience record, @Param("example") RankingAudienceExample example);

    int updateByPrimaryKeySelective(RankingAudience record);

    int updateByPrimaryKey(RankingAudience record);
}