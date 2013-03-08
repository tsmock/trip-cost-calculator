package com.tripcostcalculator.model;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

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

public class CostCalculationTest
{
    private CostCalculation test;

    // ----------------------------------------------------------
    /**
     * We set up variables.
     * @throws java.lang.Exception
     */
    @Before
    public void setUp()
        throws Exception
    {
        test = new CostCalculation();
    }


    /**
     * We test adding routes. Also getting (some) routes
     */
    @Test
    public void testAddRoutesGetRoutes()
    {
        fail("Not yet implemented"); // TODO
        test.addRoutes(new Toll("New York City Bridge", 10, 40));
        assertEquals("New York City Bridge",
            test.getRoutes("New York City Bridge").getName());
    }


    /**
     * We test that null comes back if there is no route
     */
    @Test
    public void testGetNullRoutes()
    {
        assertNull(test.getRoutes("The non-existent plane"));
    }

}
