package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.Agency;
import com.peacock.shop.web.domain.AgencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AgencyMapper {
    int countByExample(AgencyExample example);

    int deleteByExample(AgencyExample example);

    int deleteByPrimaryKey(Short agencyId);

    int insert(Agency record);

    int insertSelective(Agency record);

    List<Agency> selectByExampleWithBLOBs(AgencyExample example);

    List<Agency> selectByExample(AgencyExample example);

    Agency selectByPrimaryKey(Short agencyId);

    int updateByExampleSelective(@Param("record") Agency record, @Param("example") AgencyExample example);

    int updateByExampleWithBLOBs(@Param("record") Agency record, @Param("example") AgencyExample example);

    int updateByExample(@Param("record") Agency record, @Param("example") AgencyExample example);

    int updateByPrimaryKeySelective(Agency record);

    int updateByPrimaryKeyWithBLOBs(Agency record);

    int updateByPrimaryKey(Agency record);
}