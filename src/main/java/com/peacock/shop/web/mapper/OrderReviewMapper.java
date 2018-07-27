package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.OrderReview;
import com.peacock.shop.web.domain.OrderReviewExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface OrderReviewMapper {
    int countByExample(OrderReviewExample example);

    int deleteByExample(OrderReviewExample example);

    int insert(OrderReview record);

    int insertSelective(OrderReview record);

    List<OrderReview> selectByExample(OrderReviewExample example);

    int updateByExampleSelective(@Param("record") OrderReview record, @Param("example") OrderReviewExample example);

    int updateByExample(@Param("record") OrderReview record, @Param("example") OrderReviewExample example);
}