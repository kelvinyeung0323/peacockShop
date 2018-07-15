package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.CatRecommendExample;
import com.peacock.shop.web.domain.CatRecommendKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CatRecommendMapper {
    int countByExample(CatRecommendExample example);

    int deleteByExample(CatRecommendExample example);

    int deleteByPrimaryKey(CatRecommendKey key);

    int insert(CatRecommendKey record);

    int insertSelective(CatRecommendKey record);

    List<CatRecommendKey> selectByExample(CatRecommendExample example);

    int updateByExampleSelective(@Param("record") CatRecommendKey record, @Param("example") CatRecommendExample example);

    int updateByExample(@Param("record") CatRecommendKey record, @Param("example") CatRecommendExample example);
}