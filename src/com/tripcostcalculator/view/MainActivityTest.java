package com.tripcostcalculator.view;

import android.widget.Button;
import junit.framework.TestCase;

// -------------------------------------------------------------------------
/**
 * Tests all of the screen items that are on the MainActivity screen.
 *
 * @author Gareth Griffith (gareth00)
 * @version May 3, 2013
 */

public class MainActivityTest
    extends student.AndroidTestCase<MainActivity>
{
    private Button defineCar;
    private Button calcTrip;


    // ----------------------------------------------------------
    /**
     * Create a new MainActivityTest object.
     */
    public MainActivityTest()
    {
        super(MainActivity.class);
    }


    // ----------------------------------------------------------
    public void setUp()
    {
        // nothing set up.
    }


    /**
     * Test method for
     * {@link com.tripcostcalculator.view.MainActivity#defineCarClicked()}.
     */
    public void testDefineCarClicked()
    {
        click(defineCar);
    }


    /**
     * Test method for
     * {@link com.tripcostcalculator.view.MainActivity#calcTripClicked()}.
     */
    public void testCalcTripClicked()
    {
        click(calcTrip);
    }

}
