package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.UserRank;
import com.peacock.shop.web.domain.UserRankExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserRankMapper {
    int countByExample(UserRankExample example);

    int deleteByExample(UserRankExample example);

    int deleteByPrimaryKey(Byte rankId);

    int insert(UserRank record);

    int insertSelective(UserRank record);

    List<UserRank> selectByExample(UserRankExample example);

    UserRank selectByPrimaryKey(Byte rankId);

    int updateByExampleSelective(@Param("record") UserRank record, @Param("example") UserRankExample example);

    int updateByExample(@Param("record") UserRank record, @Param("example") UserRankExample example);

    int updateByPrimaryKeySelective(UserRank record);

    int updateByPrimaryKey(UserRank record);
}