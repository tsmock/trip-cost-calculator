package com.tripcostcalculator.view;

import java.util.Scanner;
import android.util.Log;
import android.graphics.Color;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.Polyline;
import com.tripcostcalculator.R;
import android.widget.TextView;
import android.view.Menu;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import sofia.app.*;

// -------------------------------------------------------------------------
/**
 * This class creates the map screen. I houses the Google maps directions and
 * the cost comparisons compiled from previous screens. ** This class can extend
 * FragmentActivity and also ** import android.support.v4.app.FragmentActivity;
 * ** for added fragment capabilities if needed.
 *
 * @author Gareth Griffith (gareth00)
 * @version Apr 14, 2013
 */

public class MapScreen
    extends Screen
{
// static LatLng START = new LatLng(37.2294, -80.4192);
// static LatLng END = new LatLng(37.1297, -80.4192);
    private static LatLng     START;
    private static LatLng     END;
    private GoogleMap map;

    private TextView  vehicleTransCost;
    private TextView  publicTransCost;

    private String    startParse;
    private String    endParse;
    private Double    startLat;
    private Double    startLong;
    private Double    endLat;
    private Double    endLong;


    // ----------------------------------------------------------
    /**
     * Place a description of your method here.
     *
     * @param autoCost
     * @param publicCost
     * @param start
     * @param end
     */
    public void initialize(
        String autoCost,
        String publicCost,
        String start,
        String end)
    {
        startParse = start;
        endParse = end;
        parseStart();
        parseEnd();
        START = new LatLng(startLat, startLong);
        END = new LatLng(endLat, endLong);

        vehicleTransCost.setText(autoCost);
        publicTransCost.setText(publicCost);

        setUpMapIfNeeded();
    }


    // ----------------------------------------------------------
    /**
     * Parses the starting latitude and longitude.
     */
    public void parseStart()
    {
        Scanner sc = new Scanner(startParse).useDelimiter("\\s*,\\s*");
        startLat = sc.nextDouble();
        startLong = sc.nextDouble();
        Log.d(
            "START LAT LONG",
            String.valueOf(startLat) + " " + String.valueOf(startLong));
    }


    // ----------------------------------------------------------
    /**
     * Parses the ending latitude and longitude.
     */
    public void parseEnd()
    {
        Scanner sc = new Scanner(endParse).useDelimiter("\\s*,\\s*");
        endLat = sc.nextDouble(); //TODO use the parseLatitudeLongitude method
        endLong = sc.nextDouble();
        Log.d(
            "END LAT LONG",
            String.valueOf(endLat) + " " + String.valueOf(endLong));
    }

    /**
     * @param latLong The string with the latitude and longitude.
     * @return A double[] with two elements; {latitude, longitude} if
     *          latitude and longitude came in that order.
     */
    private Double[] parseLatitudeLongitude(String latLong)
    {
        Double[] d = {0.0, 0.0};
        Scanner sc = new Scanner(latLong).useDelimiter("\\s*,\\s*");
        d[0] = sc.nextDouble();
        d[1] = sc.nextDouble();
        return d;
    }


    /**
     * Runs when we resume the app.
     */
    protected void onResume()
    {
        super.onResume();
        setUpMapIfNeeded();
    }


    // ----------------------------------------------------------
    /**
     * Checks to see if we already have a map set up, if not we set up the map.
     */
    public void setUpMapIfNeeded()
    {
        // Do a null check to confirm that we have not already instantiated the
        // map.
        if (map == null)
        {
            // Try to obtain the map from the SupportMapFragment.
            map =
                ((MapFragment)getFragmentManager().findFragmentById(R.id.map))
                    .getMap();
            // Check if we were successful in obtaining the map.
            if (map != null)
            {
                setUpMap();
            }
        }
    }


    private void setUpMap()
    {
        Marker start =
            map.addMarker(new MarkerOptions().position(START).title("Start"));
        Marker end =
            map.addMarker(new MarkerOptions().position(END)
                .title("Destination").draggable(true));

        map.moveCamera(CameraUpdateFactory.newLatLngZoom(START, 15));
        // Zoom in, animating the camera.
        map.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);

        Polyline line =
            map.addPolyline(new PolylineOptions().add(START, END)
                .geodesic(true).width(5).color(Color.RED));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
