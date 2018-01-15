package com.jianyujianyu.controller;

import com.jianyujianyu.entity.User;
import com.jianyujianyu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lujianyu on 2018/1/15.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/index")
    public String index() {
        return "user/index";
    }

    @RequestMapping(value = "/show")
    @ResponseBody
    public String show(@RequestParam(value = "name") String name) {
        User user = userService.findUserByName(name);
        if (user != null) {
            return user.toString();
        } else {
            return "no user";
        }
    }
}
