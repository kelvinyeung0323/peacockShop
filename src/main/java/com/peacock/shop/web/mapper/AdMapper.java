package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.Ad;
import com.peacock.shop.web.domain.AdExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AdMapper {
    int countByExample(AdExample example);

    int deleteByExample(AdExample example);

    int deleteByPrimaryKey(Short adId);

    int insert(Ad record);

    int insertSelective(Ad record);

    List<Ad> selectByExampleWithBLOBs(AdExample example);

    List<Ad> selectByExample(AdExample example);

    Ad selectByPrimaryKey(Short adId);

    int updateByExampleSelective(@Param("record") Ad record, @Param("example") AdExample example);

    int updateByExampleWithBLOBs(@Param("record") Ad record, @Param("example") AdExample example);

    int updateByExample(@Param("record") Ad record, @Param("example") AdExample example);

    int updateByPrimaryKeySelective(Ad record);

    int updateByPrimaryKeyWithBLOBs(Ad record);

    int updateByPrimaryKey(Ad record);
}