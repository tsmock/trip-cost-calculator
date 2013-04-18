package com.tripcostcalculator.view;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

// -------------------------------------------------------------------------
/**
 *  Write a one-sentence summary of your class here.
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author Gareth Griffith
 *  @version Apr 8, 2013
 *  @param <E>
 */

public class MainActivityScreen<E> extends Activity
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
        //presentScreen(AutoScreen.class, auto);
        startActivity(new Intent(this, AutoScreen.class));

    }

    public void defineCar1(View view)
    {
        startActivity(new Intent(this, AutoScreen.class));

    }

    public void calcTripClicked()
    {
        //go to the calc trip page
    }

}
