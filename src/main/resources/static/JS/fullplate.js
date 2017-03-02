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

    //when btn is clicked, adds more ingredient fields
    var counter = 1;
    var limit = 10;
    $('#add-input').click(function() {
        if (counter == limit)  {
            alert("You have reached the limit of adding " + counter + " inputs");
        } else {
            $('select').material_select('destroy');
            $('.dynamic-input').append('<div class="input-field col s3"><select id="ingredient' + counter + '"><option ' +
                'value="" class="disabled">Please Choose Category</option></select></div><div class="input-field col s3">' +
                '<label for="qty">Quantity</label><input name="qty" id="qty' + counter + '" type="text"/></div>');
            $('select').material_select();
            counter ++;
        }
    });

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