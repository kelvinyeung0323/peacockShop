package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.SessionData;
import com.peacock.shop.web.domain.SessionDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SessionDataMapper {
    int countByExample(SessionDataExample example);

    int deleteByExample(SessionDataExample example);

    int deleteByPrimaryKey(String sesskey);

    int insert(SessionData record);

    int insertSelective(SessionData record);

    List<SessionData> selectByExampleWithBLOBs(SessionDataExample example);

    List<SessionData> selectByExample(SessionDataExample example);

    SessionData selectByPrimaryKey(String sesskey);

    int updateByExampleSelective(@Param("record") SessionData record, @Param("example") SessionDataExample example);

    int updateByExampleWithBLOBs(@Param("record") SessionData record, @Param("example") SessionDataExample example);

    int updateByExample(@Param("record") SessionData record, @Param("example") SessionDataExample example);

    int updateByPrimaryKeySelective(SessionData record);

    int updateByPrimaryKeyWithBLOBs(SessionData record);

    int updateByPrimaryKey(SessionData record);
}