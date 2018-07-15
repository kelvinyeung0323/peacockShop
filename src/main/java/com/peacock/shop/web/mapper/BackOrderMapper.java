package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.BackOrder;
import com.peacock.shop.web.domain.BackOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BackOrderMapper {
    int countByExample(BackOrderExample example);

    int deleteByExample(BackOrderExample example);

    int deleteByPrimaryKey(Integer backId);

    int insert(BackOrder record);

    int insertSelective(BackOrder record);

    List<BackOrder> selectByExample(BackOrderExample example);

    BackOrder selectByPrimaryKey(Integer backId);

    int updateByExampleSelective(@Param("record") BackOrder record, @Param("example") BackOrderExample example);

    int updateByExample(@Param("record") BackOrder record, @Param("example") BackOrderExample example);

    int updateByPrimaryKeySelective(BackOrder record);

    int updateByPrimaryKey(BackOrder record);
}