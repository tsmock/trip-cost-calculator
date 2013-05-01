package com.tripcostcalculator.view;

import android.location.Location;
import android.graphics.Color;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.UiSettings;
import com.tripcostcalculator.R;
import android.widget.TextView;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
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
    static final LatLng BLACKSBURG = new LatLng(37.2294, -80.4142);
    static final LatLng DROID      = new LatLng(37.1297, -80.4192);
    private Location    bburg;
    private GoogleMap   map;
//    private TextView    publicTransit;
//    private TextView    yourVehicle;
    private TextView    vehicleCost;
    private TextView    publicCost;
//    private UiSettings  uiSettings;


    public void initialize()
    {
        setUpMapIfNeeded();
        vehicleCost.setText("");
        publicCost.setText("");
    }


    @Override
    protected void onResume()
    {
        super.onResume();
        setUpMapIfNeeded();
    }


    // ----------------------------------------------------------
    /**
     * Place a description of your method here.
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
        map.isMyLocationEnabled();
        map.getUiSettings().setCompassEnabled(true);
        // uiSettings.setMyLocationButtonEnabled(true);
        map.getUiSettings().setMyLocationButtonEnabled(true);

        Marker bburg =
            map.addMarker(new MarkerOptions().position(BLACKSBURG).title(
                "Hamburg"));
        Marker droid =
            map.addMarker(new MarkerOptions()
                .position(DROID)
                .title("Droid")
                .snippet("Droid is cool")
                .icon(
                    BitmapDescriptorFactory
                        .fromResource(R.drawable.ic_launcher)));

        map.moveCamera(CameraUpdateFactory.newLatLngZoom(BLACKSBURG, 15));

        // Zoom in, animating the camera.
        map.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);

        Polyline line =
            map.addPolyline(new PolylineOptions().add(BLACKSBURG, DROID)
                .geodesic(true).width(5).color(Color.RED));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
