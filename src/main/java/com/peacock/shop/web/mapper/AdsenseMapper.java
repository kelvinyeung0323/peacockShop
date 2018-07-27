package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.Adsense;
import com.peacock.shop.web.domain.AdsenseExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface AdsenseMapper {
    int countByExample(AdsenseExample example);

    int deleteByExample(AdsenseExample example);

    int insert(Adsense record);

    int insertSelective(Adsense record);

    List<Adsense> selectByExample(AdsenseExample example);

    int updateByExampleSelective(@Param("record") Adsense record, @Param("example") AdsenseExample example);

    int updateByExample(@Param("record") Adsense record, @Param("example") AdsenseExample example);
}