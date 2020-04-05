package com.knowyou.cloud.sys.dao;

import com.knowyou.cloud.sys.model.mobilebox.Terminal;
import com.knowyou.cloud.sys.model.mobilebox.TerminalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TerminalMapper {
    long countByExample(TerminalExample example);

    int deleteByExample(TerminalExample example);

    int deleteByPrimaryKey(String id);

    int insert(Terminal record);

    int insertSelective(Terminal record);

    List<Terminal> selectByExample(TerminalExample example);

    Terminal selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Terminal record, @Param("example") TerminalExample example);

    int updateByExample(@Param("record") Terminal record, @Param("example") TerminalExample example);

    int updateByPrimaryKeySelective(Terminal record);

    int updateByPrimaryKey(Terminal record);
}