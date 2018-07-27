package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.OrderAction;
import com.peacock.shop.web.domain.OrderActionExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface OrderActionMapper {
    int countByExample(OrderActionExample example);

    int deleteByExample(OrderActionExample example);

    int deleteByPrimaryKey(Integer actionId);

    int insert(OrderAction record);

    int insertSelective(OrderAction record);

    List<OrderAction> selectByExample(OrderActionExample example);

    OrderAction selectByPrimaryKey(Integer actionId);

    int updateByExampleSelective(@Param("record") OrderAction record, @Param("example") OrderActionExample example);

    int updateByExample(@Param("record") OrderAction record, @Param("example") OrderActionExample example);

    int updateByPrimaryKeySelective(OrderAction record);

    int updateByPrimaryKey(OrderAction record);
}