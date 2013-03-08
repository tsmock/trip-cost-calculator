package com.tripcostcalculator.model;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

// -------------------------------------------------------------------------
/**
 *  We test the toll class.
 *
 *  @author Taylor Smock (tsmock)
 *  @version Mar 7, 2013
 */

public class TollTest
{
    private Toll toll;
    private float tollAmount;
    private String tollName;
    private float tollDistance;

    // ----------------------------------------------------------
    /**
     * Set up toll.
     * @throws java.lang.Exception
     */
    @Before
    public void setUp()
        throws Exception
    {
        tollAmount = 50;
        tollName = "VM";
        tollDistance = 30;
        toll = new Toll(tollName, tollDistance, tollAmount);
    }


    /**
     * We test the get name method
     */
    @Test
    public void testGetName()
    {
        assertEquals(tollName, toll.getName());
    }


    /**
     * We test the getToll method
     */
    @Test
    public void testGetCosts()
    {
        assertEquals(tollAmount, toll.getCosts(), 0.1);
    }


    /**
     * We test the setToll method
     */
    @Test
    public void testSetCosts()
    {
        assertEquals(tollAmount, toll.getCosts(), 0.1);
        toll.setCosts(10);
        assertEquals(10, toll.getCosts(), 0.1);
    }



    /**
     * We test the distance get methods
     */
    @Test
    public void testGetDistance()
    {
        assertEquals(this.tollDistance, toll.getDistance(), 0.1);
    }


    /**
     * We test setting the distance
     */
    @Test
    public void testSetDistance()
    {
        assertEquals(this.tollDistance, toll.getDistance(), 0.1);
        toll.setDistance(1);
        assertEquals(1, toll.getDistance(), 0.1);
    }

}
