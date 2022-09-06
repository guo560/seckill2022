package com.gsa.seckill2022.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestConntroller {

    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("name", "gsa");
        return "hello";
    }
}
