package com.neo.web;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.neo.entity.TbAdmin;
import com.neo.enums.ResultEnum;
import com.neo.service.IadminService;
import com.neo.service.servicesimpl.AdminLoginServiceImpl;
import com.neo.util.ResultVoUtil;
import com.neo.vo.ResultVo;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/14.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired private IadminService iadminService;

    @RequestMapping("/login")
    public String  adminLogin(HttpServletRequest request, HttpServletResponse response,
                                        HttpSession session,
                                        Map<String,String> modelAndView,
                                        @RequestParam(value = "username")String username,
                                        @RequestParam(value = "password")String password)
    {
          if(iadminService.checkAdminUsername(username,password)){

             return "home";
          }
        return "";
    }

    @GetMapping("/index")
    public String indexPage(){
          return "login";
    }
}
