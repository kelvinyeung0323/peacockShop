package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.ArticleCat;
import com.peacock.shop.web.domain.ArticleCatExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ArticleCatMapper {
    int countByExample(ArticleCatExample example);

    int deleteByExample(ArticleCatExample example);

    int deleteByPrimaryKey(Short catId);

    int insert(ArticleCat record);

    int insertSelective(ArticleCat record);

    List<ArticleCat> selectByExample(ArticleCatExample example);

    ArticleCat selectByPrimaryKey(Short catId);

    int updateByExampleSelective(@Param("record") ArticleCat record, @Param("example") ArticleCatExample example);

    int updateByExample(@Param("record") ArticleCat record, @Param("example") ArticleCatExample example);

    int updateByPrimaryKeySelective(ArticleCat record);

    int updateByPrimaryKey(ArticleCat record);
}