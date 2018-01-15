package com.jianyujianyu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lujianyu on 2018/1/15.
 */
@Controller
public class SampleController {

    @RequestMapping(value = "/")
    @ResponseBody
    public String index() {
        return "Heeeeeee";
    }

}
