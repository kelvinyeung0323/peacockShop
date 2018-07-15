<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<#macro display positionId num>
    <@adDirectiveModel positionId=positionId num =num>
        <#if adList??>
            <#list adList as ad>
                <#switch ad.mediaType>
                    <#case 0>
                        <#if ad.adCode?matches("^https://.*|^http://.*")>
                            <#assign src='${ad.adCode!}'>
                        <#else >
                            <#assign src= '${DATA_DIR!}/afficheimg/${ad.adCode!}'>
                        </#if>
                        <a href='affiche?ad_id=${ad.adId!}&amp;uri= ${urlEncode(ad.adLink!'', "UTF-8")}'
                           target='_blank'>
                            <img src='${src!}' width='${ad.adWidth!}' height='${ad.adHeight!}' border='0'/></a>
                        <#break >
                    <#case 1>
                        <#if ad.adCode?matches("^https://.*|^http://.*")>
                            <#assign src='${ad.adCode!}'>
                        <#else >
                            <#assign src= '${DATA_DIR!}/afficheimg/${ad.adCode!}'>
                        </#if>
                         <object classid="clsid:d27cdb6e-ae6d-11cf-96b8-444553540000"
                                 codebase="http://fpdownload.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=8,0,0,0"
                                 width='${ad.adWidth!}' height='${ad.adHeight!}'>
                             <param name='movie' value='${src}'>
                             <param name='quality' value='high'>
                             <embed src='${src}' quality='high'
                                    pluginspage='http://www.macromedia.com/go/getflashplayer'
                                    type='application/x-shockwave-flash' width='${ad.adWidth!}'
                                    height='${ad.adHeight}'></embed>
                         </object>
                        <#break >
                    <#case 2>
                        ${ad.adCode!}
                        <#break >
                    <#case 3>
                        <a href='affiche?ad_id=${ad.adId}&amp;uri=${urlEncode(ad.adLink!'', "UTF-8")}'
                           target='_blank'> ${ad.adCode!?html} </a>
                        <#break >
                </#switch>
            </#list>
        </#if>

    </@adDirectiveModel>
</#macro>