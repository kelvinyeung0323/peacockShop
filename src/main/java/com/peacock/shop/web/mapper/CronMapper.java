package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.Cron;
import com.peacock.shop.web.domain.CronExample;
import com.peacock.shop.web.domain.CronWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CronMapper {
    int countByExample(CronExample example);

    int deleteByExample(CronExample example);

    int deleteByPrimaryKey(Byte cronId);

    int insert(CronWithBLOBs record);

    int insertSelective(CronWithBLOBs record);

    List<CronWithBLOBs> selectByExampleWithBLOBs(CronExample example);

    List<Cron> selectByExample(CronExample example);

    CronWithBLOBs selectByPrimaryKey(Byte cronId);

    int updateByExampleSelective(@Param("record") CronWithBLOBs record, @Param("example") CronExample example);

    int updateByExampleWithBLOBs(@Param("record") CronWithBLOBs record, @Param("example") CronExample example);

    int updateByExample(@Param("record") Cron record, @Param("example") CronExample example);

    int updateByPrimaryKeySelective(CronWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CronWithBLOBs record);

    int updateByPrimaryKey(Cron record);
}