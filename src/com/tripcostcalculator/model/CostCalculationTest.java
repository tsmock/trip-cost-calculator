package com.tripcostcalculator.model;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

// -------------------------------------------------------------------------
/**
 *  Testing the cost calculation stuff.
 *
 *  @author Taylor Smock (tsmock)
 *  @version Mar 8, 2013
 */

public class CostCalculationTest
{
    private CostCalculation test;

    // ----------------------------------------------------------
    /**
     * We set up variables.
     * @throws java.lang.Exception
     */
    @Before
    public void setUp()
        throws Exception
    {
        test = new CostCalculation();
    }


    /**
     * We test adding routes. Also getting (some) routes
     */
    @Test
    public void testAddRoutesGetRoutes()
    {
        fail("Not yet implemented"); // TODO
        test.addRoutes(new Toll("New York City Bridge", 10, 40));
        assertEquals("New York City Bridge",
            test.getRoutes("New York City Bridge").getName());
    }


    /**
     * We test that null comes back if there is no route
     */
    @Test
    public void testGetNullRoutes()
    {
        assertNull(test.getRoutes("The non-existent plane"));
    }

}
