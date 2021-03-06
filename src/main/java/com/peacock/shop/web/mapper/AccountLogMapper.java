package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.AccountLog;
import com.peacock.shop.web.domain.AccountLogExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface AccountLogMapper {
    int countByExample(AccountLogExample example);

    int deleteByExample(AccountLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(AccountLog record);

    int insertSelective(AccountLog record);

    List<AccountLog> selectByExample(AccountLogExample example);

    AccountLog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") AccountLog record, @Param("example") AccountLogExample example);

    int updateByExample(@Param("record") AccountLog record, @Param("example") AccountLogExample example);

    int updateByPrimaryKeySelective(AccountLog record);

    int updateByPrimaryKey(AccountLog record);
}