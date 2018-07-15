<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<div class="foot-body">
  <div class="bads"><img src="/public/images/bottom.jpg"></div>
  <div class="clear10"></div>
  <!--底部导航 start-->
    <#if helps??>
    <div class="foot-help">
        <#list helps as help_cat >
        <#if help_cat_index < 5>
        <dl>
          <dt class="xs-${help_cat_index}">{$help_cat.cat_name}</dt>
            <#list help_cat.artitcle as item>
          <dd><a href="${item.url}" target="_blank" title="${item.title?html}">${item.short_title}</a></dd>
            </#list>
        </dl>

        </#if>
        </#list>
        <div class="foot-weixin">
          <div class="weixin-txt">关注demo微信</div>
          <div class="weixin-pic">
            <img src="/public/images/weixin.jpg">
          </div>
        </div>
    </div>
    </#if>

   
  <!--底部导航 end-->
  <div class="blank"></div>
  <!--版权 start-->
<div class="footer_info"> ${copyright!}
      ${shopAddress!} ${shopPostcode!}<br />
       <#--<#list lang.p_y as pv >${pv}</#list>${licensed}<br />-->
        <#if statsCode??>
      <div >${statsCode!}</div>
        </#if>
    </div>
  <div class="clear10"></div>
</div>
 

 

