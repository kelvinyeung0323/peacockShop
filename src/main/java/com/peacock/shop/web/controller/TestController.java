package com.peacock.shop.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kelvin Yeung on 2018/7/5.
 */
@Controller("/")
public class TestController {

    @RequestMapping("test")
    @ResponseBody
    public Object test() {
        Map<String, Object> map = new HashMap<>();
        map.put("status", "ok");
        map.put("msg", "测度");
        return map;
    }
}
