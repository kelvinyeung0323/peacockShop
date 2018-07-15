package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.Shipping;
import com.peacock.shop.web.domain.ShippingExample;
import com.peacock.shop.web.domain.ShippingWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShippingMapper {
    int countByExample(ShippingExample example);

    int deleteByExample(ShippingExample example);

    int deleteByPrimaryKey(Byte shippingId);

    int insert(ShippingWithBLOBs record);

    int insertSelective(ShippingWithBLOBs record);

    List<ShippingWithBLOBs> selectByExampleWithBLOBs(ShippingExample example);

    List<Shipping> selectByExample(ShippingExample example);

    ShippingWithBLOBs selectByPrimaryKey(Byte shippingId);

    int updateByExampleSelective(@Param("record") ShippingWithBLOBs record, @Param("example") ShippingExample example);

    int updateByExampleWithBLOBs(@Param("record") ShippingWithBLOBs record, @Param("example") ShippingExample example);

    int updateByExample(@Param("record") Shipping record, @Param("example") ShippingExample example);

    int updateByPrimaryKeySelective(ShippingWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ShippingWithBLOBs record);

    int updateByPrimaryKey(Shipping record);
}