package com.neo.web;

import java.math.BigDecimal;
import java.util.List;

import com.neo.entity.Tbagent;
import com.neo.enums.ResultEnum;
import com.neo.service.IimportService;
import com.neo.service.getUserInfoByJobIdandIDcard;
import com.neo.util.ResultVoUtil;
import com.neo.vo.ResultVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.neo.entity.UserEntity;
import com.neo.mapper.UserMapper;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
@ComponentScan("com.neo")
public class UserController {
	

    @Autowired private getUserInfoByJobIdandIDcard getUserInfoByJobIdandIDcardservice;

    @Autowired private IimportService iimportService;


    /**
     * 获取用户信息
     * @param jobnumber
     * @param idcard
     * @return
     */
    @PostMapping("/userinfo")
    @ResponseBody
    public ResultVo<Tbagent> getUserInfo(@RequestParam(required = true) Integer jobnumber,
                                @RequestParam(required = true) String  idcard){

        Tbagent tbagent = getUserInfoByJobIdandIDcardservice.getUserInfo(jobnumber,idcard);
        BigDecimal.valueOf(tbagent.getDistance_first_company()).setScale(0,BigDecimal.ROUND_HALF_UP).doubleValue();
       tbagent.setDistance_first_company(BigDecimal.valueOf(tbagent.getDistance_first_company()).setScale(0,BigDecimal.ROUND_HALF_UP).longValue());
        tbagent.setDistance_first_department(BigDecimal.valueOf(tbagent.getDistance_first_department()).setScale(0,BigDecimal.ROUND_HALF_UP).longValue());
        tbagent.setDistance_first_region(BigDecimal.valueOf(tbagent.getDistance_first_region()).setScale(0,BigDecimal.ROUND_HALF_UP).longValue());
        if(tbagent == null){
            return ResultVoUtil.error(ResultEnum.PARAMETER_ERROR);
        }
        return  ResultVoUtil.success(tbagent);
    }
    //  Excel导入数据到数据库
    @PostMapping("/importExcel")
    public String importExcel(@RequestParam("myfile")MultipartFile myFile){
        ModelAndView modelAndView = new ModelAndView();

        Integer nums = iimportService.importExcel(myFile);
         modelAndView.addObject("msg","导入数成功");
        return "home";
    }

}


