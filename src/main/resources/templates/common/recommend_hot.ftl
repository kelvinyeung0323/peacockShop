<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<#import "spring.ftl" as spring>
<#if hot_goods??>
    <#if cat_rec_sign !=1>
<div id="show_hot_area" class="clearfix goodsBox all_mid all_ms">
    </#if>
    <#list hot_goods as goods>
 <a class="goodsItem" href="${goods.url}">
     <div class="img-box"><img src="${goods.thumb}" alt="${goods.name?html}" class="goodsimg"/></div>
     <div class="goods-brief">${goods.brief?substring(0,20)}</div>
     <div class="gos-title">${goods.short_name?html}</div>
     <div class="prices">
      <#if goods.promote_price != ''>
          <font class="shop_s"><@spring.message "index.promotePrice"/><b>${goods.promote_price!}</b></font>
      <#else >
    <font class="shop_s"><b>${goods.shop_price!}</b></font>
      </#if>
     </div>


 </a>
    </#list>
    <#if cat_rec_sign != 1>
  <div class="clear0"></div>
</div>
    <div class="clear10"></div>
    </#if>
</#if>
