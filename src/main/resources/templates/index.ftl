<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<#import "spring.ftl" as spring>
<#import "util/peacock_tool.ftl" as peacock>
<#import "util/ad.ftl" as adTag>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="Keywords" content="${keywords!''}" />
    <meta name="Description" content="${description!''}" />
    <title>${page_title!''}</title>
    <link rel="shortcut icon" href="favicon.ico" />
    <link rel="icon" href="/public/images/animated_favicon.gif" type="image/gif" />
    <link href="/public/css/style.css" rel="stylesheet" type="text/css" />
    <link rel="alternate" type="application/rss+xml" title="RSS|${page_title!''}" href="${feed_url!''}" />
    <link rel="stylesheet" type="text/css" href="/public/images/swiper.min.css">
    <script language='javascript' src='/public/js/swiper.min.js' type='text/javascript' charset='utf-8'></script>
    <script type="text/javascript" language="javascript" src="/public/js/common.js" charset="utf-8"></script>
    <script type="text/javascript" language="javascript" src="/public/js/index.js" charset="utf-8"></script>

</head>
<body>
<#include "common/page_header.ftl"/>
<script>
    if (Object.prototype.toJSONString){
        var oldToJSONString = Object.toJSONString;
        Object.prototype.toJSONString = function(){
            if (arguments.length > 0){
                return false;
            }else{
                return oldToJSONString.apply(this, arguments);
            }
        }}</script>
<div class="indexpage clearfix">
    <div class="index-cat">
        <#include "common/index_category_tree.ftl"/>
    </div>
    <div class="index-banner">
        <#include "common/index_banner.ftl"/>
    </div>
</div>
<div class="indexpage clearfix index-ad">
    <div class="ad-tg">
        <!-- TemplateBeginEditable name="团购广告230x206" -->

        <@adTag.display 4 1/>
        <#--{insert name='ads' id=$ads_id num=$ads_num}-->
        <!-- TemplateEndEditable -->
    </div>
    <div class="ad-lb">
        <#include "common/index_lad.ftl"/>
    </div>
