package com.tripcostcalculator.information;

import android.location.*;


// -------------------------------------------------------------------------
/**
 *  We get the users location.
 *
 *  @author Taylor Smock (tsmock)
 *  @version Mar 31, 2013
 *
 *  This file is part of the Trip Cost Calculator.
 *
 *  Trip Cost Calculator is free software: you can redistribute it
 *  and/or modify it under the terms of the GNU General Public License
 *  as published by the Free Software Foundation, either version 3 of the
 *  License, or (at your option) any later version.
 *
 *  Trip Cost Calculator is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *  See the GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with Trip Cost Calculator.  If not, see
 *  <http://www.gnu.org/licenses/>.
 */

public class UserLocation
{
    /** The location provider */
    private String locationProvider;
    /** The location object used to get the location */
    private Location lastLoc;
    /** The manager for locations */
    private LocationManager locationManager;

    /**
     * We make a new UserLocation object.
     * @param locationManager The location manager
     */
    public UserLocation(LocationManager locationManager)
    {
        this.locationManager = locationManager;
        this.updateLoc();
        if (this.locationManager.
            isProviderEnabled(LocationManager.NETWORK_PROVIDER))
        {
            this.setLocationProvider(LocationManager.NETWORK_PROVIDER);
        }
        else if (this.locationManager.
            isProviderEnabled(LocationManager.GPS_PROVIDER))
        {
            this.setLocationProvider(LocationManager.GPS_PROVIDER);
        }
    }

    // ----------------------------------------------------------
    /**
     * @return the locationProvider
     */
    public String getLocationProvider()
    {
        return locationProvider;
    }

    // ----------------------------------------------------------
    /**
     * @param locationProvider the locationProvider to set
     */
    public void setLocationProvider(String locationProvider)
    {
        //Prevent locationProvider from being set to an invalid provider
        if ((locationProvider == LocationManager.NETWORK_PROVIDER ||
            locationProvider == LocationManager.GPS_PROVIDER) &&
            this.locationManager.isProviderEnabled(locationProvider))
        {
            this.locationProvider = locationProvider;
        }

    }



    // ----------------------------------------------------------
    /**
     * Update the location
     */
    public void updateLoc()
    {
        this.setLastLoc(this.locationManager.
            getLastKnownLocation(locationProvider));
    }

    // ----------------------------------------------------------
    /**
     * @return the lastLoc
     */
    public Location getLastLoc()
    {
        return lastLoc;
    }

    // ----------------------------------------------------------
    /**
     * @param lastLoc the lastLoc to set
     */
    public void setLastLoc(Location lastLoc)
    {
        this.lastLoc = lastLoc;
    }
}
