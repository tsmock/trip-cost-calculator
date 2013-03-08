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
    /** Any additional costs for using the route */
    private float costs;

    /**
     * @param name The name of the route
     * @param distance The distance of the route
     */
    public Route(String name, float distance)
    {
        this.name = name;
        this.distance = distance;
        this.costs = 0; //This should be the default.
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
    public float getDistance()
    {
        return this.distance;
    }


    /**
     * @param distance The new distance
     */
    public void setDistance(float distance)
    {
        this.distance = distance;
    }


    /**
     * @param costs Any additional costs of using the route
     */
    public void setCosts(float costs)
    {
        this.costs = costs;
    }


    /**
     * @return The additional costs for using this route
     */
    public float getCosts()
    {
        return this.costs;
    }
}
