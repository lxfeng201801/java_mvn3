package com.knowyou.cloud.sys.dao;

import com.knowyou.cloud.sys.model.mobilebox.VideoKaReson;
import com.knowyou.cloud.sys.model.mobilebox.VideoKaResonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VideoKaResonMapper {
    long countByExample(VideoKaResonExample example);

    int deleteByExample(VideoKaResonExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VideoKaReson record);

    int insertSelective(VideoKaReson record);

    List<VideoKaReson> selectByExample(VideoKaResonExample example);

    VideoKaReson selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VideoKaReson record, @Param("example") VideoKaResonExample example);

    int updateByExample(@Param("record") VideoKaReson record, @Param("example") VideoKaResonExample example);

    int updateByPrimaryKeySelective(VideoKaReson record);

    int updateByPrimaryKey(VideoKaReson record);
}