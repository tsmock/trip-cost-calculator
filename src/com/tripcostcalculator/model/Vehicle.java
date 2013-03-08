package com.tripcostcalculator.model;

// -------------------------------------------------------------------------
/**
 *  We do stuff with vehicles
 *
 *  @author Taylor Smock (tsmock)
 *  @version Mar 7, 2013
 */

public class Vehicle
{
    /** The vehicle string */
    String vehicle;
    /** The vehicle miles per gallon */
    float mpg;

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
}
