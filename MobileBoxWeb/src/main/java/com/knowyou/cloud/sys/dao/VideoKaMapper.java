package com.knowyou.cloud.sys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.knowyou.cloud.sys.model.mobilebox.VideoKa;
import com.knowyou.cloud.sys.model.mobilebox.VideoKaExample;

public interface VideoKaMapper {
    long countByExample(VideoKaExample example);

    int deleteByExample(VideoKaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VideoKa record);

    int insertSelective(VideoKa record);

    List<VideoKa> selectByExample(VideoKaExample example);

    VideoKa selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VideoKa record, @Param("example") VideoKaExample example);

    int updateByExample(@Param("record") VideoKa record, @Param("example") VideoKaExample example);

    int updateByPrimaryKeySelective(VideoKa record);

    int updateByPrimaryKey(VideoKa record);
    
    VideoKa selectBySumExample(VideoKaExample example);
}