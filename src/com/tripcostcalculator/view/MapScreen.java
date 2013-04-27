package com.tripcostcalculator.view;

import android.support.v4.app.FragmentActivity;
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

// -------------------------------------------------------------------------
/**
 *  Write a one-sentence summary of your class here.
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author Gareth Griffith (gareth00)
 *  @version Apr 14, 2013
 */

public class MapScreen extends FragmentActivity
{
    static final LatLng HAMBURG = new LatLng(53.558, 9.927);
    static final LatLng KIEL = new LatLng(53.551, 9.993);
    private GoogleMap map;
    private TextView publicTransit;
    private TextView yourVehicle;
    private TextView vehicleCost;
    private TextView publicCost;

//    // ----------------------------------------------------------
//    /**
//     * We initialize the map screen.
//     */
//    public void initialize()
//    {
//        publicTransit.setText("Public Transit");
//        yourVehicle.setText("");
//        vehicleCost.setText("");
//        publicCost.setText("");
//
//    }


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.mapscreen);

      publicTransit = (TextView)findViewById(R.id.publicTransit);
      publicTransit.setText("Public Transit");
      yourVehicle = (TextView)findViewById(R.id.yourVehicle);
      yourVehicle.setText("Your Vehicle");
      vehicleCost = (TextView)findViewById(R.id.vehicleCost);
      vehicleCost.setText("");
      publicCost = (TextView)findViewById(R.id.publicCost);
      publicCost.setText("");
    }


//      map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map))
//          .getMap();
//      Marker hamburg = map.addMarker(new MarkerOptions().position(HAMBURG)
//          .title("Hamburg"));
//      Marker kiel = map.addMarker(new MarkerOptions()
//          .position(KIEL)
//          .title("Kiel")
//          .snippet("Kiel is cool")
//          .icon(BitmapDescriptorFactory
//              .fromResource(R.drawable.ic_launcher)));
//
//      // Move the camera instantly to hamburg with a zoom of 15.
//      map.moveCamera(CameraUpdateFactory.newLatLngZoom(HAMBURG, 15));
//
//      // Zoom in, animating the camera.
//      map.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);
//    }
//
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
      getMenuInflater().inflate(R.menu.main, menu);
      return true;
    }


    //TODO Bring in the MapFragment object from Google Maps
}
