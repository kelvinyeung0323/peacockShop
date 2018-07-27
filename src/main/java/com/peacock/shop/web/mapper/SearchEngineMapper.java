package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.SearchEngine;
import com.peacock.shop.web.domain.SearchEngineExample;
import com.peacock.shop.web.domain.SearchEngineKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SearchEngineMapper {
    int countByExample(SearchEngineExample example);

    int deleteByExample(SearchEngineExample example);

    int deleteByPrimaryKey(SearchEngineKey key);

    int insert(SearchEngine record);

    int insertSelective(SearchEngine record);

    List<SearchEngine> selectByExample(SearchEngineExample example);

    SearchEngine selectByPrimaryKey(SearchEngineKey key);

    int updateByExampleSelective(@Param("record") SearchEngine record, @Param("example") SearchEngineExample example);

    int updateByExample(@Param("record") SearchEngine record, @Param("example") SearchEngineExample example);

    int updateByPrimaryKeySelective(SearchEngine record);

    int updateByPrimaryKey(SearchEngine record);
}