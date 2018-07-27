package com.peacock.shop.web.mapper;

import com.peacock.shop.web.domain.GoodsGallery;
import com.peacock.shop.web.domain.GoodsGalleryExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface GoodsGalleryMapper {
    int countByExample(GoodsGalleryExample example);

    int deleteByExample(GoodsGalleryExample example);

    int deleteByPrimaryKey(Integer imgId);

    int insert(GoodsGallery record);

    int insertSelective(GoodsGallery record);

    List<GoodsGallery> selectByExample(GoodsGalleryExample example);

    GoodsGallery selectByPrimaryKey(Integer imgId);

    int updateByExampleSelective(@Param("record") GoodsGallery record, @Param("example") GoodsGalleryExample example);

    int updateByExample(@Param("record") GoodsGallery record, @Param("example") GoodsGalleryExample example);

    int updateByPrimaryKeySelective(GoodsGallery record);

    int updateByPrimaryKey(GoodsGallery record);
}