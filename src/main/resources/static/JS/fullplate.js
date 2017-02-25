/**
 * @author Created by apple on 2/17/17.
 */

$(document).ready(function(){
    $('#sign-in').click(function() {
        $('#sign-in').addClass('scale-out');
        $('#sign-up').addClass('scale-out');
        $('.login').removeClass('scale-out').addClass('scale-in');
    })
});