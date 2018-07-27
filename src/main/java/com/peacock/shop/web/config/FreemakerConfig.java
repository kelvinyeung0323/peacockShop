package com.peacock.shop.web.config;

import com.peacock.shop.web.common.AdListDirectiveModel;
import com.peacock.shop.web.common.FreemarkerURLEncoder;
import com.peacock.shop.web.common.NavigationsDirectiveModel;
import com.peacock.shop.web.common.ShopConfigDirectiveModel;
import freemarker.template.TemplateModelException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * Created by Kelvin Yeung on 2018/7/10.
 */
@Configuration
public class FreemakerConfig {


    @Value("${web.data.dir}")
    private String DATA_DIR;
    @Autowired
    protected freemarker.template.Configuration configuration;
    @Autowired
    protected AdListDirectiveModel adListDirectiveModel;
    @Autowired
    protected NavigationsDirectiveModel navigationsDirectiveModel;

    @Autowired
    protected FreemarkerURLEncoder freemakerURLEncoder;
//    @Autowired
//    protected ShopConfigDirectiveModel shopConfigDirectiveModel;
    @PostConstruct
    public void setSharedVariable() throws TemplateModelException {
        // adList即为页面上调用的标签名
        configuration.setSharedVariable("urlEncode",freemakerURLEncoder);
        configuration.setSharedVariable("DATA_DIR", DATA_DIR);
        configuration.setSharedVariable("adDirectiveModel", adListDirectiveModel);
        configuration.setSharedVariable("navigationsDirectiveModel",navigationsDirectiveModel);
//        configuration.setSharedVariable("cfg",shopConfigDirectiveModel);
    }
}
