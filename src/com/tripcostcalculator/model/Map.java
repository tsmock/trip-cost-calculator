package com.tripcostcalculator.model;

// -------------------------------------------------------------------------
/**
 *  We need to get the maps here
 *
 *  @author Taylor Smock (tsmock)
 *  @version Mar 7, 2013
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
