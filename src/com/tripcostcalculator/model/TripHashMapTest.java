package com.tripcostcalculator.model;


// -------------------------------------------------------------------------
/**
 *  We test the TripHashMap class
 *
 *  @author Gareth Griffith (gareth00)
 *  @author Taylor Smock (tsmock)
 *  @version Apr 30, 2013
 */
public class TripHashMapTest
    extends student.TestCase
{
    private TripHashMap map;

    /**
     * Basic setup class does nothing
     */
    public void setUp()
    {
        // nothing to setup
    }


    // ----------------------------------------------------------
    /**
     * Test for the addressMap() method in TripHashMap
     */
    public void testAddressMap()
    {
        assertEquals(
            "37.2412,-80.4515",
            map.addressMap("1755 Ginger Ln Blacksburg VA"));
    }


    // ----------------------------------------------------------
    /**
     * Test for the vehicleMap() method in TripHashMap
     */
    public void testVehicleMap()
    {
        assertEquals(30, map.addressMap("2013 honda AcCord"));
    }
}
