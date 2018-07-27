package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.VoteLog;
import com.peacock.shop.web.domain.VoteLogExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface VoteLogMapper {
    int countByExample(VoteLogExample example);

    int deleteByExample(VoteLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(VoteLog record);

    int insertSelective(VoteLog record);

    List<VoteLog> selectByExample(VoteLogExample example);

    VoteLog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") VoteLog record, @Param("example") VoteLogExample example);

    int updateByExample(@Param("record") VoteLog record, @Param("example") VoteLogExample example);

    int updateByPrimaryKeySelective(VoteLog record);

    int updateByPrimaryKey(VoteLog record);
}