package com.neo.service;

import com.neo.entity.Tbagent;

/**
 * Created by Administrator on 2017/12/12.
 */
public interface getUserInfoByJobIdandIDcard {

      Tbagent getUserInfo(Integer jobNumber, String IDcard);

}
