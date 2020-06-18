$(document).ready(function() {
    let run=false;
    $('.dropright button').mouseover(function(e) {
        $('.dropright button').nextAll('.dropdown-menu').hide();
            $(this).next('.dropdown-menu').show();
    });

    $('.dropdown-menu').mouseleave(function(e) {
        $('.dropright button').nextAll('.dropdown-menu').hide();
    });

    $(window).scroll(function () {
        if (window.scrollY>=$('.surface4-1').offset().top-750){
            $('.surface4-1').animate({ marginTop: '8'}, 700)
        }
        if (window.scrollY>=$('.surface4-2').offset().top-750){
            $('.surface4-2').animate({ marginTop: '8'}, 700)
        }
        if (window.scrollY>=$('.surface4-3').offset().top-750){
            $('.surface4-3').animate({ marginTop: '8'}, 700)
        }
        if (window.scrollY>=$('.surface4-4').offset().top-750){
            $('.surface4-4').animate({ marginTop: '8'}, 700)
        }
        if (window.scrollY>=$('.surface4-5').offset().top-750){
            $('.surface4-5').animate({ marginTop: '8'}, 700)
        }
        if (window.scrollY>=$('.surface4-6').offset().top-750){
            $('.surface4-6').animate({ marginTop: '8'}, 700)
        }

        // $(window).scrollTop($(window).scrollTop()+1);

    });

    $("a[href='#top']").click(function() {
        $("html, body").stop();
        run=false;
        $("html, body").animate({ scrollTop: 0 }, "slow");
       return false;
    });

    $("a[href='#scroll']").click(function() {
        if (!run){
            $('html, body').animate({
                scrollTop: $('.surface6-txt').offset().top
            }, $('.surface6-txt').offset().top*10);
            run=true;
        }
    });
    $(".container-fluid").click(function() {
        $("html, body").stop();
        run=false;
    });



    // window.onscroll = function (e) {
    //     console.log($('.surface6-txt').offset().top);
    //     console.log($('.surface4-4').offset().top-750);
    //     console.log(window.scrollY);
    // };
});