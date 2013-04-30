/**
 * 
 */
package com.tripcostcalculator.model;

import student.TestCase;

/**
 * @author Tyler
 *
 */
public class TripLocationTest extends TestCase 
{
	public void setUp()
	{
		
	}
	public void testMethod()
	{
		TripLocation test = new TripLocation(42.294199, -71.302707);
		assertEquals(test.getDistance(42.294548, -71.308458), 0.29493, 0.01);
	}
}
