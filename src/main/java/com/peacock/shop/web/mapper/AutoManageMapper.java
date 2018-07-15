package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.AutoManage;
import com.peacock.shop.web.domain.AutoManageExample;
import com.peacock.shop.web.domain.AutoManageKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AutoManageMapper {
    int countByExample(AutoManageExample example);

    int deleteByExample(AutoManageExample example);

    int deleteByPrimaryKey(AutoManageKey key);

    int insert(AutoManage record);

    int insertSelective(AutoManage record);

    List<AutoManage> selectByExample(AutoManageExample example);

    AutoManage selectByPrimaryKey(AutoManageKey key);

    int updateByExampleSelective(@Param("record") AutoManage record, @Param("example") AutoManageExample example);

    int updateByExample(@Param("record") AutoManage record, @Param("example") AutoManageExample example);

    int updateByPrimaryKeySelective(AutoManage record);

    int updateByPrimaryKey(AutoManage record);
}