package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.Sns;
import com.peacock.shop.web.domain.SnsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SnsMapper {
    int countByExample(SnsExample example);

    int deleteByExample(SnsExample example);

    int insert(Sns record);

    int insertSelective(Sns record);

    List<Sns> selectByExample(SnsExample example);

    int updateByExampleSelective(@Param("record") Sns record, @Param("example") SnsExample example);

    int updateByExample(@Param("record") Sns record, @Param("example") SnsExample example);
}