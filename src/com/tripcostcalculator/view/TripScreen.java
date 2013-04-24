package com.tripcostcalculator.view;

import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.content.Context;
import sofia.app.Screen;

// -------------------------------------------------------------------------
/**
 *  The screen where trip details are entered.
 *
 *  @author Gareth Griffith (gareth00)
 *  @author Taylor Smock (tsmock)
 *  @version Apr 14, 2013
 */

public class TripScreen extends Screen
{
    private EditText startLoc;
    private EditText endLoc;
    private EditText gasPrice;
    private Button tripOkButton;

    // ----------------------------------------------------------
    /**
     * We initialize the trip screen (where we go, where we start)
     */
    public void initialize()
    {
        //again maybe set this to true if it is easier to get it to work
        tripOkButton.setEnabled(false);
        startLoc.setText("");
        endLoc.setText("");
        gasPrice.setText("");
    }

    // ----------------------------------------------------------
    /**
     * We start calculations and take user to the map screen.
     */
    public void tripOkButtonClicked(View view)
    {
        //take us to the map page
        startActivity(new Intent(this, MapScreen.class));

    }


    /**
     * endLoc has been updated
     */
    public void endLocEditingDone()
    {
        endLoc.getText().toString();
        //TODO something with endLoc.
    }


    /**
     * startLoc has been updated
     */
    public void startLocEditingDone()
    {
        startLoc.getText().toString();
        //TODO something with startLoc;
    }


    /**
     * Gas price has been updated
     */
    public void gasPriceEditingDone()
    {
        Double.parseDouble(this.gasPrice.getText().toString());
        //TODO something with gas price
    }
}
