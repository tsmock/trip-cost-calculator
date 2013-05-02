package com.tripcostcalculator.model;

import java.util.*;

// -------------------------------------------------------------------------
/**
 * We use hash maps for unimplemented/unimplementable functionality (e.g., turn
 * by turn navigation in Google Maps api)
 *
 * @author Gareth Griffith (gareth00)
 * @author Taylor Smock (tsmock)
 * @version Apr 30, 2013
 */
public class TripHashMap
{
    // ----------------------------------------------------------
    /**
     * Create a new TripHashMap object.
     */
    public TripHashMap()
    {
        // Nothing to implement
    }


    // ----------------------------------------------------------
    /**
     * Vehicle map to get MPG.
     *
     * @param vehicle
     *            The vehicle string to find
     * @return The vehicle's mpg
     */
    public Double vehicleMap(String vehicle)
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
        return map.get(vehicle2);
    }


    // ----------------------------------------------------------
    /**
     * This is the map for addresses
     *
     * @param address
     *            The address for which we are getting lat-long
     * @return lat-long for the address
     */
    public String addressMap(String address)
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("1755 ginger ln blacksburg va", "37.2412,-80.4515");
        map.put("1600 pennsylvania ave washington dc", "38.897096,-77.036545");
        map.put(
            "1600 amphitheatre pkwy mountain view ca",
            "37.422816,-122.085091");
        map.put("1065 la avenida st mountain view ca", "37.41232,-122.07184");
        map.put("444 castro st mountain view ca", "37.39096,-122.08103");
        map.put("here", "37.2412,-80.4515");
        map.put("there", "38.897096,-77.036545");

        String address2 = address.toLowerCase();
        return map.get(address2);
    }
}
