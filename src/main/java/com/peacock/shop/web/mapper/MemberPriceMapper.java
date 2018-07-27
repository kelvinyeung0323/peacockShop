package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.MemberPrice;
import com.peacock.shop.web.domain.MemberPriceExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface MemberPriceMapper {
    int countByExample(MemberPriceExample example);

    int deleteByExample(MemberPriceExample example);

    int deleteByPrimaryKey(Integer priceId);

    int insert(MemberPrice record);

    int insertSelective(MemberPrice record);

    List<MemberPrice> selectByExample(MemberPriceExample example);

    MemberPrice selectByPrimaryKey(Integer priceId);

    int updateByExampleSelective(@Param("record") MemberPrice record, @Param("example") MemberPriceExample example);

    int updateByExample(@Param("record") MemberPrice record, @Param("example") MemberPriceExample example);

    int updateByPrimaryKeySelective(MemberPrice record);

    int updateByPrimaryKey(MemberPrice record);
}