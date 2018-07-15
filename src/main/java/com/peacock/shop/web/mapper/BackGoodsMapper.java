package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.BackGoods;
import com.peacock.shop.web.domain.BackGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BackGoodsMapper {
    int countByExample(BackGoodsExample example);

    int deleteByExample(BackGoodsExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(BackGoods record);

    int insertSelective(BackGoods record);

    List<BackGoods> selectByExampleWithBLOBs(BackGoodsExample example);

    List<BackGoods> selectByExample(BackGoodsExample example);

    BackGoods selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") BackGoods record, @Param("example") BackGoodsExample example);

    int updateByExampleWithBLOBs(@Param("record") BackGoods record, @Param("example") BackGoodsExample example);

    int updateByExample(@Param("record") BackGoods record, @Param("example") BackGoodsExample example);

    int updateByPrimaryKeySelective(BackGoods record);

    int updateByPrimaryKeyWithBLOBs(BackGoods record);

    int updateByPrimaryKey(BackGoods record);
}