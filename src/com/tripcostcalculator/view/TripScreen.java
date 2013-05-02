package com.tripcostcalculator.view;

import com.tripcostcalculator.model.TripLocation;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
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
    private EditText     startLoc;
    private EditText     endLoc;
    private EditText     gasPrice;
    private Button       tripOkButton;
    private Double       autoMPG;
    private String       start;
    private String       end;
    private String       publicCost;
    private String       autoCost;
    private TripLocation trip;
    private Double       costPerMile = 1.79;
    private boolean[]    done;


    // ----------------------------------------------------------
    /**
     * We initialize the trip screen (where we go, where we start)
     */
    public void initialize(Double mpg)
    {

        autoMPG = mpg;
        tripOkButton.setEnabled(false);
        startLoc.setText("");
        endLoc.setText("");
        gasPrice.setText("");

        done = new boolean[] { false, false, false };

    }


    // ----------------------------------------------------------
    /**
     * We start calculations and take user to the map screen.
     */
    public void tripOkButtonClicked()
    {
        // take us to the map page
        // Log.d("TRIP TEST", autoCost + " " + publicCost);
        // Log.d("TESTING", autoMPG.toString());
        Log.d("TRIP OK", gasPrice.getText().toString() + " "
            + startLoc.getText().toString() + " " + endLoc.getText().toString());
        Log.d("TRIP OK", autoCost + " " + publicCost + " " + start + " " + end);

        presentScreen(MapScreen.class, autoCost, publicCost, start, end);

    }


    /**
     * endLoc has been updated
     */
    public void endLocEditingDone()
    {
        if (endLoc.getText().toString() != "")
        {
            done[0] = true;
        }
        else
        {
            done[0] = false;
        }
        this.update();
    }


    /**
     * startLoc has been updated
     */
    public void startLocEditingDone()
    {
        if (startLoc.getText().toString() != "")
        {
            done[1] = true;
        }
        else
        {
            done[1] = false;
        }
        this.update();
    }


    /**
     * Gas price has been updated
     */
    public void gasPriceEditingDone()
    {
        if (gasPrice.getText().toString() != "")
        {
            done[2] = true;
        }
        else
        {
            done[2] = false;
        }
        this.update();
    }


    /**
     * Checks the status of the editingDone() fields and sets the tripOkButton
     * to true if all of the fields have been filled out.
     */
    private void update()
    {
        if (done[0] && done[1] && done[2])
        {
            String tripStart = (startLoc.getText().toString());
            String tripEnd = (endLoc.getText().toString());
            Double autoGasPrice =
                Double.parseDouble(gasPrice.getText().toString());

            trip = new TripLocation(tripStart);
            // push these to the map screen
            autoCost = trip.getDrivingCost(autoMPG, autoGasPrice);
            publicCost = trip.getPublicTransportCost(costPerMile);
            start = trip.getStartLatLong();
            end = trip.setDestination(tripEnd);

            tripOkButton.setEnabled(true);
        }
        else
        {
            tripOkButton.setEnabled(false);
        }
    }
}
