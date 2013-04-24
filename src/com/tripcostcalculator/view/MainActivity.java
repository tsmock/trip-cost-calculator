package com.tripcostcalculator.view;

//import android.content.Intent;
//import android.view.View;
import android.widget.Button;
import android.location.LocationManager;
import android.content.Context;
import com.tripcostcalculator.information.UserLocation;
import sofia.app.Screen;

// -------------------------------------------------------------------------
/**
 * Starts the android application
 *
 * @author Taylor Smock (tsmock)
 * @author Gareth Griffith (gareth00)
 * @author Tyler Leskanic (tyler47)
 * @version Mar 7, 2013
 */
public class MainActivity
    extends Screen
{
    // TODO add links (TOS stuff) for:
    // http://www.google.com/privacy.html
    // http://www.google.com/intl/en_us/help/terms_maps.html
    // http://www.google.com/intl/en_us/policies/privacy/
    // TODO TOS stuff
    // Add our own TOS and Privacy Policy
    // Add powered by Google next to map. The defaults might work (depends)
    // We must show the corresponding google map
    // We must implement a way for users to prevent us from getting geolocation
    // data.
    // We should only send location information and NOTHING else to google
    // We can't use this for turn-by-turn navigation. (10.2(c)(i))
    /** The location of the user. May want to update from time to time */
    public UserLocation loc;
    private Button      calcTrip;
    private Button      defineCar;


    /**
     * Initialize data
     */
    public void initialize()
    {
        calcTrip.setEnabled(true);
        defineCar.setEnabled(true);
    }


    /**
     * We set up the user location
     */
    public void setUpUserLocation()
    {
        loc =
            new UserLocation(
                (LocationManager)this
                    .getSystemService(Context.LOCATION_SERVICE));
    }


    /**
     * We update the user location
     */
    public void updateUserLocation()
    {
        loc.updateLoc();
    }


    /**
     * Starts a new activity to define a car...
     */
    public void defineCarClicked()
    {
        // go to the car setup page
        presentScreen(AutoScreen.class);
    }


    /**
     * Called when the calcTrip button is clicked.
     */
    public void calcTripClicked()
    {
        // go to the calc trip page
        presentScreen(TripScreen.class);
    }

}
