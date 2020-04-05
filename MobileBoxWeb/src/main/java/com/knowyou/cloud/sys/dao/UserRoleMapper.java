package com.knowyou.cloud.sys.dao;

import java.util.List;

import com.knowyou.cloud.sys.model.ParentModule;
import com.knowyou.cloud.sys.model.UserRole;
import com.knowyou.cloud.sys.model.UserRoleExample;

public interface UserRoleMapper {

	long countByExample(UserRoleExample example);

	int deleteByExample(UserRoleExample example);

	int insert(UserRole record);

	List<UserRole> selectAllRole(UserRole record);

	List<UserRole> selectUserRole(UserRole record);

	List<ParentModule> selectUserRoleModule(int id);
}