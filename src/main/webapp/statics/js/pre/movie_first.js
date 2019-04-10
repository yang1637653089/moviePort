var $adverBox=$(".adver").eq(0);
var $arrowLeft=$(".arrowLeft").eq(0);
var $arrowRight=$(".arrowRight").eq(0);
var $dots=$(".adver ul").eq(0);
var images=[
    "/movie/statics/images/电影1.png",
    "/movie/statics/images/电影2.png",
    "/movie/statics/images/电影3.png",
    "/movie/statics/images/电影4.png",
    "/movie/statics/images/电影5.png"]
$adverBox.mouseover(function(){
    $arrowLeft.show();
    $arrowRight.show();
    /*clearInterval(change());*/
}).mouseout(function(){
    $arrowLeft.hide();
    $arrowRight.hide();

});
$dots.find("li").click(function(){
    $(".active").removeClass("active");
    $(this).addClass("active");
    changeBackground();
});
$arrowLeft.click(function(){
    var $prevLi=$(".active").prev();
    if($prevLi.length===0){
        //alert("已经是第一页了");
        $(".active").removeClass("active");
        $dots.find("li:last").addClass("active");
    }else{
        $(".active").removeClass("active");
        $prevLi.addClass("active");

    }
    changeBackground();
});
$arrowRight.click(function(){
    var $nextli=$(".active").next();
    if($nextli.length===0){
        $(".active").removeClass("active");
        $dots.find("li:first").addClass("active");
        //alert("已经是最后一页了");
    }else{
        $(".active").removeClass("active");
        $nextli.addClass("active");
    };
    changeBackground();
});
function  changeBackground(){
    var num= $(".active").text()-1;
    $adverBox.css("background","url('"+images[num]+"')");
}
var change=setInterval(function(){
    $arrowRight.click();
},2000);
