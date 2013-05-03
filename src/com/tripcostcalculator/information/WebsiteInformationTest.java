package com.tripcostcalculator.information;

import java.io.IOException;
import junit.framework.TestCase;
import java.io.File;

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

public class WebsiteInformationTest extends TestCase
{
    private WebsiteInformation url;


    // ----------------------------------------------------------
    /**
     * We set up the basics.
     *
     * @throws java.lang.Exception
     */
    public void setUp()
        throws Exception
    {
        url = new WebsiteInformation("https://www.google.com", "google");
    }


    /**
     * Test method for
     * {@link com.tripcostcalculator.information.WebsiteInformation#saveFile()}.
     */
    public void testSaveFile()
    {
        File f = new File("google");
        f.delete();
        url.saveFile();
        assertTrue(f.exists());
        url.removeFile();
        assertFalse(f.exists());
    }


    /**
     * Test method for
     * {@link com.tripcostcalculator.information.WebsiteInformation#saveFile(java.lang.String)}
     * .
     */
    public void testSaveFileStringExceptions()
    {
        File f = new File("google");
        f.delete();
        url = new WebsiteInformation("", "nothing");
        url.saveFile("something");
        url = new WebsiteInformation("https://www.google.com", "google");
        f.mkdir();
        url.saveFile();
        f.delete();
        assertFalse(f.exists());


    }

    /**
     * Test method for
     * {@link com.tripcostcalculator.information.WebsiteInformation#removeFile()}
     * @throws IOException Should not occur -- carefully chosen...
     */
    public void testRemoveFile() throws IOException
    {
        File f = new File("google");
        f.delete();
        assertFalse(f.exists());
        url.removeFile();
        url.saveFile();
        assertTrue(f.exists());
        url.removeFile();
        assertFalse(f.exists());
        //Testing with directories
        f = new File("google");
        f.mkdir();
        File f2 = new File("google/1");
        f2.createNewFile();
        assertFalse(url.removeFile());
        assertTrue(f2.delete());
        assertTrue(f.delete());
    }


    /**
     * Test method for
     * {@link com.tripcostcalculator.information.WebsiteInformation#getWebsiteURL()}
     */
    public void testGetWebsiteURL()
    {
        assertEquals("https://www.google.com", url.getWebsiteURL());
    }

}
