package com.gsa.seckill2022.controller;


import com.gsa.seckill2022.service.IUserService;
import com.gsa.seckill2022.service.impl.UserServiceImpl;
import com.gsa.seckill2022.vo.LoginVo;
import com.gsa.seckill2022.vo.ResponseBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
@Slf4j
public class LoginController {

    @Autowired
    private IUserService userService;
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/doLogin")
    @ResponseBody
    public ResponseBean doLogin(LoginVo loginVo){
        return userService.doLogin(loginVo);
    }
}
