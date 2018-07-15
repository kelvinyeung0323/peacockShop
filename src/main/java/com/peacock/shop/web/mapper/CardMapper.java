package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.Card;
import com.peacock.shop.web.domain.CardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CardMapper {
    int countByExample(CardExample example);

    int deleteByExample(CardExample example);

    int deleteByPrimaryKey(Byte cardId);

    int insert(Card record);

    int insertSelective(Card record);

    List<Card> selectByExample(CardExample example);

    Card selectByPrimaryKey(Byte cardId);

    int updateByExampleSelective(@Param("record") Card record, @Param("example") CardExample example);

    int updateByExample(@Param("record") Card record, @Param("example") CardExample example);

    int updateByPrimaryKeySelective(Card record);

    int updateByPrimaryKey(Card record);
}