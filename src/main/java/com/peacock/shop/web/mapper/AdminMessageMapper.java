package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.AdminMessage;
import com.peacock.shop.web.domain.AdminMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminMessageMapper {
    int countByExample(AdminMessageExample example);

    int deleteByExample(AdminMessageExample example);

    int deleteByPrimaryKey(Short messageId);

    int insert(AdminMessage record);

    int insertSelective(AdminMessage record);

    List<AdminMessage> selectByExampleWithBLOBs(AdminMessageExample example);

    List<AdminMessage> selectByExample(AdminMessageExample example);

    AdminMessage selectByPrimaryKey(Short messageId);

    int updateByExampleSelective(@Param("record") AdminMessage record, @Param("example") AdminMessageExample example);

    int updateByExampleWithBLOBs(@Param("record") AdminMessage record, @Param("example") AdminMessageExample example);

    int updateByExample(@Param("record") AdminMessage record, @Param("example") AdminMessageExample example);

    int updateByPrimaryKeySelective(AdminMessage record);

    int updateByPrimaryKeyWithBLOBs(AdminMessage record);

    int updateByPrimaryKey(AdminMessage record);
}