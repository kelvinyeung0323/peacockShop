package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.PayLog;
import com.peacock.shop.web.domain.PayLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayLogMapper {
    int countByExample(PayLogExample example);

    int deleteByExample(PayLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(PayLog record);

    int insertSelective(PayLog record);

    List<PayLog> selectByExample(PayLogExample example);

    PayLog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") PayLog record, @Param("example") PayLogExample example);

    int updateByExample(@Param("record") PayLog record, @Param("example") PayLogExample example);

    int updateByPrimaryKeySelective(PayLog record);

    int updateByPrimaryKey(PayLog record);
}