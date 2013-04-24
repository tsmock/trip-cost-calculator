package com.tripcostcalculator.view;

import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.content.Context;
import sofia.app.Screen;

// -------------------------------------------------------------------------
/**
 * The screen where trip details are entered.
 *
 * @author Gareth Griffith (gareth00)
 * @author Taylor Smock (tsmock)
 * @version Apr 14, 2013
 */

public class TripScreen
    extends Screen
{
    private EditText startLoc;
    private EditText endLoc;
    private EditText gasPrice;
    private Button   tripOkButton;
    private boolean[] done;


    // ----------------------------------------------------------
    /**
     * We initialize the trip screen (where we go, where we start)
     */
    public void initialize()
    {
        // again maybe set this to true if it is easier to get it to work
        tripOkButton.setEnabled(true);
        startLoc.setText("");
        endLoc.setText("");
        gasPrice.setText("");
        done = new boolean[] {false, false, false};
    }


    // ----------------------------------------------------------
    /**
     * We start calculations and take user to the map screen.
     */
    public void tripOkButtonClicked()
    {
        // take us to the map page
        presentScreen(MapScreen.class);
    }


    /**
     * endLoc has been updated
     */
    public void endLocEditingDone()
    {
        if(endLoc.getText().toString() != "")
        {
            done[0] = true;
        }
        else
        {
            done[0] = false;
        }
        this.update();
        // TODO something with endLoc.
    }


    /**
     * startLoc has been updated
     */
    public void startLocEditingDone()
    {
        if(startLoc.getText().toString() != "")
        {
            done[1] = true;
        }
        else
        {
            done[1] = false;
        }
        // TODO something with startLoc;
    }


    /**
     * Gas price has been updated
     */
    public void gasPriceEditingDone()
    {
        if(gasPrice.getText().toString() != "")
        {
            done[2] = true;
        }
        else
        {
            done[2] = false;
        }
        Double.parseDouble(this.gasPrice.getText().toString());
        // TODO something with gas price
    }

    private boolean update()
    {
        // done[3] is the mpg. done[0-2] give enough info to get MPG
        if (done[0] && done[1] && done[2])
        {
            tripOkButton.setEnabled(true);
            return true;
        }
        else
        {
            tripOkButton.setEnabled(false);
            return false;
        }
    }
}
