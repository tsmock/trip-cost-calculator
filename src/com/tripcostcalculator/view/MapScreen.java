package com.tripcostcalculator.view;

import android.widget.TextView;

// -------------------------------------------------------------------------
/**
 *  Write a one-sentence summary of your class here.
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author Gareth Griffith (gareth00)
 *  @version Apr 14, 2013
 */

public class MapScreen
{
    private TextView publicTransit;
    private TextView yourVehicle;
    private TextView vehicleCost;
    private TextView publicCost;

    public void initialize()
    {
        publicTransit.setText("Public Transit");
        yourVehicle.setText("");
        vehicleCost.setText("");
        publicCost.setText("");

    }

}
