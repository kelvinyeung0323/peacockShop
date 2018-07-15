package com.peacock.shop.web.service;

import com.peacock.shop.web.domain.Nav;
import com.peacock.shop.web.domain.NavExample;
import com.peacock.shop.web.mapper.NavMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Kelvin Yeung on 2018/7/9.
 */
@Component
public class NavigationService {

    @Autowired
    private NavMapper navMapper;

    public List<Nav> getPageHederNavigations() {
        NavExample example = new NavExample();
        example.or().andIfshowEqualTo(true).andTypeEqualTo("middle");
        example.setOrderByClause("type,vieworder");
        List<Nav> navs = navMapper.selectByExample(example);
        return navs;
    }
}
