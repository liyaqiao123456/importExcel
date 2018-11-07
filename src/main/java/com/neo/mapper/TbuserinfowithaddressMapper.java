package com.neo.mapper;

import com.neo.entity.TbUserinfoWithAddress;
import com.neo.entity.userinfoDto;

import java.util.List;

/**
 * Created by Administrator on 2017/12/12.
 */
public interface TbuserinfowithaddressMapper {

//    List<TbUserinfoWithAddress> getUserinfo(Integer job_number);

    userinfoDto getUserinfo(Integer job_number);
}
