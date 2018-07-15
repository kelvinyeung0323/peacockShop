package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.VoteOption;
import com.peacock.shop.web.domain.VoteOptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VoteOptionMapper {
    int countByExample(VoteOptionExample example);

    int deleteByExample(VoteOptionExample example);

    int deleteByPrimaryKey(Short optionId);

    int insert(VoteOption record);

    int insertSelective(VoteOption record);

    List<VoteOption> selectByExample(VoteOptionExample example);

    VoteOption selectByPrimaryKey(Short optionId);

    int updateByExampleSelective(@Param("record") VoteOption record, @Param("example") VoteOptionExample example);

    int updateByExample(@Param("record") VoteOption record, @Param("example") VoteOptionExample example);

    int updateByPrimaryKeySelective(VoteOption record);

    int updateByPrimaryKey(VoteOption record);
}