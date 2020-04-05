package com.knowyou.cloud.sys.dao;

import com.knowyou.cloud.sys.model.ParentModule;
import com.knowyou.cloud.sys.model.RoleModule;
import com.knowyou.cloud.sys.model.RoleModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleModuleMapper {
	long countByExample(RoleModuleExample example);

	int deleteByExample(RoleModuleExample example);

	int insert(RoleModule record);

	List<ParentModule> selectAllModule(RoleModule record);

	List<ParentModule> selectRoleModule(RoleModule record);
}