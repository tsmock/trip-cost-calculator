/**
 *
 */
package com.tripcostcalculator.model;

import student.TestCase;

/**
 * @author Taylor Smock
 * @author Tyler Leskanic
 * @version April 30, 2013
 *
 */
public class TripLocationTest extends TestCase
{
    private TripLocation trip;
    /**
     * Set up does basic setup
     */
	public void setUp()
	{
		trip = new TripLocation("here");

	}
	// ----------------------------------------------------------
	/**
	 * Testing to see if the distance method works
	 */
	public void testGetDistance()
	{
	    trip.setDestination("there");
	    assertEquals(218.13, trip.getDistance(), 0.01);
	}


	// ----------------------------------------------------------
	/**
	 * We test getting the cost of "driving".
	 */
	public void testGetDrivingCost()
	{
	    assertEquals("$0.00", trip.getDrivingCost(0.0, 0.0));
	    assertEquals("$0.00", trip.getDrivingCost(30.0, 0.0));
	    trip.setDestination("there");
	    assertEquals("$7.27", trip.getDrivingCost(30.0, 1.0));
	    assertEquals("$0.00", trip.getDrivingCost(30.0, 0.0));
	}


	// ----------------------------------------------------------
    /**
     * We test getting the cost of "driving".
     */
    public void testGetDrivingCostWithoutGas()
    {
        trip.setDestination("there");
        assertEquals("$7.27", trip.getDrivingCost(30.0));
    }


	// ----------------------------------------------------------
	/**
	 * We test getting the public transportation cost.
	 */
	public void testGetPublicTransportationCost()
	{
	    assertEquals("$390.47", trip.getPublicTransportCost(1.79));
	    trip.setDestination("there");
	    assertEquals("$390.47", trip.getPublicTransportCost(1.79));

	}

	// ----------------------------------------------------------
	/**
	 * Place a description of your method here.
	 */
	public void testSetDistatnce()
	{
	    trip.setDestination("there");
	    trip.setDistance();
	    assertEquals(218.13, trip.getDistance(), 0.01);
	}




}
