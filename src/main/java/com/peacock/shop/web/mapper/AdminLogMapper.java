package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.AdminLog;
import com.peacock.shop.web.domain.AdminLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminLogMapper {
    int countByExample(AdminLogExample example);

    int deleteByExample(AdminLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(AdminLog record);

    int insertSelective(AdminLog record);

    List<AdminLog> selectByExample(AdminLogExample example);

    AdminLog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") AdminLog record, @Param("example") AdminLogExample example);

    int updateByExample(@Param("record") AdminLog record, @Param("example") AdminLogExample example);

    int updateByPrimaryKeySelective(AdminLog record);

    int updateByPrimaryKey(AdminLog record);
}