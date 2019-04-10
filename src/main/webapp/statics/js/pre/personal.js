jQuery(document).ready(function($)
{
    $(".sub-nav li").hide();

    $(".nav-active a").click(function () {
        $(".nav-active .sub-nav li").hide();
        $(this).siblings().children().show();
    });

    $(".uc-wrap .uc-side ul .sub-nav-active").each(function(index) {
        $(this).click(function() {
            $(".status").removeClass("status");
            $(".status").eq(index).addClass("status");

        });
    })


});
