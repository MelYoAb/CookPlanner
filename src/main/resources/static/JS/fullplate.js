/**
 * @author Created by apple on 2/17/17.
 */

$(document).ready(function(){

    //controls the appearance of the login form
    $('#sign-in').click(function() {
        $('#sign-in').addClass('scale-out');
        $('#sign-up').addClass('scale-out');
        $('.login').removeClass('scale-out').addClass('scale-in');
    })

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

    // $(".masonry > img").click(function(){
    //     $(".single-recipe").animate({"right": "+=500px"}, "slow");
    // });

});