/**
 *
 */
package com.tripcostcalculator.model;

/**
 * @author Tyler Leskanic
 * @author Taylor Smock (tsmock)
 * @version April 30, 2013
 */
public class TripLocation
{
    private double latitude;
    private double longitude;
    private double distance;


    /**
     * Constructor
     *
     * @param lat
     *            Latitude
     * @param lon
     *            Longitude
     */
    public TripLocation(double lat, double lon)
    {
        latitude = lat * (Math.PI / 180);
        longitude = lon * (Math.PI / 180);
    }


    // ----------------------------------------------------------
    /**
     * Create a new TripLocation object.
     * @param start The starting address.
     */
    public TripLocation(String start)
    {
        TripHashMap map = new TripHashMap();
        String dest = map.addressMap(start);
        double lat =
            Double.parseDouble(dest.substring(0, dest.indexOf(",") - 1));
        double lon = Double.parseDouble(dest.substring(dest.indexOf("," + 1)));
        // duplicated, but must come last, not first.
        latitude = lat * (Math.PI / 180);
        longitude = lon * (Math.PI / 180);
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
    public double getDistance(double lat1, double lon1)
    {
        double lat2 = lat1 * (Math.PI / 180);
        double lon2 = lon1 * (Math.PI / 180);
        distance =
            Math.acos(Math.sin(latitude) * Math.sin(lat2) + Math.cos(latitude)
                * Math.cos(lat2) * Math.cos(lon2 - longitude)) * 6371;
        distance = distance / 1.609344; // to miles
        return distance;
    }


    // ----------------------------------------------------------
    /**
     * We calculate the cost to drive somewhere.
     *
     * @param mpg
     *            The MPG of the vehicle to be used
     * @return The cost to drive to the location (approximated)
     */
    public double getDrivingCost(double mpg)
    {
        return this.distance * mpg;
    }


    // ----------------------------------------------------------
    /**
     * Returns the cost for public transportation
     *
     * @param costPerMile
     *            The cost per mile to use public transportation.
     * @return The (average) cost of public transportation for the distance.
     */
    public double getPublicTransportCost(double costPerMile)
    {
        return this.distance * costPerMile;
    }


    // ----------------------------------------------------------
    /**
     * We set the distance based off of a string destination
     *
     * @param destination
     *            A string of the destination.
     */
    public void setDestination(String destination)
    {
        TripHashMap map = new TripHashMap();
        String dest = map.addressMap(destination);
        double lat =
            Double.parseDouble(dest.substring(0, dest.indexOf(",") - 1));
        double lon = Double.parseDouble(dest.substring(dest.indexOf("," + 1)));
        this.getDistance(lat, lon);
    }
}
