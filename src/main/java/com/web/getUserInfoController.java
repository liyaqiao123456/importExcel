package com.web;

import com.neo.entity.Tbagent;
import com.neo.service.getUserInfoByJobIdandIDcard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.IntrospectorCleanupListener;

/**
 * Created by Administrator on 2017/12/12.
 */


@RestController
@RequestMapping("/user")
public class getUserInfoController {

    @Autowired
    private getUserInfoByJobIdandIDcard getUserInfoByJobIdandIDcardservice;


    @PostMapping("/userinfo")
    public Tbagent getUserInfo(@RequestParam(required = true,defaultValue = "jobnumber") Integer jobnumber,
                               @RequestParam(required = true,defaultValue = "idcard") String  idcard){
       return getUserInfoByJobIdandIDcardservice.getUserInfo(jobnumber,idcard);


    }

    @PostMapping("/info")
    public void getUserInfos(){

    }

}
