package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.AdPosition;
import com.peacock.shop.web.domain.AdPositionExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AdPositionMapper {
    int countByExample(AdPositionExample example);

    int deleteByExample(AdPositionExample example);

    int deleteByPrimaryKey(Byte positionId);

    int insert(AdPosition record);

    int insertSelective(AdPosition record);

    List<AdPosition> selectByExampleWithBLOBs(AdPositionExample example);

    List<AdPosition> selectByExample(AdPositionExample example);

    AdPosition selectByPrimaryKey(Byte positionId);

    int updateByExampleSelective(@Param("record") AdPosition record, @Param("example") AdPositionExample example);

    int updateByExampleWithBLOBs(@Param("record") AdPosition record, @Param("example") AdPositionExample example);

    int updateByExample(@Param("record") AdPosition record, @Param("example") AdPositionExample example);

    int updateByPrimaryKeySelective(AdPosition record);

    int updateByPrimaryKeyWithBLOBs(AdPosition record);

    int updateByPrimaryKey(AdPosition record);
}