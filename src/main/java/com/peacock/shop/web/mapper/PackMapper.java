package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.Pack;
import com.peacock.shop.web.domain.PackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PackMapper {
    int countByExample(PackExample example);

    int deleteByExample(PackExample example);

    int deleteByPrimaryKey(Byte packId);

    int insert(Pack record);

    int insertSelective(Pack record);

    List<Pack> selectByExample(PackExample example);

    Pack selectByPrimaryKey(Byte packId);

    int updateByExampleSelective(@Param("record") Pack record, @Param("example") PackExample example);

    int updateByExample(@Param("record") Pack record, @Param("example") PackExample example);

    int updateByPrimaryKeySelective(Pack record);

    int updateByPrimaryKey(Pack record);
}