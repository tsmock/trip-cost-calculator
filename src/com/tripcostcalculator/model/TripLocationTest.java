package com.tripcostcalculator.model;

import junit.framework.TestCase;

// -------------------------------------------------------------------------
/**
 *  We test the TripLocation class
 *
 *  @author Taylor Smock (tsmock)
 *  @version May 2, 2013
 */

public class TripLocationTest
    extends TestCase
{
    private TripLocation trip;

    // ----------------------------------------------------------
    protected void setUp()
        throws Exception
    {
        super.setUp();
        trip = new TripLocation("here");
        trip.setDestination("there");
    }


    /**
     * Test method for {@link com.tripcostcalculator.model.TripLocation#getDistance(double, double)}.
     */
    public void testGetDistance()
    {
        trip.getDistance();
    }


    /**
     * Test method for {@link com.tripcostcalculator.model.TripLocation#getDrivingCost(java.lang.Double, java.lang.Double)}.
     */
    public void testGetDrivingCost()
    {
        fail("Not yet implemented"); // TODO
    }


    /**
     * Test method for {@link com.tripcostcalculator.model.TripLocation#getPublicTransportCost(java.lang.Double)}.
     */
    public void testGetPublicTransportCost()
    {
        fail("Not yet implemented"); // TODO
    }


    /**
     * Test method for {@link com.tripcostcalculator.model.TripLocation#setDestination(java.lang.String)}.
     */
    public void testSetDestination()
    {
        fail("Not yet implemented"); // TODO
    }


    /**
     * Test method for {@link com.tripcostcalculator.model.TripLocation#getStartLatLong()}.
     */
    public void testGetStartLatLong()
    {
        fail("Not yet implemented"); // TODO
    }

}
