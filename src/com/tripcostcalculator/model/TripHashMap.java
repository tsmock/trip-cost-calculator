package com.tripcostcalculator.model;

import java.util.*;

public class TripHashMap
{
//    public static void main(String args[])
//    {
//
//        System.out.println(vehicleMap("2013 honda AcCord"));
//        System.out.println(addressMap("1755 Ginger Ln Blacksburg VA"));
//    }

    public TripHashMap()
    {
        //Nothing to implement
    }


    // ----------------------------------------------------------
    /**
     * Place a description of your method here.
     * @param vehicle
     * @return
     */
    public String vehicleMap(String vehicle)
    {
        HashMap<String, Double> map = new HashMap<String, Double>();
        map.put("2013 honda accord", new Double(30));
        map.put("2013 toyota camry", new Double(28));
        map.put("2013 toyota corolla", new Double(30));
        map.put("2013 honda civic", new Double(32));
        map.put("2013 ford taurus", new Double(21));
        map.put("2013 ford f150", new Double(17));
        map.put("2012 audi a6", new Double(21));

        vehicle = vehicle.toLowerCase();
        return map.get(vehicle).toString();
    }


    // ----------------------------------------------------------
    /**
     * Place a description of your method here.
     * @param address
     * @return
     */
    public String addressMap(String address)
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("1755 ginger ln blacksburg va", "37.2412,-80.4515");
        map.put("1600 pennsylvania ave washington dc", "38.897096,-77.036545");

        address = address.toLowerCase();
        return map.get(address).toString();
    }
}
