package com.tripcostcalculator.model;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

// -------------------------------------------------------------------------
/**
 *  Runs all included tests
 *
 *  @author Taylor Smock (tsmock)
 *  @version Mar 7, 2013
 */
@RunWith(Suite.class)
@SuiteClasses({ MapTest.class, VehicleTest.class })
public class AllTests
{
    //This should do nothing.
}
