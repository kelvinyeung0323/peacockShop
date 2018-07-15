package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.LinkGoods;
import com.peacock.shop.web.domain.LinkGoodsExample;
import com.peacock.shop.web.domain.LinkGoodsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LinkGoodsMapper {
    int countByExample(LinkGoodsExample example);

    int deleteByExample(LinkGoodsExample example);

    int deleteByPrimaryKey(LinkGoodsKey key);

    int insert(LinkGoods record);

    int insertSelective(LinkGoods record);

    List<LinkGoods> selectByExample(LinkGoodsExample example);

    LinkGoods selectByPrimaryKey(LinkGoodsKey key);

    int updateByExampleSelective(@Param("record") LinkGoods record, @Param("example") LinkGoodsExample example);

    int updateByExample(@Param("record") LinkGoods record, @Param("example") LinkGoodsExample example);

    int updateByPrimaryKeySelective(LinkGoods record);

    int updateByPrimaryKey(LinkGoods record);
}