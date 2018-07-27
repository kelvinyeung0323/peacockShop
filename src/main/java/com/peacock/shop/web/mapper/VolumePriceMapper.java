package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.VolumePrice;
import com.peacock.shop.web.domain.VolumePriceExample;
import com.peacock.shop.web.domain.VolumePriceKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VolumePriceMapper {
    int countByExample(VolumePriceExample example);

    int deleteByExample(VolumePriceExample example);

    int deleteByPrimaryKey(VolumePriceKey key);

    int insert(VolumePrice record);

    int insertSelective(VolumePrice record);

    List<VolumePrice> selectByExample(VolumePriceExample example);

    VolumePrice selectByPrimaryKey(VolumePriceKey key);

    int updateByExampleSelective(@Param("record") VolumePrice record, @Param("example") VolumePriceExample example);

    int updateByExample(@Param("record") VolumePrice record, @Param("example") VolumePriceExample example);

    int updateByPrimaryKeySelective(VolumePrice record);

    int updateByPrimaryKey(VolumePrice record);
}