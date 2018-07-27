package com.peacock.shop.web.service;

import com.peacock.shop.web.domain.ShopConfig;
import com.peacock.shop.web.domain.ShopConfigExample;
import com.peacock.shop.web.mapper.ShopConfigMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: kelvin
 * @Description
 * @Date: created in 下午4:32 2018/7/23
 * @Modified By:
 **/
@Component
public class ShopConfigService {

    @Autowired
    ShopConfigMapper shopConfigMapper;

    public Map<String,String> getShopConfigMap(){
        Map<String,String> cfg = new HashMap();
        ShopConfigExample example = new ShopConfigExample();
        List<ShopConfig> shopConfigList = shopConfigMapper.selectByExampleWithBLOBs(example);
        for(ShopConfig shopConfig:shopConfigList){
            cfg.put(shopConfig.getCode(),shopConfig.getValue());
        }
        return cfg;
    }
}
