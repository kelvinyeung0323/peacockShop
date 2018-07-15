<#macro substring str startIndex endIndex>
    <#if str??>
        <#if (startIndex<=str?length&&endIndex<=str?length) >
            ${str?substring(startIndex,endIndex)}
        <#elseif (startIndex<=str?length&&endIndex>str?length)>
            ${str?substring(startIndex,str?length)}
        <#else>
        </#if>
    </#if>
</#macro>