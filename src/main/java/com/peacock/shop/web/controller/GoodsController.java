package com.peacock.shop.web.controller;

import com.peacock.shop.web.domain.BonusType;
import com.peacock.shop.web.domain.Brand;
import com.peacock.shop.web.domain.Goods;
import com.peacock.shop.web.domain.VolumePrice;
import com.peacock.shop.web.service.BrandService;
import com.peacock.shop.web.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Created by Kelvin Yeung on 2018/7/12.
 */
@Controller
@RequestMapping("/")
public class GoodsController {

    @Autowired
    GoodsService goodsService;
    @Autowired
    BrandService brandService;

    @RequestMapping("/goods")
    public String goodsDetail(@RequestParam("id") Integer id, HttpServletRequest request,Model model){
        //TODO:商品相册
        //TODO:关联商品


        //商品信息
        Goods goods = goodsService.getGoodsById(id);
        if(null == goods){
            return "redirect:index";
        }

        //获取商品品牌
        Brand brand =brandService.getBrandById(goods.getBrandId().intValue());
        //累计销量
        Integer cumulativeSales =goodsService.getCumulativeSales(id);


        //TODO:获取用户级别rank 会员等级价格
        List<Map<String,Object>> rankPrices = goodsService.getUserRankPrice(id,goods.getShopPrice().doubleValue(),0);
        //取得商品优惠价格列表
        List<VolumePrice> volumePriceList = goodsService.getVolumePriceList(id,1);

        //购买该商品可以得到多少钱的红包
        BonusType bonusType = goodsService.getBonusTypeById(goods.getBonusTypeId().intValue());


        model.addAttribute("goods",goods);
        model.addAttribute("brand",brand);
        model.addAttribute("cumulativeSales",cumulativeSales);
        model.addAttribute("rankPrices",rankPrices);
        model.addAttribute("volumePriceList",volumePriceList);
        model.addAttribute("bonusType",bonusType);
        return "goods";
    }
}
