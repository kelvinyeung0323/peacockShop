package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.Config;
import com.peacock.shop.web.domain.ConfigExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ConfigMapper {
    int countByExample(ConfigExample example);

    int deleteByExample(ConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Config record);

    int insertSelective(Config record);

    List<Config> selectByExampleWithBLOBs(ConfigExample example);

    List<Config> selectByExample(ConfigExample example);

    Config selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Config record, @Param("example") ConfigExample example);

    int updateByExampleWithBLOBs(@Param("record") Config record, @Param("example") ConfigExample example);

    int updateByExample(@Param("record") Config record, @Param("example") ConfigExample example);

    int updateByPrimaryKeySelective(Config record);

    int updateByPrimaryKeyWithBLOBs(Config record);

    int updateByPrimaryKey(Config record);
}