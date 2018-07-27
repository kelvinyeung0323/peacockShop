package com.peacock.shop.web.common;

import com.peacock.shop.web.domain.Ad;
import com.peacock.shop.web.domain.Nav;
import com.peacock.shop.web.service.AdService;
import com.peacock.shop.web.service.NavigationService;
import freemarker.core.Environment;
import freemarker.template.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by Kelvin Yeung on 2018/7/10.
 */
@Component
public class NavigationsDirectiveModel implements TemplateDirectiveModel {

    @Autowired
    private NavigationService navigationService;
    @Override
    public void execute(Environment environment, Map map, TemplateModel[] templateModels, TemplateDirectiveBody templateDirectiveBody) throws TemplateException, IOException {

        //中间导航
        List<Nav> pageHeaderNavs =navigationService.getPageHederNavigations();
        environment.setVariable("pageHeaderNavs", (new DefaultObjectWrapperBuilder(Configuration.VERSION_2_3_28)).build().wrap(pageHeaderNavs));
        templateDirectiveBody.render(environment.getOut());

    }
}
