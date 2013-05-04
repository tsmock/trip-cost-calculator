package com.tripcostcalculator.view;

import android.widget.Button;
import android.widget.EditText;

// -------------------------------------------------------------------------
/**
 * Tests all of the methods within the TripScreen Class
 *
 * @author Gareth Griffith (gareth00)
 * @version May 3, 2013
 */

public class TripScreenTest
    extends student.AndroidTestCase<TripScreen>
{
    private EditText startLoc;
    private EditText endLoc;
    private EditText gasPrice;
    private Button   tripOkButton;


    // ----------------------------------------------------------
    /**
     * Create a new TripScreenTest object.
     */
    public TripScreenTest()
    {
        super(TripScreen.class);
    }


    // ----------------------------------------------------------
    /**
     * Sets up the elements for each test.
     */
    protected void setUp()
    {
        // nothing to set up
    }


    /**
     * Test method to make sure that all of the EditText fields have been filled
     * out and that the tripOk button has been enabled.
     */
    public void testTripOkButtonClicked()
    {
        enterText(startLoc, "here");
        enterText(endLoc, "there");
        enterText(gasPrice, "3.30");

        click(tripOkButton);
    }
}
