package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.AffiliateLog;
import com.peacock.shop.web.domain.AffiliateLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AffiliateLogMapper {
    int countByExample(AffiliateLogExample example);

    int deleteByExample(AffiliateLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(AffiliateLog record);

    int insertSelective(AffiliateLog record);

    List<AffiliateLog> selectByExample(AffiliateLogExample example);

    AffiliateLog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") AffiliateLog record, @Param("example") AffiliateLogExample example);

    int updateByExample(@Param("record") AffiliateLog record, @Param("example") AffiliateLogExample example);

    int updateByPrimaryKeySelective(AffiliateLog record);

    int updateByPrimaryKey(AffiliateLog record);
}