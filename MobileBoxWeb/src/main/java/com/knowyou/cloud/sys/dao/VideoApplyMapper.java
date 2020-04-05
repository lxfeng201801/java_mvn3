package com.knowyou.cloud.sys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.knowyou.cloud.sys.model.mobilebox.VideoApply;
import com.knowyou.cloud.sys.model.mobilebox.VideoApplyExample;

public interface VideoApplyMapper {
	long countByExample(VideoApplyExample example);

	int deleteByExample(VideoApplyExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(VideoApply record);

	int insertSelective(VideoApply record);

	List<VideoApply> selectByExample(VideoApplyExample example);

	VideoApply selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") VideoApply record, @Param("example") VideoApplyExample example);

	int updateByExample(@Param("record") VideoApply record, @Param("example") VideoApplyExample example);

	int updateByPrimaryKeySelective(VideoApply record);

	int updateByPrimaryKey(VideoApply record);

	List<VideoApply> selectByExampleGroupName(VideoApplyExample example);

	List<VideoApply> selectByHourExample(VideoApplyExample example);

	List<VideoApply> selectByDayExample(VideoApplyExample example);

	List<VideoApply> selectByMonthExample(VideoApplyExample example);

}