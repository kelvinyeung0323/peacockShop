package com.peacock.shop.web.controller;

import com.peacock.shop.web.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Kelvin Yeung on 2018/7/12.
 */
@Controller
@RequestMapping("/")
public class GoodsController {

    @Autowired
    GoodsService goodsService;

    @RequestMapping("/goods")
    public String goodsDetail(@RequestParam("id") Integer id, HttpServletRequest request,Model model){


        return "goods";
    }
}
