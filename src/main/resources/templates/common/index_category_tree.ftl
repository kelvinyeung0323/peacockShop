<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<div class="category_info">
  <div id="category_tree">
    <#list categories as cat>
    <div class="cat-box">
      <div class="cat1"><a href="{$cat.url}">${cat.catName?html}</a></div>
      <#if cat.children??>
      <div class="cat2-box">
      
        <#list cat.children as child>
        <div class="cat2 clearfix">
          <a class="cat2-link" href="{$child.url}">${child.catName?html}</a>
        <#if child.children??>
          <div class="cat3-block"></div>
          <div class="cat3-box">
            
            <#list child.children as childer>
              <a href="{$childer.url}">${childer.catName?html}</a>&nbsp;&nbsp;
            </#list>
          </div>
      </#if>
        </div>
    </#list>
        
      </div>
      </#if>

    </div>
  </#list>
    <div class="clear0"></div>
  </div>
  <div class="clear0"></div>
</div>

 
