package com.peacock.shop.web.common;

import com.peacock.shop.web.domain.Ad;
import com.peacock.shop.web.exception.PeacockException;
import com.peacock.shop.web.service.AdService;
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
public class AdListDirectiveModel implements TemplateDirectiveModel {
    @Autowired
    private AdService adService;
    @Override
    public void execute(Environment environment, Map map, TemplateModel[] templateModels, TemplateDirectiveBody templateDirectiveBody) throws TemplateException, IOException {

        List<Ad> adList = null;
        Integer num;
        if(map.containsKey("num")&& map.get("num")!=null){
            num = Integer.valueOf(map.get("num").toString());
        }else{
            num = 1;
        }
        if(map.containsKey("positionId")&&map.get("positionId")!=null){
            Integer positionId = Integer.valueOf(map.get("positionId").toString());
            adList =adService.getAds(positionId,num);
        }
        environment.setVariable("adList", (new DefaultObjectWrapperBuilder(Configuration.VERSION_2_3_28)).build().wrap(adList));
        templateDirectiveBody.render(environment.getOut());

    }
}
