package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.Nav;
import com.peacock.shop.web.domain.NavExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface NavMapper {
    int countByExample(NavExample example);

    int deleteByExample(NavExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Nav record);

    int insertSelective(Nav record);

    List<Nav> selectByExample(NavExample example);

    Nav selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Nav record, @Param("example") NavExample example);

    int updateByExample(@Param("record") Nav record, @Param("example") NavExample example);

    int updateByPrimaryKeySelective(Nav record);

    int updateByPrimaryKey(Nav record);
}