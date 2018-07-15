package com.peacock.shop.web.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * Created by Kelvin Yeung on 2018/7/6.
 */
@ControllerAdvice("com.peacock.shop.web.controller")
public class WebControllerAdvice {

    @ModelAttribute
    public void commonModel(Model model){
        //添加用户信息
        //添加pageTitle
        //添加
    }

}
