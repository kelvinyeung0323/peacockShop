
<div id="append_parent"></div>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<#if user_info??> <font> <@spring.message "index.hello"/>
    <font class="f4_b">${userInfo.username}</font>, <@spring.message "index.welcomeback"/>！ <a
        href="user.php"><@spring.message "index.usercenter"/></a>| <a href="user?act=logout"><@spring.message "index.logout"/></a> </font>
<#else>
 <@spring.message "index.welcome"/>
<a href="user?act=login"><@spring.message "index.login"/> <strong></strong></a>&nbsp;|&nbsp;&nbsp;<a
        href="user?act=register"><@spring.message "index.register"/></a>
</#if>