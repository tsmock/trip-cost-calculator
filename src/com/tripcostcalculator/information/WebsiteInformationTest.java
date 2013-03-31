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
