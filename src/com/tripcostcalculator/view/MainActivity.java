package com.tripcostcalculator.view;

import android.location.LocationManager;
import android.content.Context;
import com.tripcostcalculator.information.UserLocation;
import sofia.app.Screen;
import android.app.Activity;
import android.view.Menu;

// -------------------------------------------------------------------------
/**
 * Starts the android application
 *
 * @author Taylor Smock (tsmock)
 * @author Gareth Griffith (gareth00)
 * @version Mar 7, 2013
 */
public class MainActivity extends Screen
{
    /** The location of the user. May want to update from time to time */
    UserLocation loc;



    /**
     * We set up the user location
     */
    public void setUpUserLocation()
    {
        loc = new UserLocation(
            (LocationManager) this.getSystemService(Context.LOCATION_SERVICE));
    }



    /**
     * We update the user location
     */
    public void updateUserLocation()
    {
        loc.updateLoc();
    }
}
