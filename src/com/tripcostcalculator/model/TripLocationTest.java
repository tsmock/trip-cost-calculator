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
	    trip.setDestination("there");
	    assertEquals("$7.27", trip.getDrivingCost(30.0, 1.0));
	}


	// ----------------------------------------------------------
	/**
	 * We test getting the public transportation cost.
	 */
	public void testGetPublicTransportationCost()
	{
	    trip.setDestination("there");

	}
}
