package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.SearchHistory;
import com.peacock.shop.web.domain.SearchHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SearchHistoryMapper {
    int countByExample(SearchHistoryExample example);

    int deleteByExample(SearchHistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SearchHistory record);

    int insertSelective(SearchHistory record);

    List<SearchHistory> selectByExample(SearchHistoryExample example);

    SearchHistory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SearchHistory record, @Param("example") SearchHistoryExample example);

    int updateByExample(@Param("record") SearchHistory record, @Param("example") SearchHistoryExample example);

    int updateByPrimaryKeySelective(SearchHistory record);

    int updateByPrimaryKey(SearchHistory record);
}