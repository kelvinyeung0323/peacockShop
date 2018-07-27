package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.VirtualCard;
import com.peacock.shop.web.domain.VirtualCardExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface VirtualCardMapper {
    int countByExample(VirtualCardExample example);

    int deleteByExample(VirtualCardExample example);

    int deleteByPrimaryKey(Integer cardId);

    int insert(VirtualCard record);

    int insertSelective(VirtualCard record);

    List<VirtualCard> selectByExample(VirtualCardExample example);

    VirtualCard selectByPrimaryKey(Integer cardId);

    int updateByExampleSelective(@Param("record") VirtualCard record, @Param("example") VirtualCardExample example);

    int updateByExample(@Param("record") VirtualCard record, @Param("example") VirtualCardExample example);

    int updateByPrimaryKeySelective(VirtualCard record);

    int updateByPrimaryKey(VirtualCard record);
}