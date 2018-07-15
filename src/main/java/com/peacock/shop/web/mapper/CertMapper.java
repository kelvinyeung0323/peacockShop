package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.Cert;
import com.peacock.shop.web.domain.CertExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CertMapper {
    int countByExample(CertExample example);

    int deleteByExample(CertExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Cert record);

    int insertSelective(Cert record);

    List<Cert> selectByExampleWithBLOBs(CertExample example);

    List<Cert> selectByExample(CertExample example);

    Cert selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Cert record, @Param("example") CertExample example);

    int updateByExampleWithBLOBs(@Param("record") Cert record, @Param("example") CertExample example);

    int updateByExample(@Param("record") Cert record, @Param("example") CertExample example);

    int updateByPrimaryKeySelective(Cert record);

    int updateByPrimaryKeyWithBLOBs(Cert record);

    int updateByPrimaryKey(Cert record);
}