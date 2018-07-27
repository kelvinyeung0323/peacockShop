package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.AccountOtherLog;
import com.peacock.shop.web.domain.AccountOtherLogExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface AccountOtherLogMapper {
    int countByExample(AccountOtherLogExample example);

    int deleteByExample(AccountOtherLogExample example);

    int insert(AccountOtherLog record);

    int insertSelective(AccountOtherLog record);

    List<AccountOtherLog> selectByExample(AccountOtherLogExample example);

    int updateByExampleSelective(@Param("record") AccountOtherLog record, @Param("example") AccountOtherLogExample example);

    int updateByExample(@Param("record") AccountOtherLog record, @Param("example") AccountOtherLogExample example);
}