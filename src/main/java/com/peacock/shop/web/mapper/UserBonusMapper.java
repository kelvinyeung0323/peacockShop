package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.UserBonus;
import com.peacock.shop.web.domain.UserBonusExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserBonusMapper {
    int countByExample(UserBonusExample example);

    int deleteByExample(UserBonusExample example);

    int deleteByPrimaryKey(Integer bonusId);

    int insert(UserBonus record);

    int insertSelective(UserBonus record);

    List<UserBonus> selectByExample(UserBonusExample example);

    UserBonus selectByPrimaryKey(Integer bonusId);

    int updateByExampleSelective(@Param("record") UserBonus record, @Param("example") UserBonusExample example);

    int updateByExample(@Param("record") UserBonus record, @Param("example") UserBonusExample example);

    int updateByPrimaryKeySelective(UserBonus record);

    int updateByPrimaryKey(UserBonus record);
}