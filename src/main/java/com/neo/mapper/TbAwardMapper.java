package com.neo.mapper;

import com.neo.entity.TbAward;
import com.neo.entity.TbAwardCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAwardMapper {
    long countByExample(TbAwardCriteria example);

    int deleteByExample(TbAwardCriteria example);

    int deleteByPrimaryKey(Integer award_id);

    int insert(TbAward record);

    int insertSelective(TbAward record);

    List<TbAward> selectByExample(TbAwardCriteria example);

    TbAward selectByPrimaryKey(Integer award_id);

    int updateByExampleSelective(@Param("record") TbAward record, @Param("example") TbAwardCriteria example);

    int updateByExample(@Param("record") TbAward record, @Param("example") TbAwardCriteria example);

    int updateByPrimaryKeySelective(TbAward record);

    int updateByPrimaryKey(TbAward record);
}