package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.EmailSendList;
import com.peacock.shop.web.domain.EmailSendListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmailSendListMapper {
    int countByExample(EmailSendListExample example);

    int deleteByExample(EmailSendListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EmailSendList record);

    int insertSelective(EmailSendList record);

    List<EmailSendList> selectByExampleWithBLOBs(EmailSendListExample example);

    List<EmailSendList> selectByExample(EmailSendListExample example);

    EmailSendList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EmailSendList record, @Param("example") EmailSendListExample example);

    int updateByExampleWithBLOBs(@Param("record") EmailSendList record, @Param("example") EmailSendListExample example);

    int updateByExample(@Param("record") EmailSendList record, @Param("example") EmailSendListExample example);

    int updateByPrimaryKeySelective(EmailSendList record);

    int updateByPrimaryKeyWithBLOBs(EmailSendList record);

    int updateByPrimaryKey(EmailSendList record);
}