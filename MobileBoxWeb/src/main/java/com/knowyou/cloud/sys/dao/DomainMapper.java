package com.knowyou.cloud.sys.dao;

import com.knowyou.cloud.sys.model.Domain;
import com.knowyou.cloud.sys.model.DomainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DomainMapper {
    long countByExample(DomainExample example);

    int deleteByExample(DomainExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Domain record);

    int insertSelective(Domain record);

    List<Domain> selectByExample(DomainExample example);

    Domain selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Domain record, @Param("example") DomainExample example);

    int updateByExample(@Param("record") Domain record, @Param("example") DomainExample example);

    int updateByPrimaryKeySelective(Domain record);

    int updateByPrimaryKey(Domain record);
}