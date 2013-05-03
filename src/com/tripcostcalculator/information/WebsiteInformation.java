package com.tripcostcalculator.information;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

// -------------------------------------------------------------------------
/**
 * We get information from the web and store it in the class.
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

public class WebsiteInformation
{
    /** The url of the website */
    String websiteURL;
    /** The default filename if we save the file */
    String filename;


    // ----------------------------------------------------------
    /**
     * Create a new WebsiteInformation object.
     * @param website The website that we are pulling information from
     * @param filename The filename that we want to store information as
     * (by default)
     */
    public WebsiteInformation(String website, String filename)
    {
        this.websiteURL = website;
        this.filename = filename;
    }

    /**
     * We save the url file with the name specified in the constructor
     */
    public void saveFile()
    {
        this.saveFile(this.filename);
    }

    // ----------------------------------------------------------
    /**
     * We save the url file
     * @param filename1 The name of the file to save to (we should already have
     * the web page). If we already have a file, we remove that file.
     */
    public void saveFile(String filename1)
    {
        try
        {
            URL website;
            website = new URL(this.websiteURL);
            PrintWriter out = new PrintWriter(this.filename);
            out.write(website.getFile());
            out.close();

        }
        catch (MalformedURLException e1) //TODO test
        {
            System.out.println("Malformed url");
            e1.printStackTrace();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("No file found");
            e.printStackTrace();
        }
    }



    /**
     * We remove the file.
     * @return Was the file successfully removed?
     */
    public boolean removeFile()
    {
        File f = new File(this.filename);
        // if f does not exist then we do not need to delete.
        if (!f.delete())
        {
            System.out.println("File not deleted");
            return false;
        }
        else
        {
            return true;
        }
    }

    // ----------------------------------------------------------
    /**
     * @return The website URL
     */
    public String getWebsiteURL()
    {
        return this.websiteURL;
    }
}
