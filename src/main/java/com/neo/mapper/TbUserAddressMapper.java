package com.neo.mapper;

import com.neo.entity.TbUserAddress;
import com.neo.entity.TbUserAddressCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbUserAddressMapper {
    long countByExample(TbUserAddressCriteria example);

    int deleteByExample(TbUserAddressCriteria example);

    int deleteByPrimaryKey(Integer address_id);

    int insert(TbUserAddress record);

    int insertSelective(TbUserAddress record);

    List<TbUserAddress> selectByExample(TbUserAddressCriteria example);

    TbUserAddress selectByPrimaryKey(Integer address_id);

    int updateByExampleSelective(@Param("record") TbUserAddress record, @Param("example") TbUserAddressCriteria example);

    int updateByExample(@Param("record") TbUserAddress record, @Param("example") TbUserAddressCriteria example);

    int updateByPrimaryKeySelective(TbUserAddress record);

    int updateByPrimaryKey(TbUserAddress record);
}