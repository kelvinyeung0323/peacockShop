package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.CollectGoods;
import com.peacock.shop.web.domain.CollectGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CollectGoodsMapper {
    int countByExample(CollectGoodsExample example);

    int deleteByExample(CollectGoodsExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(CollectGoods record);

    int insertSelective(CollectGoods record);

    List<CollectGoods> selectByExample(CollectGoodsExample example);

    CollectGoods selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") CollectGoods record, @Param("example") CollectGoodsExample example);

    int updateByExample(@Param("record") CollectGoods record, @Param("example") CollectGoodsExample example);

    int updateByPrimaryKeySelective(CollectGoods record);

    int updateByPrimaryKey(CollectGoods record);
}