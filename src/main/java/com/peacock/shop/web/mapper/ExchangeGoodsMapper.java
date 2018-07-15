package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.ExchangeGoods;
import com.peacock.shop.web.domain.ExchangeGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExchangeGoodsMapper {
    int countByExample(ExchangeGoodsExample example);

    int deleteByExample(ExchangeGoodsExample example);

    int deleteByPrimaryKey(Integer goodsId);

    int insert(ExchangeGoods record);

    int insertSelective(ExchangeGoods record);

    List<ExchangeGoods> selectByExample(ExchangeGoodsExample example);

    ExchangeGoods selectByPrimaryKey(Integer goodsId);

    int updateByExampleSelective(@Param("record") ExchangeGoods record, @Param("example") ExchangeGoodsExample example);

    int updateByExample(@Param("record") ExchangeGoods record, @Param("example") ExchangeGoodsExample example);

    int updateByPrimaryKeySelective(ExchangeGoods record);

    int updateByPrimaryKey(ExchangeGoods record);
}