<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<div class="all_ms">
  <!--{foreach from=$cat_goods item=goods}-->
    
  <a class="goodsItem" href="{$goods.url}"> <div  class="img-box"><img src="{$goods.thumb}" alt="{$goods.name|escape:html}" class="goodsimg" /></div>
  <div class="goods-brief">{$goods.brief|truncate:20}</div>
    <div class="gos-title">{$goods.short_name|escape:html}</div> 
	<div class="prices">
	    <!-- {if $goods.promote_price neq ""} -->
    <font class="shop_s">{$lang.promote_price}<b>{$goods.promote_price}</b></font>
    <!-- {else}-->
    <font class="shop_s"><b>{$goods.shop_price}</b></font>
    <!--{/if}-->
	</div>
	 

  </a>
  <!--{/foreach}-->
  <div class="clear0"></div>
</div>
