/**
 * 
 */
package com.tripcostcalculator.model;

/**
 * @author Tyler Leskanic
 * 
 */
public class TripLocation {
	private double latitude;
	private double longitude;

	/**
	 * Constructor
	 * 
	 * @param lat
	 *            Latitude
	 * @param lon
	 *            Longitude
	 */
	public TripLocation(double lat, double lon) {
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
	public double getDistance(double lat1, double lon1) {
		double lat2 = lat1 * (Math.PI / 180);
		double lon2 = lon1 * (Math.PI / 180);
		double distance = Math.acos(Math.sin(latitude) * Math.sin(lat2)
				+ Math.cos(latitude) * Math.cos(lat2)
				* Math.cos(lon2 - longitude)) * 6371;
		distance = distance / 1.609344; // to miles
		return distance;
	}

}
