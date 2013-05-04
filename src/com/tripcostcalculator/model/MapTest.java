package com.tripcostcalculator.model;

import junit.framework.TestCase;

// -------------------------------------------------------------------------
/**
 * We test the map class here
 *
 * @author Taylor Smock (tsmock)
 * @version Mar 7, 2013 This file is part of the Trip Cost Calculator. Trip Cost
 *          Calculator is free software: you can redistribute it and/or modify
 *          it under the terms of the GNU General Public License as published by
 *          the Free Software Foundation, either version 3 of the License, or
 *          (at your option) any later version. Trip Cost Calculator is
 *          distributed in the hope that it will be useful, but WITHOUT ANY
 *          WARRANTY; without even the implied warranty of MERCHANTABILITY or
 *          FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 *          for more details. You should have received a copy of the GNU General
 *          Public License along with Trip Cost Calculator. If not, see
 *          <http://www.gnu.org/licenses/>.
 */

public class MapTest
    extends TestCase
{
    private Map map;


    // ----------------------------------------------------------
    /**
     * Initializes the necessary variables.
     *
     * @throws java.lang.Exception
     */
    public void setUp()
        throws Exception
    {
        map = new Map("VT", "Nowhere");
    }


    /**
     * Test method for
     * {@link com.tripcostcalculator.model.Map#setStart(java.lang.String)}.
     */
    public void testSetStart()
    {
        assertEquals("VT", map.getStart());
        map.setStart("D.C.");
        assertEquals("D.C.", map.getStart());
    }


    /**
     * Test method for {@link com.tripcostcalculator.model.Map#getStart()}.
     */
    public void testGetStart()
    {
        assertEquals("VT", map.getStart());
    }


    /**
     * Test method for
     * {@link com.tripcostcalculator.model.Map#setEnd(java.lang.String)}.
     */
    public void testSetEnd()
    {
        assertEquals("Nowhere", map.getEnd());
        map.setEnd("Vermont");
        assertEquals("Vermont", map.getEnd());
    }


    /**
     * Test method for {@link com.tripcostcalculator.model.Map#getEnd()}.
     */
    public void testGetEnd()
    {
        assertEquals("Nowhere", map.getEnd());
    }

}
