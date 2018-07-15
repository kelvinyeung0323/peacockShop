package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.ShopBind;
import com.peacock.shop.web.domain.ShopBindExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopBindMapper {
    int countByExample(ShopBindExample example);

    int deleteByExample(ShopBindExample example);

    int deleteByPrimaryKey(Integer shopId);

    int insert(ShopBind record);

    int insertSelective(ShopBind record);

    List<ShopBind> selectByExample(ShopBindExample example);

    ShopBind selectByPrimaryKey(Integer shopId);

    int updateByExampleSelective(@Param("record") ShopBind record, @Param("example") ShopBindExample example);

    int updateByExample(@Param("record") ShopBind record, @Param("example") ShopBindExample example);

    int updateByPrimaryKeySelective(ShopBind record);

    int updateByPrimaryKey(ShopBind record);
}