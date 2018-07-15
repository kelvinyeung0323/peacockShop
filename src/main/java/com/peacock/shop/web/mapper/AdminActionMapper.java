package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.AdminAction;
import com.peacock.shop.web.domain.AdminActionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminActionMapper {
    int countByExample(AdminActionExample example);

    int deleteByExample(AdminActionExample example);

    int deleteByPrimaryKey(Byte actionId);

    int insert(AdminAction record);

    int insertSelective(AdminAction record);

    List<AdminAction> selectByExample(AdminActionExample example);

    AdminAction selectByPrimaryKey(Byte actionId);

    int updateByExampleSelective(@Param("record") AdminAction record, @Param("example") AdminActionExample example);

    int updateByExample(@Param("record") AdminAction record, @Param("example") AdminActionExample example);

    int updateByPrimaryKeySelective(AdminAction record);

    int updateByPrimaryKey(AdminAction record);
}