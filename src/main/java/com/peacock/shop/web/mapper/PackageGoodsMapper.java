package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.PackageGoods;
import com.peacock.shop.web.domain.PackageGoodsExample;
import com.peacock.shop.web.domain.PackageGoodsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PackageGoodsMapper {
    int countByExample(PackageGoodsExample example);

    int deleteByExample(PackageGoodsExample example);

    int deleteByPrimaryKey(PackageGoodsKey key);

    int insert(PackageGoods record);

    int insertSelective(PackageGoods record);

    List<PackageGoods> selectByExample(PackageGoodsExample example);

    PackageGoods selectByPrimaryKey(PackageGoodsKey key);

    int updateByExampleSelective(@Param("record") PackageGoods record, @Param("example") PackageGoodsExample example);

    int updateByExample(@Param("record") PackageGoods record, @Param("example") PackageGoodsExample example);

    int updateByPrimaryKeySelective(PackageGoods record);

    int updateByPrimaryKey(PackageGoods record);
}