package com.peacock.shop.web.service;

import com.peacock.shop.web.common.Constants;
import com.peacock.shop.web.domain.*;
import com.peacock.shop.web.mapper.*;
import com.peacock.shop.web.vo.GoodsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

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
    @Autowired
    private OrderGoodsMapper orderGoodsMapper;
    @Autowired
    private OrderInfoMapper orderInfoMapper;
    @Autowired
    private MemberPriceMapper memberPriceMapper;
    @Autowired
    private UserRankMapper userRankMapper;
    @Autowired
    private VolumePriceMapper volumePriceMapper;
    @Autowired
    private BonusTypeMapper bonusTypeMapper;
    @Autowired
    private GoodsTypeMapper goodsTypeMapper;
    @Autowired
    private GoodsAttrMapper goodsAttrMapper;
    @Autowired
    private AttributeMapper attributeMapper;


    public List<Goods> getGoodsByCatId(Integer catId) {
        GoodsExample example = new GoodsExample();
        example.or().andCatIdEqualTo(catId.shortValue());
        List<Goods> goodsList = goodsMapper.selectByExample(example);
        return goodsList;

    }

    public Goods getGoodsById(Integer id) {
        Goods goods = goodsMapper.selectByPrimaryKey(id);
        if (null == goods || goods.getIsDelete()) {
            return null;
        }
//        Category category = categoryMapper.selectByPrimaryKey(goods.getCatId());
//        Brand brand = brandMapper.selectByPrimaryKey(goods.getBrandId());
//        CommentExample commentExample = new CommentExample();
//        commentExample.or().andIdValueEqualTo(goods.getGoodsId()).andCommentTypeEqualTo((byte) 0)
//                .andParentIdEqualTo(0).andStatusEqualTo((byte) 1);
//        List<Comment> comments =commentMapper.selectByExample(commentExample);
//        Integer totalRank=0;
//        for(Comment comment:comments){
//             totalRank += comment.getCommentRank().intValue();
//        }
        // Integer avgRank = totalRank/comments.size();

        return goods;

    }

    /**
     * 累计销量
     *
     * @return
     */
    public Integer getCumulativeSales(Integer goodsId) {
        Integer count = 0;
        OrderGoodsExample orderGoodsExample = new OrderGoodsExample();
        orderGoodsExample.or().andGoodsIdEqualTo(goodsId);
        List<OrderGoods> orderGoodsList = orderGoodsMapper.selectByExample(orderGoodsExample);

        List<Integer> orderIds = new ArrayList<>();
        for (OrderGoods orderGoods : orderGoodsList) {
            orderIds.add(orderGoods.getOrderId());
        }

        OrderInfoExample orderInfoExample = new OrderInfoExample();
        if (orderIds.size() > 0) {
            orderInfoExample.or().andOrderStatusEqualTo((byte) 5).andOrderIdIn(orderIds);
            count = orderInfoMapper.countByExample(orderInfoExample);

        }

        Goods goods = goodsMapper.selectByPrimaryKey(goodsId);
        Short count2 = goods.getVirtualSales();
        if (null != count2) {
            count += count2;
        }

        return count;

    }


    public List<Map<String, Object>> getUserRankPrice(Integer goodsId, Double shopPrice, Integer rank) {

        UserRankExample userRankExample = new UserRankExample();
        userRankExample.or().andShowPriceEqualTo(true).andRankIdEqualTo(rank.byteValue());
        List<UserRank> userRankList = userRankMapper.selectByExample(userRankExample);

        MemberPriceExample memberPriceExample = new MemberPriceExample();
        memberPriceExample.or().andGoodsIdEqualTo(goodsId).andUserRankEqualTo(rank.byteValue());
        List<MemberPrice> memberPrices = memberPriceMapper.selectByExample(memberPriceExample);
        if (memberPrices.size() > 0) {

            return null;
        }

        MemberPrice memberPrice = memberPrices.get(0);
        List<Map<String, Object>> resultList = new ArrayList<>();
        for (UserRank userRank : userRankList) {

            Map<String, Object> rankPrice = new HashMap<>();
            Double price = 0d;
            if (null != memberPrice.getUserPrice()) {
                price = memberPrice.getUserPrice().doubleValue();
            } else {
                price = userRank.getDiscount() * shopPrice / 100;
            }
            rankPrice.put("price", price);
            rankPrice.put("rankName", userRank.getRankName());
            rankPrice.put("rankId", userRank.getRankId());
            resultList.add(rankPrice);
        }

        return resultList;
    }


    /**
     * 取得商品优惠价格列表
     *
     * @param goodsId   商品编号
     * @param priceType 价格类别(0为全店优惠比率，1为商品优惠价格，2为分类优惠比率)
     * @return 优惠价格列表
     */
    public List<VolumePrice> getVolumePriceList(Integer goodsId, Integer priceType) {
        if (priceType == null) {
            priceType = 1;
        }

        VolumePriceExample volumePriceExample = new VolumePriceExample();
        volumePriceExample.or().andGoodsIdEqualTo(goodsId).andPriceTypeEqualTo(priceType.byteValue());
        List<VolumePrice> volumePriceList = volumePriceMapper.selectByExample(volumePriceExample);

        return volumePriceList;
    }

    /**
     * 购买该商品可以得到多少钱的红包
     *
     * @param bonusTypeId
     * @return
     */
    public BonusType getBonusTypeById(Integer bonusTypeId) {

        Long now = new Date().getTime();
        BonusTypeExample bonusTypeExample = new BonusTypeExample();
        bonusTypeExample.or().andTypeIdEqualTo(bonusTypeId.shortValue())
                .andSendTypeEqualTo(Constants.SEND_BY_GOODS)
                .andSendStartDateLessThanOrEqualTo(now.intValue())
                .andSendEndDateGreaterThanOrEqualTo(now.intValue());

        List<BonusType> bonusTypeList = bonusTypeMapper.selectByExample(bonusTypeExample);
        if (!bonusTypeList.isEmpty()) {
            return bonusTypeList.get(0);
        }
        return null;

    }

    /**
     * 获得商品的规格
     *
     * @param goodsId
     * @return
     */
    public Object getGoodsProperties(Integer goodsId, Integer catId) {

        GoodsType goodsType = goodsTypeMapper.selectByPrimaryKey(catId.shortValue());
        String[] groups = null;
        if (null != goodsType) {
            groups = goodsType.getAttrGroup().replace("\r", "").split("\n");
        }

        /* 获得商品的规格 */
        GoodsAttrExample goodsAttrExample = new GoodsAttrExample();
        goodsAttrExample.or().andGoodsIdEqualTo(goodsId);
        List<GoodsAttr> goodsAttrList = goodsAttrMapper.selectByExample(goodsAttrExample);

        AttributeExample attributeExample = new AttributeExample();


        for (GoodsAttr goodsAttr : goodsAttrList) {

            Attribute attribute = attributeMapper.selectByPrimaryKey(goodsAttr.getAttrId());
            if(attribute.getAttrType()==0){


            }



        }

        return null;
    }

    /**
     * 获得商品的属性
     * @return
     */
    public Object getGoodsSpecification(){
        return null;
    }
}
