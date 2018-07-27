package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.stats;
import com.peacock.shop.web.domain.statsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface statsMapper {
    int countByExample(statsExample example);

    int deleteByExample(statsExample example);

    int insert(stats record);

    int insertSelective(stats record);

    List<stats> selectByExample(statsExample example);

    int updateByExampleSelective(@Param("record") stats record, @Param("example") statsExample example);

    int updateByExample(@Param("record") stats record, @Param("example") statsExample example);
}