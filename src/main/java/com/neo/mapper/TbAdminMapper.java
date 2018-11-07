package com.neo.mapper;

import com.neo.entity.TbAdmin;
import com.neo.entity.TbAdminCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAdminMapper {
    long countByExample(TbAdminCriteria example);

    int deleteByExample(TbAdminCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbAdmin record);

    int insertSelective(TbAdmin record);

    List<TbAdmin> selectByExample(TbAdminCriteria example);

    TbAdmin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbAdmin record, @Param("example") TbAdminCriteria example);

    int updateByExample(@Param("record") TbAdmin record, @Param("example") TbAdminCriteria example);

    int updateByPrimaryKeySelective(TbAdmin record);

    int updateByPrimaryKey(TbAdmin record);
}