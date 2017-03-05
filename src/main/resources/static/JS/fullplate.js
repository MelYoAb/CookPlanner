/**
 * @author Created by apple on 2/17/17.
 */

$(document).ready(function(){

    //controls the appearance of the login form
    $('#sign-in').click(function() {
        $('#sign-in').addClass('scale-out');
        $('#sign-up').addClass('scale-out');
        $('.login').removeClass('scale-out').addClass('scale-in').addClass('login-form');
    });

    //required by materialize for dropdown menu on create recipe form
    $('select').material_select();

    //navbar options
    $('.button-collapse').sideNav({
            menuWidth: 200,
            edge: 'left',
            closeOnClick: false,
            draggable: true
        }
    );

    //Dashboard animation
    $(".panel").click(function(){
        if ($(this).siblings('.recipe-text:first').is(':hidden')) {
            $(this).siblings('.recipe-text').show().addClass('sliding-div').animate({"right": "+=500px"}, "slow");
        } else {
            $('.recipe-text').hide();
        }
    });


    //Shopping list animation
    // var speed = 33;
    // var delay = 1000;
    // var xElement = 0;
    //
    // $('.animate-strikethrough').click(function() {
    //     var x = 0;
    //     xElement +=1;
    //
    //     setTimeout(function() {
    //         setInterval(function() {
    //             x +=1;
    //             $('<del>').html($(this).text().substr(0,x));
    //             $(this).html($(this).text().substr(x));
    //             $(this).prepend($('<del>'));
    //         }, speed);
    //     }, delay * xElement);
    // });

    $('.strikethrough').click(function() {
        $(this).addClass('animate-strikethrough');
    })

});