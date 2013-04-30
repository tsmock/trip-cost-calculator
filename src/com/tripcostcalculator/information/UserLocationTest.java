package com.tripcostcalculator.information;

import junit.framework.TestCase;
import com.tripcostcalculator.view.MainActivity;
import android.location.LocationManager;

// -------------------------------------------------------------------------
/**
 * We test the UserLocation class
 *
 * @author Taylor Smock (tsmock)
 * @version Mar 31, 2013
 *
 *  This file is part of the Trip Cost Calculator.
 *
 *  Trip Cost Calculator is free software: you can redistribute it
 *  and/or modify it under the terms of the GNU General Public License
 *  as published by the Free Software Foundation, either version 3 of the
 *  License, or (at your option) any later version.
 *
 *  Trip Cost Calculator is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *  See the GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with Trip Cost Calculator.  If not, see
 *  <http://www.gnu.org/licenses/>.
 */

public class UserLocationTest extends TestCase
{
    /**
     * This is needed for testing -- can't get some information otherwise
     * (that I know of, anyway)
     */
    MainActivity main;
    /**
     * We set up the basics.
     *
     * @throws java.lang.Exception
     */
    public void setUp()
        throws Exception
    {
        main = new MainActivity();
    }

    /**
     * Test method for
     * {@link com.tripcostcalculator.information.UserLocation#getLocationProvider()}
     * .
     */

    public void testGetLocationProvider()
    {
        //Don't know what provider I'm going to get //TODO Find a way to test
        // different providers
        assertNotNull(main.loc.getLocationProvider());
    }


    /**
     * Test method for
     * {@link com.tripcostcalculator.information.UserLocation#setLocationProvider(java.lang.String)}
     * .
     */

    public void testSetLocationProvider()
    {
        main.loc.setLocationProvider(LocationManager.GPS_PROVIDER);
        assertEquals(LocationManager.GPS_PROVIDER,
            main.loc.getLocationProvider());
        main.loc.setLocationProvider(LocationManager.NETWORK_PROVIDER);
        assertEquals(LocationManager.NETWORK_PROVIDER,
            main.loc.getLocationProvider());
    }


    /**
     * Test method for
     * {@link com.tripcostcalculator.information.UserLocation#updateLoc()}.
     */
    public void testUpdateLoc()
    {
        fail("Not yet implemented"); // TODO
    }


    /**
     * Test method for
     * {@link com.tripcostcalculator.information.UserLocation#getLastLoc()}.
     */
    public void testGetLastLoc()
    {
        fail("Not yet implemented"); // TODO
    }


    /**
     * Test method for
     * {@link com.tripcostcalculator.information.UserLocation#setLastLoc(android.location.Location)}
     * .
     */
    public void testSetLastLoc()
    {
        fail("Not yet implemented"); // TODO
    }

}
