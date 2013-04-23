package com.tripcostcalculator.view;

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
        //maybe set the button to always be true if it makes everything easier
        //to run
        autoOk.setEnabled(false);
        autoMPG.setText("");
        autoYear.setText("");
        autoMake.setText("");
        autoModel.setText("");
        done = new boolean[] {false, false, false, false};
    }


    // ----------------------------------------------------------
    /**
     * We store the values and go back to the trip page.
     */
    public void autoOkClicked()
    {
        // store values and go to the trip page
    }


    // ----------------------------------------------------------
    /**
     * Called when we finish editing the make of the vehicle.
     */
    public void autoMakeEditingDone()
    {
        if (autoMake.getText().toString() != "")
        {
            done[1] = true; // TODO add more stuff
        }
        else
        {
            done[1] = false;
        }
        this.isEditingDone();
    }


    // ----------------------------------------------------------
    /**
     * Called when we are done editing the model of the vehicle.
     */
    public void autoModelEditingDone()
    {
        if (autoModel.getText().toString() != "")
        {
            done[2] = true; // TODO add more stuff
        }
        else
        {
            done[2] = false;
        }
        this.isEditingDone();
    }


    // ----------------------------------------------------------
    /**
     * Called when we are done editing the year of the vehicle.
     */
    public void autoYearEditingDone()
    {
        if (autoYear.getText().toString() != "")
        {
            done[0] = true; // TODO add more stuff here.
        }
        else
        {
            done[0] = false;
        }
        this.isEditingDone();
    }


    // ----------------------------------------------------------
    /**
     * Called when we are done editing..
     */
    public void autoMPGEditingDone()
    {
        if (autoMPG.getText().toString() != "")
        {
            done[3] = true; // TODO add more stuff here
        }
        else
        {
            done[3] = false;
        }
        this.isEditingDone();
    }


    /**
     * Are we done editing
     * @return do we have sufficient information go get MPG?
     */
    private boolean isEditingDone()
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
