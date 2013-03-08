package com.tripcostcalculator.model;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

// -------------------------------------------------------------------------
/**
 *  Testing for the vehicle class
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

public class VehicleTest
{
    /** The vehicle that we will be testing */
    Vehicle test;
    // ----------------------------------------------------------
    /**
     * Initializes variables
     * @throws java.lang.Exception
     */
    @Before
    public void setUp()
        throws Exception
    {
        test = new Vehicle("S300", 40);
    }


    /**
     * Test method for {@link com.tripcostcalculator.model
     * .Vehicle#getVehicleName()}.
     */
    @Test
    public void testGetVehicleName()
    {
        assertEquals("S300", test.getVehicleName());
    }


    /**
     * Test method for {@link com.tripcostcalculator.model.Vehicle#getMpg()}.
     */
    @Test
    public void testGetMpg()
    {
        assertEquals(40, test.getMpg(), .1);
    }


    /**
     * Test method for {@link com.tripcostcalculator.model.Vehicle#setMpg(float)}.
     */
    @Test
    public void testSetMpg()
    {
        assertEquals(40, test.getMpg(), .1);
        test.setMpg(10);
        assertEquals(10, test.getMpg(), .1);
    }

}
