package com.tripcostcalculator.view;

import com.tripcostcalculator.R;
import com.tripcostcalculator.R.layout;
import com.tripcostcalculator.R.menu;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

// -------------------------------------------------------------------------
/**
 *  Starts the android application
 *
 *  @author Taylor Smock (tsmock)
 *  @version Mar 7, 2013
 */
public class MainActivity
    extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
