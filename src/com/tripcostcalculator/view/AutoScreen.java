package com.tripcostcalculator.view;

import android.widget.Button;
import android.widget.EditText;
import sofia.app.Screen;
// -------------------------------------------------------------------------
/**
 *  Write a one-sentence summary of your class here.
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author Gareth Griffith (gareth00)
 *  @version Apr 8, 2013
 */

public class AutoScreen extends Screen
{
    private Button autoOk;
    private EditText autoMPG;
    private EditText autoYear;
    private EditText autoMake;
    private EditText autoModel;

    public void initialize()
    {
        //maybe set the button to always be true if it makes everything easier
        //to run
        autoOk.setEnabled(false);
        autoMPG.setText("");
        autoYear.setText("");
        autoMake.setText("");
        autoModel.setText("");
    }



    public void autoOkClicked()
    {
        //store values and go to the trip page
    }

}
