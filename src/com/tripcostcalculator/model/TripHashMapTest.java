package com.tripcostcalculator.model;

import student.TestCase;

public class TripHashMapTest
    extends student.TestCase
{
    private TripHashMap map;


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
