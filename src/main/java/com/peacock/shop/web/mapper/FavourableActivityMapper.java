package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.FavourableActivity;
import com.peacock.shop.web.domain.FavourableActivityExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface FavourableActivityMapper {
    int countByExample(FavourableActivityExample example);

    int deleteByExample(FavourableActivityExample example);

    int deleteByPrimaryKey(Short actId);

    int insert(FavourableActivity record);

    int insertSelective(FavourableActivity record);

    List<FavourableActivity> selectByExampleWithBLOBs(FavourableActivityExample example);

    List<FavourableActivity> selectByExample(FavourableActivityExample example);

    FavourableActivity selectByPrimaryKey(Short actId);

    int updateByExampleSelective(@Param("record") FavourableActivity record, @Param("example") FavourableActivityExample example);

    int updateByExampleWithBLOBs(@Param("record") FavourableActivity record, @Param("example") FavourableActivityExample example);

    int updateByExample(@Param("record") FavourableActivity record, @Param("example") FavourableActivityExample example);

    int updateByPrimaryKeySelective(FavourableActivity record);

    int updateByPrimaryKeyWithBLOBs(FavourableActivity record);

    int updateByPrimaryKey(FavourableActivity record);
}