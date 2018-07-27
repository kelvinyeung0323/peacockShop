package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.Push;
import com.peacock.shop.web.domain.PushExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface PushMapper {
    int countByExample(PushExample example);

    int deleteByExample(PushExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Push record);

    int insertSelective(Push record);

    List<Push> selectByExample(PushExample example);

    Push selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Push record, @Param("example") PushExample example);

    int updateByExample(@Param("record") Push record, @Param("example") PushExample example);

    int updateByPrimaryKeySelective(Push record);

    int updateByPrimaryKey(Push record);
}