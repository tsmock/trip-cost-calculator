package com.tripcostcalculator.model;

import com.tripcostcalculator.information.*;

// -------------------------------------------------------------------------
/**
 *  We do stuff with vehicles
 *
 *  @author Taylor Smock (tsmock)
 *  @version Mar 7, 2013
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

public class Vehicle
{
    /** The vehicle string */
    String vehicle;
    /** The vehicle miles per gallon */
    float mpg;
    /** The url for vehicle information */
    String vehicleURL;




    /**
     * @param vehicle The vehicle string to return
     * @param mpg the miles per gallon that the vehicle gets
     */
    public Vehicle(String vehicle, float mpg)
    {
        this.vehicle = vehicle;
        this.mpg = mpg;
    }



    /**
     * @param vehicle The vehicle string to return
     * @param mpg the miles per gallon that the vehicle gets
     * @param vehicleURL the url that vehicle information is at
     */
    public Vehicle(String vehicle, float mpg, String vehicleURL)
    {
        this(vehicle, mpg);
        this.vehicleURL = vehicleURL;
    }



    /**
     * @return The name of the vehicle
     */
    public String getVehicleName()
    {
        return this.vehicle;
    }


    /**
     * @return The miles per gallon of the vehicle
     */
    public float getMpg()
    {
        return this.mpg;
    }


    /**
     * @param mpg The new miles per gallon of the vehicle
     */
    public void setMpg(float mpg)
    {
        this.mpg = mpg;
    }



    /**
     * @param vehicleURL The new url to get vehicle information
     */
    public void setURL(String vehicleURL)
    {
        this.vehicleURL = vehicleURL;
    }


    /**
     * @return The url that we are getting vehicle information from
     */
    public String getURL()
    {
        return this.vehicleURL;
    }

    /**
     * We get the file for mpg and stuff...
     */
    public void getFile()
    {
        if (this.vehicleURL != null)
        {
            WebsiteInformation info = new WebsiteInformation(this.vehicleURL,
            this.vehicle + ".txt");
            info.saveFile();
        }
    }
}
