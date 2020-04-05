package com.knowyou.cloud.sys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.knowyou.cloud.sys.model.mobilebox.VideoQuality;
import com.knowyou.cloud.sys.model.mobilebox.VideoQualityExample;

public interface VideoQualityMapper {
    long countByExample(VideoQualityExample example);

    int deleteByExample(VideoQualityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VideoQuality record);

    int insertSelective(VideoQuality record);

    List<VideoQuality> selectByExample(VideoQualityExample example);

    VideoQuality selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VideoQuality record, @Param("example") VideoQualityExample example);

    int updateByExample(@Param("record") VideoQuality record, @Param("example") VideoQualityExample example);

    int updateByPrimaryKeySelective(VideoQuality record);

    int updateByPrimaryKey(VideoQuality record);
    
    VideoQuality selectBySumExample(VideoQualityExample example);
}