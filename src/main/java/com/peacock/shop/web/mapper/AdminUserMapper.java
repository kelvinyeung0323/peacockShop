package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.AdminUser;
import com.peacock.shop.web.domain.AdminUserExample;
import com.peacock.shop.web.domain.AdminUserWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminUserMapper {
    int countByExample(AdminUserExample example);

    int deleteByExample(AdminUserExample example);

    int deleteByPrimaryKey(Short userId);

    int insert(AdminUserWithBLOBs record);

    int insertSelective(AdminUserWithBLOBs record);

    List<AdminUserWithBLOBs> selectByExampleWithBLOBs(AdminUserExample example);

    List<AdminUser> selectByExample(AdminUserExample example);

    AdminUserWithBLOBs selectByPrimaryKey(Short userId);

    int updateByExampleSelective(@Param("record") AdminUserWithBLOBs record, @Param("example") AdminUserExample example);

    int updateByExampleWithBLOBs(@Param("record") AdminUserWithBLOBs record, @Param("example") AdminUserExample example);

    int updateByExample(@Param("record") AdminUser record, @Param("example") AdminUserExample example);

    int updateByPrimaryKeySelective(AdminUserWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(AdminUserWithBLOBs record);

    int updateByPrimaryKey(AdminUser record);
}