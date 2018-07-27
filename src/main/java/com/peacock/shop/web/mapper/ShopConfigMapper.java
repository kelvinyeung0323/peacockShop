package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.ShopConfig;
import com.peacock.shop.web.domain.ShopConfigExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ShopConfigMapper {
    int countByExample(ShopConfigExample example);

    int deleteByExample(ShopConfigExample example);

    int deleteByPrimaryKey(Short id);

    int insert(ShopConfig record);

    int insertSelective(ShopConfig record);

    List<ShopConfig> selectByExampleWithBLOBs(ShopConfigExample example);

    List<ShopConfig> selectByExample(ShopConfigExample example);

    ShopConfig selectByPrimaryKey(Short id);

    int updateByExampleSelective(@Param("record") ShopConfig record, @Param("example") ShopConfigExample example);

    int updateByExampleWithBLOBs(@Param("record") ShopConfig record, @Param("example") ShopConfigExample example);

    int updateByExample(@Param("record") ShopConfig record, @Param("example") ShopConfigExample example);

    int updateByPrimaryKeySelective(ShopConfig record);

    int updateByPrimaryKeyWithBLOBs(ShopConfig record);

    int updateByPrimaryKey(ShopConfig record);
}