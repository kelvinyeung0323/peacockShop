package com.peacock.shop.web.service;

import com.peacock.shop.web.domain.*;
import com.peacock.shop.web.mapper.BrandMapper;
import com.peacock.shop.web.mapper.CategoryMapper;
import com.peacock.shop.web.mapper.CommentMapper;
import com.peacock.shop.web.mapper.GoodsMapper;
import com.peacock.shop.web.vo.GoodsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Kelvin Yeung on 2018/7/9.
 */
@Component
public class GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;
    @Autowired
    private CategoryMapper categoryMapper;
    @Autowired
    private BrandMapper brandMapper;
    @Autowired
    private CommentMapper commentMapper;

    public List<Goods> getGoodsByCatId(Integer catId){
        GoodsExample example = new GoodsExample();
        example.or().andCatIdEqualTo(catId.shortValue());
        List<Goods> goodsList = goodsMapper.selectByExample(example);
        return goodsList;

    }

    public GoodsVO getGoodsById(Integer id){
        Goods goods = goodsMapper.selectByPrimaryKey(id);
        if(null==goods||false==goods.getIsDelete()){
            return null;
        }
        Category category = categoryMapper.selectByPrimaryKey(goods.getCatId());
        Brand brand = brandMapper.selectByPrimaryKey(goods.getBrandId());
        CommentExample commentExample = new CommentExample();
        commentExample.or().andIdValueEqualTo(goods.getGoodsId()).andCommentTypeEqualTo((byte) 0)
                .andParentIdEqualTo(0).andStatusEqualTo((byte) 1);
        List<Comment> comments =commentMapper.selectByExample(commentExample);
        Integer totalRank=0;
        for(Comment comment:comments){
             totalRank += comment.getCommentRank().intValue();
        }
        Integer avgRank = totalRank/comments.size();

    }
}
