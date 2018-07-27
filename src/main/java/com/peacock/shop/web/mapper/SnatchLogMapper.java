package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.SnatchLog;
import com.peacock.shop.web.domain.SnatchLogExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SnatchLogMapper {
    int countByExample(SnatchLogExample example);

    int deleteByExample(SnatchLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(SnatchLog record);

    int insertSelective(SnatchLog record);

    List<SnatchLog> selectByExample(SnatchLogExample example);

    SnatchLog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") SnatchLog record, @Param("example") SnatchLogExample example);

    int updateByExample(@Param("record") SnatchLog record, @Param("example") SnatchLogExample example);

    int updateByPrimaryKeySelective(SnatchLog record);

    int updateByPrimaryKey(SnatchLog record);
}