</div>
<div class="index-body">
    <div class="indexpage">
        <div class="body-goods">
            <div class="goods-title">1F 家用电器</div>
            <div class="clearfix goods-wrap">
                <div class="goods-leftad">
                    <#include "common/f1_ad.ftl"/>
                </div>
                <div class="goods-right">
                    <!-- TemplateBeginEditable name="1层产品" -->
                    <#--<#include "common/cat_goods.ftl"/>-->
                    <div class="all_ms">
                        <#list firstFloorGoods as goods>
                        <a class="goodsItem" href="${goods.url!}"> <div  class="img-box"><img src="${goods.goodsThumb!}" alt="${goods.goodsName!?html}" class="goodsimg" /></div>
                            <div class="goods-brief"><@peacock.substring goods.goodsBrief 0 20 /></div>
                            <div class="gos-title">${goods.goodsSn!?html}</div>
                            <div class="prices">
                                <#if goods.promotePrice !='' >
                                <font class="shop_s"><@spring.message "index.promotePrice"/><b>${goods.promotePrice!}</b></font>
                                <#else >
                                <font class="shop_s"><b>${goods.shopPrice!}</b></font>
                                </#if>
                            </div>

                        </a>
                        </#list>
                        <div class="clear0"></div>
                    </div>

                    <!-- #EndLibraryItem -->
                    <!-- TemplateEndEditable -->
                </div>
            </div>
            <div class="goods-title">2F 数码时尚</div>
            <div class="clearfix goods-wrap">
                <div class="goods-leftad">
                    <#include "common/f2_ad.ftl"/>
                </div>
                <div class="goods-right">
                    <!-- TemplateBeginEditable name="2层产品" -->
                    <#--<#include "common/cat_goods.ftl"/>-->

                    <div class="all_ms">
                        <#list secondFloorGoods as goods >
                        <a class="goodsItem" href="goods?id=${goods.goodsId!}"> <div  class="img-box"><img src="/public/${goods.goodsThumb!}" alt="${goods.goodsName?html}" class="goodsimg" /></div>
                            <div class="goods-brief"><@peacock.substring goods.goodsBrief 0 20 /></div>
                            <div class="gos-title">${goods.goodsSn?html}</div>
                            <div class="prices">
                                <#if goods.promotePrice??>
                                <font class="shop_s"><@spring.message "index.promotePrice"/><b>${goods.promotePrice}</b></font>
                                <#else>
                                <font class="shop_s"><b>${goods.shopPrice}</b></font>
                                </#if>
                            </div>
                        </a>
                        </#list>
                        <div class="clear0"></div>
                    </div>

                    <!-- #EndLibraryItem -->
                    <!-- TemplateEndEditable -->
                </div>
            </div>
            <div class="goods-title">3F 家居生活</div>
            <div class="clearfix goods-wrap">
                <div class="goods-leftad">
                    <#include "common/f3_ad.ftl"/>
                </div>
                <div class="goods-right">
                    <!-- TemplateBeginEditable name="3层产品" -->
                    <#--<#include "common/cat_goods.ftl"/>-->
                    <div class="all_ms">
                        <#list thirdFloorGoods as goods>
                        <a class="goodsItem" href="goods?id=${goods.goodsId!}"> <div  class="img-box"><img src="/public/${goods.goodsThumb!}" alt="${goods.goodsName?html}" class="goodsimg" /></div>
                            <div class="goods-brief"><@peacock.substring goods.goodsBrief 0 20 /></div>
                            <div class="gos-title">${goods.goodsSn!?html}</div>
                            <div class="prices">
                                <#if goods.promotePrice??>
                                <font class="shop_s"><@spring.message "index.promotePrice"/><b>${goods.promotePrice!}</b></font>
                                <#else>
                                <font class="shop_s"><b>${goods.shopPrice!}</b></font>
                                </#if>
                            </div>


                        </a>
                        </#list>
                        <div class="clear0"></div>
                    </div>

                    <!-- #EndLibraryItem -->
                    <!-- TemplateEndEditable -->
                </div>
            </div>
            <div class="goods-title">热门商品推荐</div>
            <div class="clearfix goods-wrap hot-goods">
                <!-- TemplateBeginEditable name="热门商品推荐" -->
                <#--<#include "common/recommend_hot.ftl"/>-->
                <#if (hotSaleGoods?size>0)>
                <#if (catRecSign??&&catRecSign!=1)>
                <div id="show_hot_area" class="clearfix goodsBox all_mid all_ms">
                </#if>
                    <#list hotSaleGoods as goods>
                    <a class="goodsItem" href="goods?id=${goods.goodsId!}"> <div  class="img-box"><img src="/public/${goods.goodsThumb!}" alt="${goods.goodsName?html}" class="goodsimg" /></div>
                        <div class="goods-brief"><@peacock.substring goods.goodsBrief 0 20 /></div>
                        <div class="gos-title">${goods.goodsSn?html}</div>
                        <div class="prices">

                            <#if goods.promotePrice??>
                            <font class="shop_s"><@spring.message "index.promotePrice"/><b>${goods.promotePrice!}</b></font>
                            <#else>
                            <font class="shop_s"><b>${goods.shopPrice!}</b></font>
                            </#if>
                        </div>


                    </a>
                    </#list>

                    <#if (catRecSign??&&catRecSign!=1)>
                    <div class="clear0"></div>
                </div> <div class="clear10"></div>
                </#if>
                </#if>

                <!-- #EndLibraryItem -->
                <!-- TemplateEndEditable -->
            </div>

        </div>
    </div>
</div>
<!-- #BeginLibraryItem "/library/page_footer.lbi" --><!-- #EndLibraryItem -->
<#include  "common/page_footer.ftl"/>
</body>
</html>
