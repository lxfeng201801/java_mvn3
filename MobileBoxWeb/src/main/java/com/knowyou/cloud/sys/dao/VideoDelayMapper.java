package com.knowyou.cloud.sys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.knowyou.cloud.sys.model.mobilebox.VideoDelay;
import com.knowyou.cloud.sys.model.mobilebox.VideoDelayExample;

public interface VideoDelayMapper {
    long countByExample(VideoDelayExample example);

    int deleteByExample(VideoDelayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VideoDelay record);

    int insertSelective(VideoDelay record);

    List<VideoDelay> selectByExample(VideoDelayExample example);

    VideoDelay selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VideoDelay record, @Param("example") VideoDelayExample example);

    int updateByExample(@Param("record") VideoDelay record, @Param("example") VideoDelayExample example);

    int updateByPrimaryKeySelective(VideoDelay record);

    int updateByPrimaryKey(VideoDelay record);
    
    VideoDelay selectBySumExample(VideoDelayExample example);
}