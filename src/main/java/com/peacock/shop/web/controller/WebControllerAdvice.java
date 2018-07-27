package com.peacock.shop.web.controller;

import com.peacock.shop.web.service.ShopConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Map;

/**
 * Created by Kelvin Yeung on 2018/7/6.
 */
@ControllerAdvice("com.peacock.shop.web.controller")
public class WebControllerAdvice {

    @Autowired
    protected ShopConfigService shopConfigService;
    @ModelAttribute
    public void commonModel(Model model){
        //添加用户信息
        //添加pageTitle
        //添加

        Map<String,String> cfg = shopConfigService.getShopConfigMap();
        model.addAttribute("cfg",cfg);
    }

}
