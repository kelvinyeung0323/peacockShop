package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.Coincidence;
import com.peacock.shop.web.domain.CoincidenceExample;
import com.peacock.shop.web.domain.CoincidenceKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CoincidenceMapper {
    int countByExample(CoincidenceExample example);

    int deleteByExample(CoincidenceExample example);

    int deleteByPrimaryKey(CoincidenceKey key);

    int insert(Coincidence record);

    int insertSelective(Coincidence record);

    List<Coincidence> selectByExample(CoincidenceExample example);

    Coincidence selectByPrimaryKey(CoincidenceKey key);

    int updateByExampleSelective(@Param("record") Coincidence record, @Param("example") CoincidenceExample example);

    int updateByExample(@Param("record") Coincidence record, @Param("example") CoincidenceExample example);

    int updateByPrimaryKeySelective(Coincidence record);

    int updateByPrimaryKey(Coincidence record);
}