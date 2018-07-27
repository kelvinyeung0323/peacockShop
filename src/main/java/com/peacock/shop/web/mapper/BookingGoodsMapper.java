package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.BookingGoods;
import com.peacock.shop.web.domain.BookingGoodsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BookingGoodsMapper {
    int countByExample(BookingGoodsExample example);

    int deleteByExample(BookingGoodsExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(BookingGoods record);

    int insertSelective(BookingGoods record);

    List<BookingGoods> selectByExample(BookingGoodsExample example);

    BookingGoods selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") BookingGoods record, @Param("example") BookingGoodsExample example);

    int updateByExample(@Param("record") BookingGoods record, @Param("example") BookingGoodsExample example);

    int updateByPrimaryKeySelective(BookingGoods record);

    int updateByPrimaryKey(BookingGoods record);
}