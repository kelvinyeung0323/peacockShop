<#import "../util/ad.ftl" as adTag>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
 <style>
    .swiper-container {
        width: 100%;
        height: 100%;
    }
    .swiper-slide {
        text-align: center;
        font-size: 18px;
        background: #fff;

        /* Center slide text vertically */
        display: -webkit-box;
        display: -ms-flexbox;
        display: -webkit-flex;
        display: flex;
        -webkit-box-pack: center;
        -ms-flex-pack: center;
        -webkit-justify-content: center;
        justify-content: center;
        -webkit-box-align: center;
        -ms-flex-align: center;
        -webkit-align-items: center;
        align-items: center;
    }
    </style>
<div class="swiper-container swiper1">
        <div class="swiper-wrapper">
            <div class="swiper-slide"><@adTag.display positionId=1 num=1 /></div>
            <div class="swiper-slide"><@adTag.display positionId=2 num=1 /></div>
            <div class="swiper-slide"><@adTag.display positionId=3 num=1 /></div>
        </div>
        <!-- Add Pagination -->
        <div class="swiper-pagination"></div>
    </div>
<script>
    var swiper = new Swiper('.swiper1', {
        pagination: '.swiper-pagination',
        paginationClickable: true
    });
</script>