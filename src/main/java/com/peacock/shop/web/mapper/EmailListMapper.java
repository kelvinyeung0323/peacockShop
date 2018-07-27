package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.EmailList;
import com.peacock.shop.web.domain.EmailListExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface EmailListMapper {
    int countByExample(EmailListExample example);

    int deleteByExample(EmailListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EmailList record);

    int insertSelective(EmailList record);

    List<EmailList> selectByExample(EmailListExample example);

    EmailList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EmailList record, @Param("example") EmailListExample example);

    int updateByExample(@Param("record") EmailList record, @Param("example") EmailListExample example);

    int updateByPrimaryKeySelective(EmailList record);

    int updateByPrimaryKey(EmailList record);
}