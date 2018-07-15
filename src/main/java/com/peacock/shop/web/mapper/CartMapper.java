package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.Cart;
import com.peacock.shop.web.domain.CartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CartMapper {
    int countByExample(CartExample example);

    int deleteByExample(CartExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(Cart record);

    int insertSelective(Cart record);

    List<Cart> selectByExampleWithBLOBs(CartExample example);

    List<Cart> selectByExample(CartExample example);

    Cart selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") Cart record, @Param("example") CartExample example);

    int updateByExampleWithBLOBs(@Param("record") Cart record, @Param("example") CartExample example);

    int updateByExample(@Param("record") Cart record, @Param("example") CartExample example);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKeyWithBLOBs(Cart record);

    int updateByPrimaryKey(Cart record);
}