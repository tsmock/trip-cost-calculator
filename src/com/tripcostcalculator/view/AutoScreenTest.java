package com.tripcostcalculator.view;

import android.widget.EditText;
import android.widget.Button;

// -------------------------------------------------------------------------
/**
 * Tests all of the items that are on the AutoScreen() GUI screen
 *
 * @author Gareth Griffith (gareth00)
 * @version May 3, 2013
 */
public class AutoScreenTest
    extends student.AndroidTestCase<AutoScreen>
{
// private AutoScreen screen;
    private Button   autoOk;
    private EditText autoMake;
    private EditText autoModel;
    private EditText autoYear;
    private EditText autoMPG;


    // ----------------------------------------------------------
    /**
     * Create a new AutoScreenTest object.
     */
    public AutoScreenTest()
    {
        super(AutoScreen.class);
    }


    // ----------------------------------------------------------
    /**
     * Sets up the AutoScreen tests
     */

    protected void setUp()
    {
        // nothing to set up
    }


    // ----------------------------------------------------------
    /**
     * Tests the edit text boxes and the status of the autoOk button and clicks
     * it when active
     */
    public void testAutoOkClickedCar()
    {
        enterText(autoMPG, "20.0");
        enterText(autoMake, "honda");
        enterText(autoModel, "accord");
        enterText(autoYear, "2013");
        assertEquals("30.0", autoMPG.getText());
        click(autoOk);

    }

}
