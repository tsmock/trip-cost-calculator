package com.tripcostcalculator.information;

import java.io.File;
import java.net.MalformedURLException;
import java.io.IOException;
import java.nio.channels.Channels;
import java.io.FileOutputStream;
import java.nio.channels.ReadableByteChannel;
import java.net.URL;

// -------------------------------------------------------------------------
/**
 * We get information from the web and store it in the class.
 *
 * @author Taylor Smock (tsmock)
 * @version Mar 31, 2013
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
        File f = new File(this.filename);
        if (f.exists())
        {
            if (!this.removeFile()) //TODO test
            {
                System.out.println("The file, " + this.filename +
                    " was not deleted. Returning.");
                return;
            }
            else
            {
                this.filename = filename1;
            }
        }
        URL website;
        try
        {
            website = new URL(this.websiteURL);
            try
            {
                //We get the webpage and then save it to disk
                ReadableByteChannel rbc;
                // getting page
                rbc = Channels.newChannel(website.openStream());
                //saving page
                FileOutputStream fos = new FileOutputStream(filename1);
                fos.getChannel().transferFrom(rbc, 0, 1 << 24);
                //freeing memory
                fos.close();
                rbc.close();
            }
            catch (IOException e) //TODO test
            {
                System.out.println("Bad web page");
                e.printStackTrace();
            }

        }
        catch (MalformedURLException e1) //TODO test
        {
            System.out.println("Malformed url");
            e1.printStackTrace();
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
        if (f.exists() && !f.delete()) //TODO test (find way to make file unwritable?)
        {
            System.out.println("File not deleted");
            return false;
        }
        else
        {
            return true;
        }
    }
}
