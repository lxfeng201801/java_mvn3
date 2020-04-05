package com.knowyou.cloud.sys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.knowyou.cloud.sys.model.mobilebox.UserInput;
import com.knowyou.cloud.sys.model.mobilebox.UserInputExample;

public interface UserInputMapper {
    long countByExample(UserInputExample example);

    int deleteByExample(UserInputExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserInput record);

    int insertSelective(UserInput record);

    List<UserInput> selectByExample(UserInputExample example);

    UserInput selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserInput record, @Param("example") UserInputExample example);

    int updateByExample(@Param("record") UserInput record, @Param("example") UserInputExample example);

    int updateByPrimaryKeySelective(UserInput record);

    int updateByPrimaryKey(UserInput record);
 
    UserInput selectBySumExample(UserInputExample example);
}