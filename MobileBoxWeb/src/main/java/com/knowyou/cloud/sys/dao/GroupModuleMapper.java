package com.knowyou.cloud.sys.dao;

import com.knowyou.cloud.sys.model.GroupModule;
import com.knowyou.cloud.sys.model.GroupModuleExample;
import com.knowyou.cloud.sys.model.ParentModule;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface GroupModuleMapper {
	long countByExample(GroupModuleExample example);

	int deleteByExample(GroupModuleExample example);

	int insert(GroupModule record);

	List<ParentModule> selectAllModule(@Param("gid") Integer gid);

	List<ParentModule> selectGroupModule(@Param("gid") Integer gid);
}