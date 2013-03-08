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
