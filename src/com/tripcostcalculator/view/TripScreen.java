package com.tripcostcalculator.view;

import android.widget.Button;
import android.widget.EditText;

// -------------------------------------------------------------------------
/**
 *  Write a one-sentence summary of your class here.
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author Gareth Griffith (gareth00)
 *  @version Apr 14, 2013
 */

public class TripScreen
{
    private EditText startLoc;
    private EditText endLoc;
    private EditText gasPrice;
    private Button tripOkButton;

    public void initialize()
    {
        //again maybe set this to true if it is easier to get it to work
        tripOkButton.setEnabled(false);
        startLoc.setText("Set Start");
        endLoc.setText("Set End");
        gasPrice.setText("Current Gas Price");
    }

    public void tripOkButtonClicked()
    {
        //take us to the map page
    }

}
