package com.tripcostcalculator.model;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

// -------------------------------------------------------------------------
/**
 *  We test the map class here
 *
 *  @author Taylor Smock (tsmock)
 *  @version Mar 7, 2013
 */

public class MapTest
{
    private Map map;
    // ----------------------------------------------------------
    /**
     * Initializes the necessary variables.
     * @throws java.lang.Exception
     */
    @Before
    public void setUp()
        throws Exception
    {
        map = new Map("VT", "Nowhere");
    }


    /**
     * Test method for {@link com.tripcostcalculator.model.Map#setStart(java.lang.String)}.
     */
    @Test
    public void testSetStart()
    {
        assertEquals("VT", map.getStart());
        map.setStart("D.C.");
        assertEquals("D.C.", map.getStart());
    }


    /**
     * Test method for {@link com.tripcostcalculator.model.Map#getStart()}.
     */
    @Test
    public void testGetStart()
    {
        assertEquals("VT", map.getStart());
    }


    /**
     * Test method for {@link com.tripcostcalculator.model.Map#setEnd(java.lang.String)}.
     */
    @Test
    public void testSetEnd()
    {
        assertEquals("Nowhere", map.getEnd());
        map.setEnd("Vermont");
        assertEquals("Vermont", map.getEnd());
    }


    /**
     * Test method for {@link com.tripcostcalculator.model.Map#getEnd()}.
     */
    @Test
    public void testGetEnd()
    {
        assertEquals("Nowhere", map.getEnd());
    }

}
