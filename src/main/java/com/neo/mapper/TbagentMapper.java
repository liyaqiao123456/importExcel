package com.neo.mapper;

import com.neo.entity.Tbagent;
import com.neo.entity.TbagentCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbagentMapper {
    long countByExample(TbagentCriteria example);

    int deleteByExample(TbagentCriteria example);

    int deleteByPrimaryKey(Integer job_number);

    int insert(Tbagent record);

    int insertSelective(Tbagent record);

    List<Tbagent> selectByExample(TbagentCriteria example);

    Tbagent selectByPrimaryKey(Integer job_number);

    int updateByExampleSelective(@Param("record") Tbagent record, @Param("example") TbagentCriteria example);

    int updateByExample(@Param("record") Tbagent record, @Param("example") TbagentCriteria example);

    int updateByPrimaryKeySelective(Tbagent record);

    int updateByPrimaryKey(Tbagent record);
}