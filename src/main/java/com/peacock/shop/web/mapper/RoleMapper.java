package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.Role;
import com.peacock.shop.web.domain.RoleExample;
import com.peacock.shop.web.domain.RoleWithBLOBs;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface RoleMapper {
    int countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    int deleteByPrimaryKey(Short roleId);

    int insert(RoleWithBLOBs record);

    int insertSelective(RoleWithBLOBs record);

    List<RoleWithBLOBs> selectByExampleWithBLOBs(RoleExample example);

    List<Role> selectByExample(RoleExample example);

    RoleWithBLOBs selectByPrimaryKey(Short roleId);

    int updateByExampleSelective(@Param("record") RoleWithBLOBs record, @Param("example") RoleExample example);

    int updateByExampleWithBLOBs(@Param("record") RoleWithBLOBs record, @Param("example") RoleExample example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByPrimaryKeySelective(RoleWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(RoleWithBLOBs record);

    int updateByPrimaryKey(Role record);
}