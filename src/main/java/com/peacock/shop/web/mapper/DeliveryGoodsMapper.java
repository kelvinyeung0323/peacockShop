package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.DeliveryGoods;
import com.peacock.shop.web.domain.DeliveryGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeliveryGoodsMapper {
    int countByExample(DeliveryGoodsExample example);

    int deleteByExample(DeliveryGoodsExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(DeliveryGoods record);

    int insertSelective(DeliveryGoods record);

    List<DeliveryGoods> selectByExampleWithBLOBs(DeliveryGoodsExample example);

    List<DeliveryGoods> selectByExample(DeliveryGoodsExample example);

    DeliveryGoods selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") DeliveryGoods record, @Param("example") DeliveryGoodsExample example);

    int updateByExampleWithBLOBs(@Param("record") DeliveryGoods record, @Param("example") DeliveryGoodsExample example);

    int updateByExample(@Param("record") DeliveryGoods record, @Param("example") DeliveryGoodsExample example);

    int updateByPrimaryKeySelective(DeliveryGoods record);

    int updateByPrimaryKeyWithBLOBs(DeliveryGoods record);

    int updateByPrimaryKey(DeliveryGoods record);
}