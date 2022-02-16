
/* 베스트셀러 신간도서 추천도서 */
$(function(){
    $(".tab ul li").click(function(){
        $(".tab ul li").removeClass('on');
        $(".tab .conBox").removeClass('on');
        $(this).addClass('on');
        $("#"+$(this).data('id')).addClass('on');
    });
});

var target1 = document.getElementsByClassName("book");
var target2 = document.getElementsByClassName("bookimgs");
$(function(){
    $(target1).hover(
        function(){
			$('.overview').css('visibility', 'visible');
			$('.bookimgs').css('box-shadow', '3px 3px 3px 3px #999');
			},
        function(){
			$('.overview').css('visibility', 'hidden');
			$('.bookimgs').css('box-shadow', '0 0 0 0 #999');
			});
});
/* */


/* main_slide */
var num = 0;
var timer;
$(function(){
	$('#view').hover(
		function stop(){
			window.clearInterval(timer);
		},
		function play(){
			timer = setInterval(function(){
				$('#imgs').animate({left : num * -318}, 500);
				num++;
				if(num == 4)num = 0;
			}, 2000);
		});
    $('#view').trigger('mouseleave');
});

$(function(){
	$('#view').hover(
		function(){
			$('#lbutton').css('visibility', 'visible');
			$('#rbutton').css('visibility', 'visible');
		},
		function(){
			$('#lbutton').css('visibility', 'hidden');
			$('#rbutton').css('visibility', 'hidden');
		});
});

function moveLeft(){
	if(num == 0)return;
    num--;
    var dist = -318 * num;
    document.getElementById("imgs").style.left = dist + "px";
}
function moveRight(){
	if(num == 3)return;
    num++;
    var dist = -318 * num;
    document.getElementById("imgs").style.left = dist + "px";
}
