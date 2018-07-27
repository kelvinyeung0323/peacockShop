package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.RegField;
import com.peacock.shop.web.domain.RegFieldExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface RegFieldMapper {
    int countByExample(RegFieldExample example);

    int deleteByExample(RegFieldExample example);

    int deleteByPrimaryKey(Byte id);

    int insert(RegField record);

    int insertSelective(RegField record);

    List<RegField> selectByExample(RegFieldExample example);

    RegField selectByPrimaryKey(Byte id);

    int updateByExampleSelective(@Param("record") RegField record, @Param("example") RegFieldExample example);

    int updateByExample(@Param("record") RegField record, @Param("example") RegFieldExample example);

    int updateByPrimaryKeySelective(RegField record);

    int updateByPrimaryKey(RegField record);
}