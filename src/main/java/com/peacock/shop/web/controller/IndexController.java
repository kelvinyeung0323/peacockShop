package com.peacock.shop.web.controller;

import com.peacock.shop.web.domain.Category;
import com.peacock.shop.web.domain.Goods;
import com.peacock.shop.web.domain.Nav;
import com.peacock.shop.web.service.CategoryService;
import com.peacock.shop.web.service.GoodsService;
import com.peacock.shop.web.service.NavigationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Kelvin Yeung on 2018/7/6.
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    private CategoryService categoryService;
    @Autowired
    private NavigationService navigationService;
    @Autowired
    private GoodsService goodsService;

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index(HttpServletRequest request, Model model) {
        //TODO:用户信息
        //model.addAttribute("", );
        //TODO:购物车信息
        //中间导航
        List<Nav> pageHeaderNavs =navigationService.getPageHederNavigations();
        model.addAttribute("pageHeaderNavs",pageHeaderNavs);

        //类目树
        List<Category> categories = categoryService.getCategoryTreeByParentId((short) 0);
        model.addAttribute("categories",categories);

        //一层商品
        List<Goods> firstFloorGoods = goodsService.getGoodsByCatId(26);
        model.addAttribute("firstFloorGoods",firstFloorGoods);
        //TODO:一层广告

        //二层商品
        List<Goods> secondFloorGoods = goodsService.getGoodsByCatId(24);
        model.addAttribute("secondFloorGoods",secondFloorGoods);
        //TODO:二层广告

        //三层商品
        List<Goods> thirdFloorGoods = goodsService.getGoodsByCatId(18);
        model.addAttribute("thirdFloorGoods",thirdFloorGoods);
        //TODO:三层广告

        //热销商品
        List<Goods> hotSaleGoods = goodsService.getGoodsByCatId(18);
        model.addAttribute("hotSaleGoods",hotSaleGoods);


        //TODO:底部导航

        return "index";
    }
}
