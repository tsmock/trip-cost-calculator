package com.tripcostcalculator.model;

import java.util.ArrayList;
import java.util.Scanner;
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
    private Vehicle            vehicleObj;


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
        this.vehicleString = vehicleString;// TODO get the vehicle ID instead
        this.makeModel.saveFile();

        String id = this.fileToString("vehicle.info");
        id = id.substring(0, id.lastIndexOf(this.vehicleString));
        id = id.substring(id.lastIndexOf("vehicleID=") + 10);
        id = id.substring(0, id.indexOf("&"));
        this.vehicle =
            new WebsiteInformation(
                "http://www.fueleconomy.gov/mpg/MPG.do?action=mpgData"
                    + "&vehicleID=" + id + "&browser=false&details=off",
                "vehicleMPG.info");
        //float mpg = 0; // TODO change mpg somewhere
        //this.vehicleObj =
        //    new Vehicle(this.vehicleString, mpg, this.vehicle.getWebsiteURL());
    }


    // ----------------------------------------------------------
    /**
     * @param vehicle
     *            The website information object TODO remove
     */
    public void setVehicle(WebsiteInformation vehicle)
    {
        this.vehicle = vehicle; // TODO fill in info automagically
        this.vehicle.saveFile();
    }


    // ----------------------------------------------------------
    /**
     * @return The vehicle that we have gotten information on.
     */
    public Vehicle getVehicleInfo()
    {
        return this.vehicleObj;
    }


    private String fileToString(String file)
    {
        Scanner scanner = new Scanner(file);
        String string = "";
        while (scanner.hasNext())
        {
            string = string + scanner.next();
        }
        scanner.close();
        return string;
    }


    // ----------------------------------------------------------
    /**
     * Should get the years.
     * @return An array list of available years
     */
    public ArrayList<String> getYears()
    {
        ArrayList<String> years = new ArrayList<String>();
        years.add(0, "2013");
        return years;
    }

}
