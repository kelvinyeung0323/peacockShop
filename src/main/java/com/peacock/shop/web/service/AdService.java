package com.peacock.shop.web.service;

import com.github.pagehelper.PageHelper;
import com.peacock.shop.web.common.Constants;
import com.peacock.shop.web.domain.Ad;
import com.peacock.shop.web.domain.AdExample;
import com.peacock.shop.web.domain.AdPosition;
import com.peacock.shop.web.mapper.AdMapper;
import com.peacock.shop.web.mapper.AdPositionMapper;
import com.peacock.shop.web.vo.AdVO;
import freemarker.template.utility.HtmlEscape;
import org.apache.commons.lang3.StringEscapeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Date;
import java.util.List;

import static com.peacock.shop.web.common.Constants.*;

/**
 * Created by Kelvin Yeung on 2018/7/7.
 */
@Component
public class AdService {

    @Autowired
    AdMapper adMapper;
    @Autowired
    AdPositionMapper adPositionMapper;

    public List<Ad> getAds(Integer positionId, Integer num) {
        if (null == num) {
            num = 1;
        }
        //TODO:因为ecshop是php写的，在数据库里的时间戳少了3位
        Long curTime = new Date().getTime()/1000;
        AdExample adExample = new AdExample();
        adExample.createCriteria().andEnabledEqualTo(AD_ENABLE).andStartTimeLessThanOrEqualTo(curTime.intValue())
                .andEndTimeGreaterThanOrEqualTo(curTime.intValue()).andPositionIdEqualTo(positionId.shortValue());
        PageHelper.offsetPage(0, num);
        List<Ad> ads = adMapper.selectByExampleWithBLOBs(adExample);
        for(Ad ad:ads){
            AdPosition adPosition = adPositionMapper.selectByPrimaryKey(ad.getPositionId().byteValue());
            if(null!=adPosition){
                ad.setAdWidth(adPosition.getAdWidth());
                ad.setAdHeight(adPosition.getAdHeight());
                ad.setPositionStyle(adPosition.getPositionStyle());
            }
        }

        return ads;
    }



}
