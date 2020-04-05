package com.knowyou.cloud.sys.dao;

import com.knowyou.cloud.sys.model.mobilebox.IndexKey;
import com.knowyou.cloud.sys.model.mobilebox.IndexKeyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndexKeyMapper {
	long countByExample(IndexKeyExample example);

	int deleteByExample(IndexKeyExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(IndexKey record);

	int insertSelective(IndexKey record);

	List<IndexKey> selectByExample(IndexKeyExample example);

	IndexKey selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") IndexKey record, @Param("example") IndexKeyExample example);

	int updateByExample(@Param("record") IndexKey record, @Param("example") IndexKeyExample example);

	int updateByPrimaryKeySelective(IndexKey record);

	int updateByPrimaryKey(IndexKey record);

	IndexKey GetInde(String key);
	
	int update(IndexKey record);
}