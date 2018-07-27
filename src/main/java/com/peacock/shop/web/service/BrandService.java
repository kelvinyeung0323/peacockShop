package com.peacock.shop.web.service;

import com.peacock.shop.web.domain.Brand;
import com.peacock.shop.web.domain.BrandExample;
import com.peacock.shop.web.mapper.BrandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: kelvin
 * @Description
 * @Date: created in 下午5:05 2018/7/23
 * @Modified By:
 **/
@Component
public class BrandService {

    @Autowired
    protected BrandMapper brandMapper;

    public Brand getBrandById(Integer id){
        Brand brand = brandMapper.selectByPrimaryKey(id.shortValue());
        return brand;
    }
}
