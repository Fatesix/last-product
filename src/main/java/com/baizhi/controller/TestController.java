package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/test")
    @ResponseBody
    public User queryTest() {
        return userMapper.selectByPrimaryKey(999);
    }

    ;

    @RequestMapping("/jsp")
    public String testJsp() {
        System.out.println("github");
        return "index";
    }

}
