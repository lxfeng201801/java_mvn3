package com.knowyou.cloud.sys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.knowyou.cloud.sys.model.mobilebox.VideoType;
import com.knowyou.cloud.sys.model.mobilebox.VideoTypeExample;

public interface VideoTypeMapper {
    long countByExample(VideoTypeExample example);

    int deleteByExample(VideoTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VideoType record);

    int insertSelective(VideoType record);

    List<VideoType> selectByExample(VideoTypeExample example);

    VideoType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VideoType record, @Param("example") VideoTypeExample example);

    int updateByExample(@Param("record") VideoType record, @Param("example") VideoTypeExample example);

    int updateByPrimaryKeySelective(VideoType record);

    int updateByPrimaryKey(VideoType record);
    
    List<VideoType> selectByHourExample(VideoTypeExample example);
    
    List<VideoType> selectByDayExample(VideoTypeExample example);
    
    List<VideoType> selectByMonthExample(VideoTypeExample example);
    
    VideoType selectBySumExample(VideoTypeExample example);
}