package com.peacock.shop.web.common;

import com.peacock.shop.web.domain.Nav;
import com.peacock.shop.web.service.NavigationService;
import com.peacock.shop.web.service.ShopConfigService;
import freemarker.core.Environment;
import freemarker.template.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @Author: kelvin
 * @Description
 * @Date: created in 下午4:41 2018/7/23
 * @Modified By:
 **/
public class ShopConfigDirectiveModel implements TemplateDirectiveModel {

    @Autowired
    private ShopConfigService shopConfigService;
    @Override
    public void execute(Environment environment, Map map, TemplateModel[] templateModels, TemplateDirectiveBody templateDirectiveBody) throws TemplateException, IOException {


        Map<String,String> cfg =shopConfigService.getShopConfigMap();
        environment.setVariable("cfg", (new DefaultObjectWrapperBuilder(Configuration.VERSION_2_3_28)).build().wrap(cfg));
        templateDirectiveBody.render(environment.getOut());

    }
}
