
$(function() {
    $(".o-question-tab-container .o-question-tab").each(function(index) {
        $(this).mouseover(function() {
            $(".o-question-tab.current").removeClass("current"); //注意这里
            $(this).addClass("current"); //注意这里
            $(".j-tab-con div.active-txt").removeClass("active-txt");
            $(".j-tab-con div").eq(index).addClass("active-txt");

        });
    })
});
