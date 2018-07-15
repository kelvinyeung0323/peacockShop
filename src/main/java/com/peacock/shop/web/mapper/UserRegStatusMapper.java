package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.UserRegStatus;
import com.peacock.shop.web.domain.UserRegStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRegStatusMapper {
    int countByExample(UserRegStatusExample example);

    int deleteByExample(UserRegStatusExample example);

    int insert(UserRegStatus record);

    int insertSelective(UserRegStatus record);

    List<UserRegStatus> selectByExample(UserRegStatusExample example);

    int updateByExampleSelective(@Param("record") UserRegStatus record, @Param("example") UserRegStatusExample example);

    int updateByExample(@Param("record") UserRegStatus record, @Param("example") UserRegStatusExample example);
}