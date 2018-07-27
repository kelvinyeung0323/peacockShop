<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<script type="text/javascript">
    <#--var process_request = "<@spring.message "index.processRequest"/>";-->
</script>
<div class="top-bar">
    <div class="fd_top fd_top1">
        <div class="bar-left">
            <div class="top_menu1">
                <script type="text/javascript" src="/public/js/transport.js"></script>
                <script type="text/javascript" src="/public/js/utils.js"></script>
                <font id="ECS_MEMBERZONE">
                    <#include "member_info.ftl"/>
                </font> </div>
        </div>
        <div class="bar-cart">
            <div class="fl cart-yh">
                <a href="user.php" class="">用户中心</a>
            </div>
            <#include "cart.ftl"/>
        </div>
    </div>
</div>
<div class="nav-menu">
    <div class="wrap">
        <div class="logo"><a href="../index" name="top"><img src="/public/images/logo.jpg" /></a></div>
        <div id="mainNav" class="clearfix maxmenu">
            <div class="m_left">
                <ul>
                    <li><a href="../index"
                           <#--<#if navigatorList.config.index == 1> class="cur"-->
                           <#--</#if>-->
                         ><@spring.message "index.home"/>
                        </a></li>
                    <@navigationsDirectiveModel>
                    <#list pageHeaderNavs as nav>
                    <#if pageHeaderNavs?size == nav_index>
                    <li><a href="${nav.url!}"
                        <#if nav?? && nav.opennew ==1>
                        target="_blank"
                        </#if>
                        >${nav.name}</a></li>
                   <#else >
                    <li><a href="{$nav.url}"
                        target="_blank"
                        >${nav.name}</a></li>
                    </#if>
                    <#--<#if nav.active == 1>-->
                    <#--</#if>-->
                    </#list>
                    </@navigationsDirectiveModel>
                </ul>
            </div>
        </div>
        <div class="serach-box">
            <form id="searchForm" name="searchForm" method="get" action="search" onSubmit="return checkSearchForm()" class="f_r">
                <table width="100%" border="0" cellspacing="0" cellpadding="0">
                    <tr>
                        <td width="135"><input name="keywords" type="text" id="keyword" value="${searchKeywords!?html}" class="B_input"  /></td>
                        <td><input name="imageField" type="submit" value="搜索" class="go" style="cursor:pointer;" /></td>
                    </tr>
                </table>
            </form>
        </div>
    </div>
</div>
<div class="clear0 "></div>
