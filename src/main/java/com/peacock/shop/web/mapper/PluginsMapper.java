package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.Plugins;
import com.peacock.shop.web.domain.PluginsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PluginsMapper {
    int countByExample(PluginsExample example);

    int deleteByExample(PluginsExample example);

    int deleteByPrimaryKey(String code);

    int insert(Plugins record);

    int insertSelective(Plugins record);

    List<Plugins> selectByExample(PluginsExample example);

    Plugins selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") Plugins record, @Param("example") PluginsExample example);

    int updateByExample(@Param("record") Plugins record, @Param("example") PluginsExample example);

    int updateByPrimaryKeySelective(Plugins record);

    int updateByPrimaryKey(Plugins record);
}