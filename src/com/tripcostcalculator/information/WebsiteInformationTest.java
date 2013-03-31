package com.tripcostcalculator.information;

import static org.junit.Assert.*;
import java.io.File;
import org.junit.Before;
import org.junit.Test;

// -------------------------------------------------------------------------
/**
 * We test the WebsiteInformation stuff...
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

public class WebsiteInformationTest
{
    private WebsiteInformation url;


    // ----------------------------------------------------------
    /**
     * We set up the basics.
     *
     * @throws java.lang.Exception
     */
    @Before
    public void setUp()
        throws Exception
    {
        url = new WebsiteInformation("https://www.google.com", "google");
    }


    /**
     * Test method for
     * {@link com.tripcostcalculator.information.WebsiteInformation#saveFile()}.
     */
    @Test
    public void testSaveFile()
    {
        File f = new File("google");
        assertFalse(f.exists());
        url.saveFile();
        assertTrue(f.exists());
        f.delete();
    }


    /**
     * Test method for
     * {@link com.tripcostcalculator.information.WebsiteInformation#saveFile(java.lang.String)}
     * .
     */
    @Test
    public void testSaveFileString()
    {
        File f = new File("google2");
        assertFalse(f.exists());
        url.saveFile("google2");
        assertTrue(f.exists());
        f.delete();
    }

    /**
     * Test method for
     * {@link com.tripcostcalculator.information.WebsiteInformation#removeFile()}
     */
    @Test
    public void testRemoveFile()
    {
        File f = new File("google");
        assertFalse(f.exists());
        url.saveFile();
        assertTrue(f.exists());
        url.removeFile();
        assertFalse(f.exists());
    }

}
