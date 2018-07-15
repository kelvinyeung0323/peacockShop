package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.DeliveryOrder;
import com.peacock.shop.web.domain.DeliveryOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeliveryOrderMapper {
    int countByExample(DeliveryOrderExample example);

    int deleteByExample(DeliveryOrderExample example);

    int deleteByPrimaryKey(Integer deliveryId);

    int insert(DeliveryOrder record);

    int insertSelective(DeliveryOrder record);

    List<DeliveryOrder> selectByExample(DeliveryOrderExample example);

    DeliveryOrder selectByPrimaryKey(Integer deliveryId);

    int updateByExampleSelective(@Param("record") DeliveryOrder record, @Param("example") DeliveryOrderExample example);

    int updateByExample(@Param("record") DeliveryOrder record, @Param("example") DeliveryOrderExample example);

    int updateByPrimaryKeySelective(DeliveryOrder record);

    int updateByPrimaryKey(DeliveryOrder record);
}