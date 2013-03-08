package com.tripcostcalculator.model;

// -------------------------------------------------------------------------
/**
 *  We need to get the maps here
 *
 *  @author Taylor Smock (tsmock)
 *  @version Mar 7, 2013
 */

public class Map
{
    /** The beginning address */
    String begin;
    /** The ending address */
    String end;
    /**
     * @param begin The beginning address
     * @param end The ending address
     */
    public Map (String begin, String end)
    {
        this.begin = begin;
        this.end = end;
        //TODO figure out Maps API
    }



    /**
     * @param begin The new beginning address
     */
    public void setStart(String begin)
    {
        this.begin = begin;
    }


    /**
     * @return The beginning address
     */
    public String getStart()
    {
        return this.begin;
    }



    /**
     * @param end The new end address
     */
    public void setEnd(String end)
    {
        this.end = end;
    }



    /**
     * @return The end address
     */
    public String getEnd()
    {
        return this.end;
    }
}
