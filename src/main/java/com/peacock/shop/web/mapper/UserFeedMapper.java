package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.UserFeed;
import com.peacock.shop.web.domain.UserFeedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserFeedMapper {
    int countByExample(UserFeedExample example);

    int deleteByExample(UserFeedExample example);

    int deleteByPrimaryKey(Integer feedId);

    int insert(UserFeed record);

    int insertSelective(UserFeed record);

    List<UserFeed> selectByExample(UserFeedExample example);

    UserFeed selectByPrimaryKey(Integer feedId);

    int updateByExampleSelective(@Param("record") UserFeed record, @Param("example") UserFeedExample example);

    int updateByExample(@Param("record") UserFeed record, @Param("example") UserFeedExample example);

    int updateByPrimaryKeySelective(UserFeed record);

    int updateByPrimaryKey(UserFeed record);
}