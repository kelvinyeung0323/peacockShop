package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.MailTemplates;
import com.peacock.shop.web.domain.MailTemplatesExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface MailTemplatesMapper {
    int countByExample(MailTemplatesExample example);

    int deleteByExample(MailTemplatesExample example);

    int deleteByPrimaryKey(Boolean templateId);

    int insert(MailTemplates record);

    int insertSelective(MailTemplates record);

    List<MailTemplates> selectByExampleWithBLOBs(MailTemplatesExample example);

    List<MailTemplates> selectByExample(MailTemplatesExample example);

    MailTemplates selectByPrimaryKey(Boolean templateId);

    int updateByExampleSelective(@Param("record") MailTemplates record, @Param("example") MailTemplatesExample example);

    int updateByExampleWithBLOBs(@Param("record") MailTemplates record, @Param("example") MailTemplatesExample example);

    int updateByExample(@Param("record") MailTemplates record, @Param("example") MailTemplatesExample example);

    int updateByPrimaryKeySelective(MailTemplates record);

    int updateByPrimaryKeyWithBLOBs(MailTemplates record);

    int updateByPrimaryKey(MailTemplates record);
}