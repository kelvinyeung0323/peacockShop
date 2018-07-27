package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.GroupGoods;
import com.peacock.shop.web.domain.GroupGoodsExample;
import com.peacock.shop.web.domain.GroupGoodsKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface GroupGoodsMapper {
    int countByExample(GroupGoodsExample example);

    int deleteByExample(GroupGoodsExample example);

    int deleteByPrimaryKey(GroupGoodsKey key);

    int insert(GroupGoods record);

    int insertSelective(GroupGoods record);

    List<GroupGoods> selectByExample(GroupGoodsExample example);

    GroupGoods selectByPrimaryKey(GroupGoodsKey key);

    int updateByExampleSelective(@Param("record") GroupGoods record, @Param("example") GroupGoodsExample example);

    int updateByExample(@Param("record") GroupGoods record, @Param("example") GroupGoodsExample example);

    int updateByPrimaryKeySelective(GroupGoods record);

    int updateByPrimaryKey(GroupGoods record);
}