package com.tripcostcalculator.view;

import android.widget.Button;

// -------------------------------------------------------------------------
/**
 *  Write a one-sentence summary of your class here.
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author Gareth Griffith
 *  @version Apr 8, 2013
 */

public class MainActivityScreen
{
    private Button calcTrip;
    private Button defineCar;


    public void initialize()
    {
        calcTrip.setEnabled(true);
        defineCar.setEnabled(true);
    }

    public void defineCarClicked()
    {
        //go to the car setup page
    }

    public void calcTripClicked()
    {
        //go to the calc trip page
    }

}
