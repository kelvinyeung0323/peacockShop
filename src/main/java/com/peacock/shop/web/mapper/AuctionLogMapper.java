package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.AuctionLog;
import com.peacock.shop.web.domain.AuctionLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuctionLogMapper {
    int countByExample(AuctionLogExample example);

    int deleteByExample(AuctionLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(AuctionLog record);

    int insertSelective(AuctionLog record);

    List<AuctionLog> selectByExample(AuctionLogExample example);

    AuctionLog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") AuctionLog record, @Param("example") AuctionLogExample example);

    int updateByExample(@Param("record") AuctionLog record, @Param("example") AuctionLogExample example);

    int updateByPrimaryKeySelective(AuctionLog record);

    int updateByPrimaryKey(AuctionLog record);
}