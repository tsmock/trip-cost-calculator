package com.tripcostcalculator.model;

// -------------------------------------------------------------------------
/**
 *  Superclass for all potential route types
 *
 *  @author Taylor Smock (tsmock)
 *  @version Mar 8, 2013
 */

public abstract class Route
{
    /** The name of the route */
    private String name;
    /** The length of the route */
    private float distance;

    /**
     * @param name The name of the route
     * @param distance The distance of the route
     */
    public Route(String name, float distance)
    {
        this.name = name;
        this.distance = distance;
    }


    /**
     * @return the name of the route
     */
    public String getName() //TODO tested in Toll.java
    {
        return this.name;
    }



    /**
     * @return the length of this route
     */
    public float getDistance() //TODO test
    {
        return this.distance;
    }


    /**
     * @param distance The new distance
     */
    public void setDistance(float distance) //TODO test
    {
        this.distance = distance;
    }
    //TODO test all the classes
}
