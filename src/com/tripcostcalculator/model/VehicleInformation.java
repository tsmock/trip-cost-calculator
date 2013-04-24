package com.tripcostcalculator.model;

import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import com.tripcostcalculator.information.WebsiteInformation;

// -------------------------------------------------------------------------
/**
 * We retrieve data from a website and interpret it.
 *
 * @author Taylor Smock (tsmock)
 * @version Apr 4, 2013
 */

public class VehicleInformation
{
    private WebsiteInformation info;
    private WebsiteInformation manufacturer;
    private String             manufacturerString;
    private WebsiteInformation makeModel;
    private String             makeModelString;
    private WebsiteInformation vehicle;
    private String             vehicleString;


    /**
     * We initialize vehicle information.
     */
    public VehicleInformation()
    {
        info =
            new WebsiteInformation(
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
     * @param manufacturerString
     *            the manufacturerString to set
     */
    public void setManufacturerString(String manufacturerString)
    {
        this.manufacturerString = manufacturerString;
        String addURL = "&make=" + this.manufacturerString;
        this.manufacturer =
            new WebsiteInformation(info.getWebsiteURL() + addURL, "model.info");
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
     * @param makeModelString
     *            the makeModelString to set
     */
    public void setMakeModelString(String makeModelString)
    {
        this.makeModelString = makeModelString;
        String addURL = "&model=" + makeModelString;
        this.makeModel =
            new WebsiteInformation(
                manufacturer.getWebsiteURL() + addURL,
                "vehicle.info");
        // add logic to get next web page
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
     * @param vehicleString
     *            the vehicleString to set
     */
    public void setVehicleString(String vehicleString)
    {
        this.vehicleString = vehicleString;
        // TODO add logic to get the next web page/set of information
    }


    // ----------------------------------------------------------
    /**
     * @return the manufacturer
     */
    public WebsiteInformation getManufacturer()
    {
        return manufacturer;
    }


    // ----------------------------------------------------------
    /**
     * @param manufacturer
     *            the manufacturer to set
     */
    public void setManufacturer(WebsiteInformation manufacturer)
    {
        this.manufacturer = manufacturer; // TODO fill in info automagically
    }


    // ----------------------------------------------------------
    /**
     * @return the makeModel
     */
    public WebsiteInformation getMakeModel()
    {
        return makeModel;
    }


    // ----------------------------------------------------------
    /**
     * @param makeModel
     *            the makeModel to set
     */
    public void setMakeModel(WebsiteInformation makeModel)
    {
        this.makeModel = makeModel;// TODO fill in info automagically
    }


    // ----------------------------------------------------------
    /**
     * @return the vehicle
     */
    public WebsiteInformation getVehicle()
    {
        return vehicle;
    }


    // ----------------------------------------------------------
    /**
     * @param vehicle
     *            the vehicle to set
     */
    public void setVehicle(WebsiteInformation vehicle)
    {
        this.vehicle = vehicle; // TODO fill in info automagically
    }

}
