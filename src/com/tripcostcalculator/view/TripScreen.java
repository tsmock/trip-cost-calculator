package com.tripcostcalculator.view;

import com.tripcostcalculator.model.TripLocation;
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
     * Initialize all of the screen elements and initializes variables from
     * other screens.
     *
     * @param mpg
     *            the miles per gallon from the AutoScreen class.
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
        presentScreen(MapScreen.class, autoCost, publicCost, start, end);
    }


    /**
     * Check if endLoc has been updated
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
     * Check if startLoc has been updated
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
     * Check if gas price has been updated
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

            start = trip.getStartLatLong();
            end = trip.setDestination(tripEnd);
            autoCost = trip.getDrivingCost(autoMPG, autoGasPrice);
            publicCost = trip.getPublicTransportCost(costPerMile);

            tripOkButton.setEnabled(true);
        }
        else
        {
            tripOkButton.setEnabled(false);
        }
    }
}
