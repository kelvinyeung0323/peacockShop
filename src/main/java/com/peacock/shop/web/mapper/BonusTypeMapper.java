package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.BonusType;
import com.peacock.shop.web.domain.BonusTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BonusTypeMapper {
    int countByExample(BonusTypeExample example);

    int deleteByExample(BonusTypeExample example);

    int deleteByPrimaryKey(Short typeId);

    int insert(BonusType record);

    int insertSelective(BonusType record);

    List<BonusType> selectByExample(BonusTypeExample example);

    BonusType selectByPrimaryKey(Short typeId);

    int updateByExampleSelective(@Param("record") BonusType record, @Param("example") BonusTypeExample example);

    int updateByExample(@Param("record") BonusType record, @Param("example") BonusTypeExample example);

    int updateByPrimaryKeySelective(BonusType record);

    int updateByPrimaryKey(BonusType record);
}