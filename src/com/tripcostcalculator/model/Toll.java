package com.tripcostcalculator.model;

// -------------------------------------------------------------------------
/**
 *  We use this to calculate tolls
 *
 *  @author Taylor Smock
 *  @version Mar 7, 2013
 */

public class Toll extends Route
{
    /** The amount that the toll is */
    private float toll;
    /**
     * @param name The name of the toll road
     * @param toll The toll of the toll road
     * @param distance The length of the toll road
     */
    public Toll(String name, float distance, float toll)
    {
        super(name, distance);
        this.toll = toll;
    }
}
