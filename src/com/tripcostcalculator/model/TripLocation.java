/**
 *
 */
package com.tripcostcalculator.model;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * This class does stuff to calculate trip costs...
 *
 * @author Tyler Leskanic (tyler47)
 * @author Gareth Griffith (gareth00)
 * @author Taylor Smock (tsmock)
 * @version April 30, 2013
 */
public class TripLocation
{
    private Double      latitude;
    private Double      longitude;
    private Double      distance;
    private TripHashMap map;
    private Double      latitudeDest;
    private Double      longitudeDest;


    // private Double mpg;

    // ----------------------------------------------------------
    /**
     * Create a new TripLocation object.
     *
     * @param start
     *            The starting address.
     */
    public TripLocation(String start)
    {
        map = new TripHashMap();
        String startLoc = map.addressMap(start);
        Scanner sc = new Scanner(startLoc).useDelimiter("\\s*,\\s*");
        Double startLat = sc.nextDouble();
        Double startLong = sc.nextDouble();
        sc.close();
        latitude = startLat;
        longitude = startLong;

    }


// public void setMPG()
// {
//
// }

    /**
     * Law of Cosines formula for finding distance between two coordinates
     *
     * @param lat1
     *            Latitude of comparison location
     * @param lon1
     *            Longitude of comparison location
     */
    public void setDistance(Double lat1, Double lon1)
    {
        Double lat2 = lat1 * (Math.PI / 180);
        Double lon2 = lon1 * (Math.PI / 180);
        Double dist =
            Math.acos(Math.sin(latitude * Math.PI / 180) * Math.sin(lat2)
                + Math.cos(latitude * Math.PI / 180) * Math.cos(lat2)
                * Math.cos(lon2 - longitude * Math.PI / 180)) * 6371;
        distance = dist / 1.609344; // to miles
    }


    // ----------------------------------------------------------
    /**
     * Set the distance from a previously selected location.
     */
    public void setDistance()
    {
        this.setDistance(this.latitudeDest, this.longitudeDest);
    }


    /**
     * Call setDestination(String destination) first
     *
     * @return the distance as the crow files between the two points (miles)
     */
    public Double getDistance()
    {
        return distance;
    }


    // ----------------------------------------------------------
    /**
     * We calculate the cost to drive somewhere. TODO do we remove this?
     *
     * @param mpg
     *            The MPG of the vehicle to be used
     * @return The cost to drive to the location (approximated)
     */
    public String getDrivingCost(Double mpg)
    {
        return this.getDrivingCost(mpg, this.getGasPrice());
    }


    /**
     * We calculate the cost to drive somewhere.
     *
     * @param mpg
     *            The MPG of the vehicle to be used
     * @param gasPrice1
     *            The price of gas...
     * @return The cost to drive to the location (approximated)
     */
    public String getDrivingCost(Double mpg, Double gasPrice1)
    {
        if (mpg - 0.0 < 0.01 || this.getDistance() == null)
        {
            return "$0.00";
        }
        else
        {
            Double drivingCost = this.getDistance() * gasPrice1 / mpg;
            DecimalFormat df = new DecimalFormat("#.##");

            return String.valueOf("$" + df.format(drivingCost));
        }
    }


    /**
     * Gets current gas price from web
     *
     * @return The current average gas price.
     */
    public double getGasPrice()
    {
        /*
         * WebGetter test = new WebGetter(
         * "http://www.fueleconomy.gov/ws/rest/fuelprices", "regular"); NodeList
         * testList = test.getGas(); return
         * Double.parseDouble(testList.item(0).getTextContent());
         */
        return 3.74;
    }


    // ----------------------------------------------------------
    /**
     * Returns the cost for public transportation
     *
     * @param costPerMile
     *            The cost per mile to use public transportation.
     * @return The (average) cost of public transportation for the distance.
     */
    public String getPublicTransportCost(Double costPerMile)
    {
        if (distance == null)
        {
            distance = 0.0;
        }
        Double publicCost = distance * costPerMile;
        DecimalFormat df = new DecimalFormat("#.##");
        return String.valueOf("$" + df.format(publicCost));
    }


    // ----------------------------------------------------------
    /**
     * We set the distance based off of a string destination
     *
     * @param destination
     *            A string of the destination.
     * @return The lat-long of the destination
     */
    public String setDestination(String destination)
    {
        String endLoc = map.addressMap(destination);
        Scanner sc = new Scanner(endLoc).useDelimiter("\\s*,\\s*");
        Double endLat = sc.nextDouble();
        Double endLong = sc.nextDouble();
        this.setDistance(endLat, endLong);
        return endLat + ", " + endLong;
    }


    // ----------------------------------------------------------
    /**
     * Gets the starting latitude and longitude.
     *
     * @return The latitude and longitude in the format "lat, long"
     */
    public String getStartLatLong()
    {
        return this.latitude + "," + this.longitude;
    }
}
