package com.tripcostcalculator.view;

import android.util.Log;
//import android.view.View;
//import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import sofia.app.Screen;

// -------------------------------------------------------------------------
/**
 * We get car information.
 *
 * @author Gareth Griffith (gareth00)
 * @author Taylor Smock (tsmock)
 * @version Apr 8, 2013
 */

public class AutoScreen
    extends Screen
{
    private Button    autoOk;
    private EditText  autoMPG;
    private EditText  autoYear;
    private EditText  autoMake;
    private EditText  autoModel;
    private boolean[] done;


    public void initialize()
    {
        autoOk.setEnabled(false);
        autoMPG.setText("");
        autoYear.setText("");
        autoMake.setText("");
        autoModel.setText("");
        done = new boolean[] { false, false, false, false };
        Log.d("Works", "works");
    }


    // ----------------------------------------------------------
    /**
     * We store the values and go back to the trip page.
     */
    public void autoOkClicked()
    {
        Log.d("clicked", "clicked");
        presentScreen(TripScreen.class);
    }


    // ----------------------------------------------------------
    /**
     * Called when we finish editing the make of the vehicle.
     */
    public void autoMakeEditingDone()
    {
        Log.d("AUTO", "Make");
        if (autoMake.getText().toString() != "")
        {
            done[1] = true; // TODO add more stuff
            Log.d("Editing Done", "true");
        }
        else
        {
            done[1] = false;
            Log.d("Editing Done", "false");

        }
        this.update();
    }


    // ----------------------------------------------------------
    /**
     * Called when we are done editing the model of the vehicle.
     */
    public void autoModelEditingDone()
    {
        Log.d("AUTO", "Model");
        if (autoModel.getText().toString() != "")
        {
            done[2] = true; // TODO add more stuff
        }
        else
        {
            done[2] = false;
        }
        this.update();
    }


    // ----------------------------------------------------------
    /**
     * Called when we are done editing the year of the vehicle.
     */
    public void autoYearEditingDone()
    {
        Log.d("AUTO", "YEAR");
        if (autoYear.getText().toString() != "")
        {
            done[0] = true; // TODO add more stuff here.
        }
        else
        {
            done[0] = false;
        }
        this.update();
    }


    // ----------------------------------------------------------
    /**
     * Called when we are done editing..
     */
    public void autoMPGEditingDone()
    {
        Log.d("AUTO", "MPG");

        if (autoMPG.getText().toString() != "")
        {
            done[3] = true; // TODO add more stuff here
            Log.d("output", "true");
        }
        else
        {
            done[3] = false;
            Log.d("output", "false");

        }
        this.update();
    }


    /**
     * Are we done editing
     *
     * @return do we have sufficient information go get MPG?
     */
    private boolean update()
    {
        // done[3] is the mpg. done[0-2] give enough info to get MPG
        if (done[3] || (done[0] && done[1] && done[2]))
        {
            autoOk.setEnabled(true);
            return true;
        }
        else
        {
            autoOk.setEnabled(false);
            return false;
        }
    }
}
