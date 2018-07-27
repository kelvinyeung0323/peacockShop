package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.GoodsCatExample;
import com.peacock.shop.web.domain.GoodsCatKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface GoodsCatMapper {
    int countByExample(GoodsCatExample example);

    int deleteByExample(GoodsCatExample example);

    int deleteByPrimaryKey(GoodsCatKey key);

    int insert(GoodsCatKey record);

    int insertSelective(GoodsCatKey record);

    List<GoodsCatKey> selectByExample(GoodsCatExample example);

    int updateByExampleSelective(@Param("record") GoodsCatKey record, @Param("example") GoodsCatExample example);

    int updateByExample(@Param("record") GoodsCatKey record, @Param("example") GoodsCatExample example);
}