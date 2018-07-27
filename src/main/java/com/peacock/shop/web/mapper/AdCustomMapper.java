package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.AdCustom;
import com.peacock.shop.web.domain.AdCustomExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface AdCustomMapper {
    int countByExample(AdCustomExample example);

    int deleteByExample(AdCustomExample example);

    int deleteByPrimaryKey(Integer adId);

    int insert(AdCustom record);

    int insertSelective(AdCustom record);

    List<AdCustom> selectByExampleWithBLOBs(AdCustomExample example);

    List<AdCustom> selectByExample(AdCustomExample example);

    AdCustom selectByPrimaryKey(Integer adId);

    int updateByExampleSelective(@Param("record") AdCustom record, @Param("example") AdCustomExample example);

    int updateByExampleWithBLOBs(@Param("record") AdCustom record, @Param("example") AdCustomExample example);

    int updateByExample(@Param("record") AdCustom record, @Param("example") AdCustomExample example);

    int updateByPrimaryKeySelective(AdCustom record);

    int updateByPrimaryKeyWithBLOBs(AdCustom record);

    int updateByPrimaryKey(AdCustom record);
}