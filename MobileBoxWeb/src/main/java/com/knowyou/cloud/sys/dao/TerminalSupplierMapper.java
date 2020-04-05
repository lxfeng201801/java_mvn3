package com.knowyou.cloud.sys.dao;

import com.knowyou.cloud.sys.model.mobilebox.TerminalSupplier;
import com.knowyou.cloud.sys.model.mobilebox.TerminalSupplierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TerminalSupplierMapper {
    long countByExample(TerminalSupplierExample example);

    int deleteByExample(TerminalSupplierExample example);

    int deleteByPrimaryKey(String sn);

    int insert(TerminalSupplier record);

    int insertSelective(TerminalSupplier record);

    List<TerminalSupplier> selectByExample(TerminalSupplierExample example);

    TerminalSupplier selectByPrimaryKey(String sn);

    int updateByExampleSelective(@Param("record") TerminalSupplier record, @Param("example") TerminalSupplierExample example);

    int updateByExample(@Param("record") TerminalSupplier record, @Param("example") TerminalSupplierExample example);

    int updateByPrimaryKeySelective(TerminalSupplier record);

    int updateByPrimaryKey(TerminalSupplier record);
}