package com.tripcostcalculator.model;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.InputStream;
import com.tripcostcalculator.information.WebsiteInformation;

// -------------------------------------------------------------------------
/**
 *  We retrieve data from a website and interpret it.
 *
 *  @author Taylor Smock (tsmock)
 *  @version Apr 4, 2013
 */

public class VehicleInformation
{
    private WebsiteInformation info;
    private WebsiteInformation manufacturer;
    private String manufacturerString;
    private WebsiteInformation makeModel;
    private String makeModelString;
    private WebsiteInformation vehicle;
    private String vehicleString;

    /**
     * We initialize vehicle information.
     */
    public VehicleInformation()
    {
        info = new WebsiteInformation(
            "http://www.fueleconomy.gov/mpg/MPG.do?action=browseList",
            "manufacturers.info");
        info.saveFile();
    }

    // ----------------------------------------------------------
    /**
     * @return the manufacturerString
     */
    public String getManufacturerString()
    {
        return manufacturerString;
    }

    // ----------------------------------------------------------
    /**
     * @param manufacturerString the manufacturerString to set
     */
    public void setManufacturerString(String manufacturerString)
    {
        this.manufacturerString = manufacturerString;
        try
        {
            FileInputStream stream = new FileInputStream("manufacturers.info");
            //stream.read(); //TODO finish this, copy logic to other classes or
            //abstract out (probably abstract out to a separate method)
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    // ----------------------------------------------------------
    /**
     * @return the makeModelString
     */
    public String getMakeModelString()
    {
        return makeModelString;
    }

    // ----------------------------------------------------------
    /**
     * @param makeModelString the makeModelString to set
     */
    public void setMakeModelString(String makeModelString)
    {
        this.makeModelString = makeModelString;
        //add logic to get next web page
    }

    // ----------------------------------------------------------
    /**
     * @return the vehicleString
     */
    public String getVehicleString()
    {
        return vehicleString;
    }

    // ----------------------------------------------------------
    /**
     * @param vehicleString the vehicleString to set
     */
    public void setVehicleString(String vehicleString)
    {
        this.vehicleString = vehicleString;
        //TODO add logic to get the next web page/set of information
    }




}
