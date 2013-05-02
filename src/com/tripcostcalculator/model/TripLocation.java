/**
 *
 */
package com.tripcostcalculator.model;

import java.io.IOException;
import java.net.MalformedURLException;
import java.text.DecimalFormat;
import java.util.Scanner;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
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
    private Double      latitudeDest;
    private Double      longitudeDest;
    private Double      gasPrice;
    private TripHashMap map;


    // ----------------------------------------------------------
    /**
     * Create a new TripLocation object.
     *
     * @param start
     *            The starting address.
     * @throws IOException
     * @throws SAXException
     * @throws ParserConfigurationException
     * @throws MalformedURLException
     */
    public TripLocation(String start)
        throws MalformedURLException,
        ParserConfigurationException,
        SAXException,
        IOException
    {
        map = new TripHashMap();
        String startLoc = map.addressMap(start);
        Scanner sc = new Scanner(startLoc).useDelimiter("\\s*,\\s*");
        Double startLat = sc.nextDouble();
        Double startLong = sc.nextDouble();

        // duplicated, but must come last, not first.
        latitude = startLat * (Math.PI / 180);
        longitude = startLong * (Math.PI / 180);
        gasPrice = getGasPrice();
    }


    /**
     * Law of Cosines formula for finding distance between two coordinates
     *
     * @param lat1
     *            Latitude of comparison location
     * @param lon1
     *            Longitude of comparison location
     * @return the distance as the crow flies between the two points (miles)
     */
    public Double getDistance(double lat1, double lon1)
    {
        Double lat2 = lat1 * (Math.PI / 180);
        Double lon2 = lon1 * (Math.PI / 180);
        distance =
            Math.acos(Math.sin(latitude) * Math.sin(lat2) + Math.cos(latitude)
                * Math.cos(lat2) * Math.cos(lon2 - longitude)) * 6371;
        distance = distance / 1.609344; // to miles
        return distance;
    }


    /**
     * @return the distance as the crow files between the two points (miles)
     */
    public double getDistance()
    {
        return this.getDistance(this.latitudeDest, this.longitudeDest);
    }


    // ----------------------------------------------------------
    /**
     * We calculate the cost to drive somewhere.
     *
     * @param mpg
     *            The MPG of the vehicle to be used
     * @return The cost to drive to the location (approximated)
     */
    public String getDrivingCost(Double mpg)
    {
        // TODO what is wrong with distance?????
        int dist = 50;
        Double drivingCost = dist * gasPrice / mpg;
        DecimalFormat df = new DecimalFormat("#.##");

        return String.valueOf("$" + df.format(drivingCost));
    }


    /**
     * Gets current gas price from web
     *
     * @return The current average gas price.
     * @throws IOException
     * @throws SAXException
     * @throws ParserConfigurationException
     * @throws MalformedURLException
     */
    public double getGasPrice()
        throws MalformedURLException,
        ParserConfigurationException,
        SAXException,
        IOException
    {
        WebGetter test =
            new WebGetter(
                "http://www.fueleconomy.gov/ws/rest/fuelprices",
                "regular");
        NodeList testList = test.getGas();
        return Double.parseDouble(testList.item(0).getTextContent());
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
        // TODO fix distance and put it back in the method
        int dist = 50;
        Double publicCost = dist * costPerMile;
        DecimalFormat df = new DecimalFormat("#.##");
        return String.valueOf("$" + df.format(publicCost));
    }


    // ----------------------------------------------------------
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
        // TODO what is wrong with distance?????
        int dist = 50;
        Double drivingCost = dist * gasPrice1 / mpg;
        DecimalFormat df = new DecimalFormat("#.##");

        return String.valueOf("$" + df.format(drivingCost));
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
        this.latitudeDest = endLat;
        this.longitudeDest = endLong;
        this.getDistance(endLat, endLong);
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
        return this.latitude + ", " + this.longitude;
    }
}
