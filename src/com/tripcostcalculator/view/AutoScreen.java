package com.tripcostcalculator.view;

import com.tripcostcalculator.model.Vehicle;
import android.util.Log;
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
    private Vehicle   auto;
    private Double    mpg;
    private boolean[] done;


    public void initialize()
    {
        autoOk.setEnabled(false);
        autoMPG.setText("");
        autoYear.setText("");
        autoMake.setText("");
        autoModel.setText("");
        done = new boolean[] { false, false, false, false };
    }


    // ----------------------------------------------------------
    /**
     * We store the values and go back to the trip page.
     */
    public void autoOkClicked()
    {
        presentScreen(TripScreen.class, mpg);
    }


    // ----------------------------------------------------------
    /**
     * Called when we finish editing the make of the vehicle.
     */
    public void autoMakeEditingDone()
    {
        if (autoMake.getText().toString() != "")
        {
            done[1] = true;
        }
        else
        {
            done[1] = false;

        }
        this.update();
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
        this.update();
    }


    // ----------------------------------------------------------
    /**
     * Called when we are done editing the year of the vehicle.
     */
    public void autoYearEditingDone()
    {
        if (autoYear.getText().toString() != "")
        {
            done[0] = true;
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

        if (autoMPG.getText().toString() != "")
        {
            done[3] = true;
        }
        else
        {
            done[3] = false;

        }
        this.update();

    }


    /**
     * Checks the status of the editingDone() fields and sets the autoOkButton
     * to true if all of the fields have been filled out.
     */
    private void update()
    {
        // done[3] is the mpg. done[0-2] give enough info to get MPG
        if (done[0] && done[1] && done[2])
        {
            auto =
                new Vehicle(autoMake.getText().toString(), autoModel.getText().toString(), autoYear.getText().toString());
            mpg = auto.getMPG();
            autoMPG.setText(String.valueOf(mpg));
            autoOk.setEnabled(true);
        }
        else if(done[3])
        {
            autoOk.setEnabled(true);
        }
        else
        {
            autoOk.setEnabled(false);
        }
    }
}
