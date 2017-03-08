/**
 * Created by apple on 2/17/17
 */
//Creating empty array where to push objects coming from database and google calendar
var Events = [];
// Client ID and API key from the Developer Console
var CLIENT_ID = '587896549147-l8vtfnrdfv46gvnrsdnmfv67mv973gg7.apps.googleusercontent.com';

// Array of API discovery doc URLs for APIs used by the quickstart
var DISCOVERY_DOCS = ["https://www.googleapis.com/discovery/v1/apis/calendar/v3/rest"];

// Authorization scopes required by the API; multiple scopes can be
// included, separated by spaces.
var SCOPES = "https://www.googleapis.com/auth/calendar.readonly";

var authorizeButton = document.getElementById('authorize-button');
var signoutButton = document.getElementById('signout-button');

/**
 *  On load, called to load the auth2 library and API client library.
 */
function handleClientLoad() {
    gapi.load('client:auth2', initClient);
}

/**
 *  Initializes the API client library and sets up sign-in state
 *  listeners.
 */
function initClient() {
    gapi.client.init({
        discoveryDocs: DISCOVERY_DOCS,
        clientId: CLIENT_ID,
        scope: SCOPES
    }).then(function () {
        // Listen for sign-in state changes.
        gapi.auth2.getAuthInstance().isSignedIn.listen(updateSigninStatus);

        // Handle the initial sign-in state.
        updateSigninStatus(gapi.auth2.getAuthInstance().isSignedIn.get());
        authorizeButton.onclick = handleAuthClick;
        signoutButton.onclick = handleSignoutClick;
    });
}

/**
 *  Called when the signed in status changes, to update the UI
 *  appropriately. After a sign-in, the API is called.
 */
function updateSigninStatus(isSignedIn) {
    if (isSignedIn) {
        authorizeButton.style.display = 'none';
        signoutButton.style.display = 'block';
        listUpcomingEvents();
    } else {
        authorizeButton.style.display = 'block';
        signoutButton.style.display = 'none';
    }
}

/**
 *  Sign in the user upon button click.
 */
function handleAuthClick(event) {
    gapi.auth2.getAuthInstance().signIn();
}

/**
 *  Sign out the user upon button click.
 */
function handleSignoutClick(event) {
    gapi.auth2.getAuthInstance().signOut();
}

/**
 * Append a pre element to the body containing the given message
 * as its text node. Used to display the results of the API call.
 *
 * @param {string} message Text to be placed in pre element.
 */
function appendPre(message) {
    var pre = document.getElementById('content');
    var textContent = document.createTextNode(message + '\n');
    pre.appendChild(textContent);
}

/**
 * Print the summary and start datetime/date of the next ten events in
 * the authorized user's calendar. If no events are found an
 * appropriate message is printed.
 */
function listUpcomingEvents() {
    gapi.client.calendar.events.list({
        'calendarId': 'primary',
        'timeMin': (new Date()).toISOString(),
        'showDeleted': false,
        'singleEvents': true,
        'maxResults': 10,
        'orderBy': 'startTime'
    }).then(function(response) {
        var events = response.result.items;
        var object;
        // appendPre('Upcoming events:');

        // if (events.length > 0) {
        for (i = 0; i < events.length; i++) {
            var event = events[i];
            var when = event.start.dateTime;
            if (!when) {
                when = event.start.date;
            }
            // appendPre(event.summary + ' (' + when + ')')
            object={title:event.summary, start:when};
            Events.push(object);
        }


//display the calendar with the events

        $('#calendar').fullCalendar({
            theme: true,
            header: {
                left: 'prev,next',
                center: 'title',
                right: 'month,agendaWeek,agendaDay'
            },
            defaultDate: '2017-03-01',
            navLinks: true, // can click day/week names to navigate views
            editable: true,
            fixedWeekCount: false,
            weekNumbers: false,
            selectable: true,
            selectHelper: true,
            height:700,
            select: function(start, end) {
                var title = prompt('Event Title:');
                var eventData;
                if (title) {
                    eventData = {
                        title: title,
                        start: start,
                        end: end
                    };
                    $('#calendar').fullCalendar('renderEvent', eventData, true); // stick? = true
                }
                $('#calendar').fullCalendar('unselect');
            },
            eventClick: function(event, element) {

                event.title = prompt('Event Title:');

                $('#calendar').fullCalendar('updateEvent', event);

            },
            eventLimit: true, // allow "more" link when too many events
            events: Events

        });

    });
}


$(document).ready(function() {
      $.ajax({
            url:"/calendar.json",
            async: true,

            beforeSend: function(  ) {
                //calling this function that execute google calendar
                handleClientLoad();
            }
        }).done(function(calendars) {

            //the HTTP response-> an array of JSON objects->
            console.log("these are from the data base");
            console.log(calendars);
            var i;
            var obj;
            for(i=0; i<calendars.length;i++){
                obj={title:calendars[i].recipe.title,
                    start:calendars[i].date,
                    backgroundColor: '#378006'
                };

                Events.push(obj);

            }

    });

});









