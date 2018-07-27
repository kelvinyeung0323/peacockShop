package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.RegExtendInfo;
import com.peacock.shop.web.domain.RegExtendInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface RegExtendInfoMapper {
    int countByExample(RegExtendInfoExample example);

    int deleteByExample(RegExtendInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RegExtendInfo record);

    int insertSelective(RegExtendInfo record);

    List<RegExtendInfo> selectByExampleWithBLOBs(RegExtendInfoExample example);

    List<RegExtendInfo> selectByExample(RegExtendInfoExample example);

    RegExtendInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RegExtendInfo record, @Param("example") RegExtendInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") RegExtendInfo record, @Param("example") RegExtendInfoExample example);

    int updateByExample(@Param("record") RegExtendInfo record, @Param("example") RegExtendInfoExample example);

    int updateByPrimaryKeySelective(RegExtendInfo record);

    int updateByPrimaryKeyWithBLOBs(RegExtendInfo record);

    int updateByPrimaryKey(RegExtendInfo record);
}