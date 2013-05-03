package com.tripcostcalculator.model;

import junit.framework.TestCase;


// -------------------------------------------------------------------------
/**
 *  We test the toll class.
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

public class TollTest extends TestCase
{
    private Toll toll;
    private float tollAmount;
    private String tollName;
    private float tollDistance;

    // ----------------------------------------------------------
    /**
     * Set up toll.
     * @throws java.lang.Exception
     */
    public void setUp()
        throws Exception
    {
        tollAmount = 50;
        tollName = "VM";
        tollDistance = 30;
        toll = new Toll(tollName, tollDistance, tollAmount);
    }


    /**
     * We test the get name method
     */
    public void testGetName()
    {
        assertEquals(tollName, toll.getName());
    }


    /**
     * We test the getToll method
     */
    public void testGetCosts()
    {
        assertEquals(tollAmount, toll.getToll(), 0.1);
    }


    /**
     * We test the setToll method
     */
    public void testSetCosts()
    {
        assertEquals(tollAmount, toll.getToll(), 0.1);
        toll.setCosts(10);
        assertEquals(10, toll.getCosts(), 0.1);
    }



    /**
     * We test the distance get methods
     */
    public void testGetDistance()
    {
        assertEquals(this.tollDistance, toll.getDistance(), 0.1);
    }


    /**
     * We test setting the distance
     */
    public void testSetDistance()
    {
        assertEquals(this.tollDistance, toll.getDistance(), 0.1);
        toll.setDistance(1);
        assertEquals(1, toll.getDistance(), 0.1);
    }


    /**
     * Setting the gas cost and testing the gas cost for a toll road.
     */
    public void testGasCost()
    {
        toll.setGasCost(30);
        assertEquals(30.0, toll.getGasCost(), 0.01);
    }

}
