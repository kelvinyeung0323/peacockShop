package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.GoodsArticleExample;
import com.peacock.shop.web.domain.GoodsArticleKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface GoodsArticleMapper {
    int countByExample(GoodsArticleExample example);

    int deleteByExample(GoodsArticleExample example);

    int deleteByPrimaryKey(GoodsArticleKey key);

    int insert(GoodsArticleKey record);

    int insertSelective(GoodsArticleKey record);

    List<GoodsArticleKey> selectByExample(GoodsArticleExample example);

    int updateByExampleSelective(@Param("record") GoodsArticleKey record, @Param("example") GoodsArticleExample example);

    int updateByExample(@Param("record") GoodsArticleKey record, @Param("example") GoodsArticleExample example);
}