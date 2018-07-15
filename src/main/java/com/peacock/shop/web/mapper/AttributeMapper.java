package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.Attribute;
import com.peacock.shop.web.domain.AttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttributeMapper {
    int countByExample(AttributeExample example);

    int deleteByExample(AttributeExample example);

    int deleteByPrimaryKey(Short attrId);

    int insert(Attribute record);

    int insertSelective(Attribute record);

    List<Attribute> selectByExampleWithBLOBs(AttributeExample example);

    List<Attribute> selectByExample(AttributeExample example);

    Attribute selectByPrimaryKey(Short attrId);

    int updateByExampleSelective(@Param("record") Attribute record, @Param("example") AttributeExample example);

    int updateByExampleWithBLOBs(@Param("record") Attribute record, @Param("example") AttributeExample example);

    int updateByExample(@Param("record") Attribute record, @Param("example") AttributeExample example);

    int updateByPrimaryKeySelective(Attribute record);

    int updateByPrimaryKeyWithBLOBs(Attribute record);

    int updateByPrimaryKey(Attribute record);
}