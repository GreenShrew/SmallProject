function banner(){
	var timer = window.setInterval( function(){
        number++;
        document.getElementById('abc').src = "images/" + number + ".jpg";
        if(number==6) number = 1;
    } , 1000);

}


function banner2(){    
    var num = document.getElementById('abc').getAttribute( 'value' );
  
    if(num==1){
		document.getElementById('abc').setAttribute('value', '2')
		document.getElementById('abc').setAttribute('src', 'images/banner/2.jpg')
	}else{
		document.getElementById('abc').setAttribute('value', '1')
		document.getElementById('abc').setAttribute('src', 'images/banner/1.jpg')
	}
	
}