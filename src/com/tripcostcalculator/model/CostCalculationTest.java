package com.tripcostcalculator.model;

import junit.framework.TestCase;


// -------------------------------------------------------------------------
/**
 *  Testing the cost calculation stuff.
 *
 *  @author Taylor Smock (tsmock)
 *  @version Mar 8, 2013
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

public class CostCalculationTest extends TestCase
{
    private CostCalculation test;

    // ----------------------------------------------------------
    /**
     * We set up variables.
     * @throws java.lang.Exception
     */
    public void setUp()
        throws Exception
    {
        test = new CostCalculation(new Vehicle("S300", 30));
    }


    /**
     * We test adding routes. Also getting (some) routes
     */
    public void testAddRoutesGetRoutes()
    {
        test.addRoutes(new Toll("New York City Bridge", 10, 40));
        assertEquals("New York City Bridge",
            test.getRoutes("New York City Bridge").getName());
    }


    /**
     * We test that null comes back if there is no route
     */
    public void testGetNullRoutes()
    {
        assertNull(test.getRoutes("The non-existent plane"));
    }



    /**
     * We test adding routes
     */
    public void testAddRoutes()
    {
        assertNull(test.getRoutes("testing"));
        test.addRoutes(new Toll("testing", 10, 40));
        assertEquals("testing", test.getRoutes("testing").getName());
    }


    /**
     * We test calculations of cost
     */
    public void testTripCost()
    {
        assertEquals(0, test.tripCost(), 0.1);
        Toll toll = new Toll("testing", 10, 40);
        test.addRoutes(toll);
        toll.setGasCost((float)3.00);
        assertEquals(41, test.tripCost(), 0.1);
    }

}
