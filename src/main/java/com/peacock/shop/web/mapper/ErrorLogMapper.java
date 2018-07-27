package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.ErrorLog;
import com.peacock.shop.web.domain.ErrorLogExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ErrorLogMapper {
    int countByExample(ErrorLogExample example);

    int deleteByExample(ErrorLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ErrorLog record);

    int insertSelective(ErrorLog record);

    List<ErrorLog> selectByExample(ErrorLogExample example);

    ErrorLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ErrorLog record, @Param("example") ErrorLogExample example);

    int updateByExample(@Param("record") ErrorLog record, @Param("example") ErrorLogExample example);

    int updateByPrimaryKeySelective(ErrorLog record);

    int updateByPrimaryKey(ErrorLog record);
}