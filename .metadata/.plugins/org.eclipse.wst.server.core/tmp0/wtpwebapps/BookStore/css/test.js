/**
 * 

 
$(function(){
    $('.menu').mouseenter(function(){
        var num = $(this).index();
        $('.menu').css('opacity', '0.3');
        $('.menu').eq(num).css('opacity', '1');
    });

    $('.menu').mouseleave(function(){
        $('.menu').css('opacity', '1');
    });
});
 */