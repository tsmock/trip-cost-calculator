package com.tripcostcalculator.model;

import android.annotation.SuppressLint;
import java.util.*;

// -------------------------------------------------------------------------
/**
 *  We use hash maps for unimplemented/unimplementable functionality
 *  (e.g., turn by turn navigation in Google Maps api)
 *
 *  @author Gareth Griffith (gareth00)
 *  @author Taylor Smock (tsmock)
 *  @version Apr 30, 2013
 */
@SuppressLint("DefaultLocale")
public class TripHashMap
{
//    public static void main(String args[])
//    {
//
//        System.out.println(vehicleMap("2013 honda AcCord"));
//        System.out.println(addressMap("1755 Ginger Ln Blacksburg VA"));
//    }

    // ----------------------------------------------------------
    /**
     * Create a new TripHashMap object.
     */
    public TripHashMap()
    {
        //Nothing to implement
    }


    // ----------------------------------------------------------
    /**
     * Vehicle map to get MPG.
     * @param vehicle The vehicle string to find
     * @return The vehicle's mpg
     */
    public String vehicleMap(String vehicle)
    {
        HashMap<String, Double> map = new HashMap<String, Double>();
        map.put("2013 honda accord", Double.valueOf(30));
        map.put("2013 toyota camry", Double.valueOf(28));
        map.put("2013 toyota corolla", Double.valueOf(30));
        map.put("2013 honda civic", Double.valueOf(32));
        map.put("2013 ford taurus", Double.valueOf(21));
        map.put("2013 ford f150", Double.valueOf(17));
        map.put("2012 audi a6", Double.valueOf(21));

        String vehicle2 = vehicle.toLowerCase();
        return map.get(vehicle2).toString();
    }


    // ----------------------------------------------------------
    /**
     * This is the map for addresses
     * @param address The address for which we are getting lat-long
     * @return lat-long for the address
     */
    public String addressMap(String address)
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("1755 ginger ln blacksburg va", "37.2412,-80.4515");
        map.put("1600 pennsylvania ave washington dc", "38.897096,-77.036545");

        String address2 = address.toLowerCase();
        return map.get(address2).toString();
    }
}
