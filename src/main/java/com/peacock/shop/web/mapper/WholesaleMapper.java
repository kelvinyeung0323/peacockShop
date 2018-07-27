package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.Wholesale;
import com.peacock.shop.web.domain.WholesaleExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface WholesaleMapper {
    int countByExample(WholesaleExample example);

    int deleteByExample(WholesaleExample example);

    int deleteByPrimaryKey(Integer actId);

    int insert(Wholesale record);

    int insertSelective(Wholesale record);

    List<Wholesale> selectByExampleWithBLOBs(WholesaleExample example);

    List<Wholesale> selectByExample(WholesaleExample example);

    Wholesale selectByPrimaryKey(Integer actId);

    int updateByExampleSelective(@Param("record") Wholesale record, @Param("example") WholesaleExample example);

    int updateByExampleWithBLOBs(@Param("record") Wholesale record, @Param("example") WholesaleExample example);

    int updateByExample(@Param("record") Wholesale record, @Param("example") WholesaleExample example);

    int updateByPrimaryKeySelective(Wholesale record);

    int updateByPrimaryKeyWithBLOBs(Wholesale record);

    int updateByPrimaryKey(Wholesale record);
}