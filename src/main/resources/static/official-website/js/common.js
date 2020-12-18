$(function () {
    // 鼠标移入
    $('.btn-outline-light').mouseenter(function () {
        $('.showPic').stop(true, false).slideDown();
    });

    // 鼠标移出
    $('.btn-outline-light').mouseleave(function () {
        $('.showPic').stop(true, false).slideUp();
    });

});