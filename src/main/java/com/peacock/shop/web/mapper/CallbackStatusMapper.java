package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.CallbackStatus;
import com.peacock.shop.web.domain.CallbackStatusExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CallbackStatusMapper {
    int countByExample(CallbackStatusExample example);

    int deleteByExample(CallbackStatusExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CallbackStatus record);

    int insertSelective(CallbackStatus record);

    List<CallbackStatus> selectByExampleWithBLOBs(CallbackStatusExample example);

    List<CallbackStatus> selectByExample(CallbackStatusExample example);

    CallbackStatus selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CallbackStatus record, @Param("example") CallbackStatusExample example);

    int updateByExampleWithBLOBs(@Param("record") CallbackStatus record, @Param("example") CallbackStatusExample example);

    int updateByExample(@Param("record") CallbackStatus record, @Param("example") CallbackStatusExample example);

    int updateByPrimaryKeySelective(CallbackStatus record);

    int updateByPrimaryKeyWithBLOBs(CallbackStatus record);

    int updateByPrimaryKey(CallbackStatus record);
}