package com.neo.service;

import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.DigestUtils;

/**
 * Created by Administrator on 2018/1/14.
 */
public interface IadminService {


    void AdminLogin(String adminUserName,String adminPass);

    boolean checkAdminUsername(String adminUsername,String adminPassword);



}
