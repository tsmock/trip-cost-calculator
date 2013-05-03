package com.tripcostcalculator.model;

import junit.framework.TestCase;
import java.util.ArrayList;
// -------------------------------------------------------------------------
/**
 *  We test the Vehicle Information class
 *
 *  @author Taylor Smock (tsmock)
 *  @version Apr 28, 2013
 */

public class VehicleInformationTest extends TestCase
{
    private VehicleInformation vInfo;
    // ----------------------------------------------------------
    /**
     * Basic setup
     * @throws java.lang.Exception
     */
    public void setUp()
        throws Exception
    {
        this.vInfo = new VehicleInformation();
    }


    /**
     * Test method for {@link com.tripcostcalculator.model.VehicleInformation#getYears()}.
     */
    public void testGetYears()
    {
        ArrayList<String> array = this.vInfo.getYears();
        assertEquals("2013", array.get(0));
    }


    /**
     * Test method for {@link com.tripcostcalculator.model.VehicleInformation#getVehicleInfo()}
     */
    public void testGetVehicleObj()
    {
        //TODO
    }
}
