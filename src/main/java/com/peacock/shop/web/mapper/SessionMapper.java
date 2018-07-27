package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.Session;
import com.peacock.shop.web.domain.SessionExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SessionMapper {
    int countByExample(SessionExample example);

    int deleteByExample(SessionExample example);

    int deleteByPrimaryKey(String sesskey);

    int insert(Session record);

    int insertSelective(Session record);

    List<Session> selectByExample(SessionExample example);

    Session selectByPrimaryKey(String sesskey);

    int updateByExampleSelective(@Param("record") Session record, @Param("example") SessionExample example);

    int updateByExample(@Param("record") Session record, @Param("example") SessionExample example);

    int updateByPrimaryKeySelective(Session record);

    int updateByPrimaryKey(Session record);
}