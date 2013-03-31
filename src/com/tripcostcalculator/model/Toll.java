package com.tripcostcalculator.model;

// -------------------------------------------------------------------------
/**
 *  We use this to calculate tolls
 *
 *  @author Taylor Smock
 *  @version Mar 7, 2013
 *
 * This file is part of the Trip Cost Calculator.
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

public class Toll extends Route
{
    /** The amount that the toll is */
    private float toll;
    /**
     * @param name The name of the toll road
     * @param toll The toll of the toll road
     * @param distance The length of the toll road
     */
    public Toll(String name, float distance, float toll)
    {
        super(name, distance);
        this.setToll(toll);
    }
    // ----------------------------------------------------------
    /**
     * @return the toll
     */
    public float getToll()
    {
        return toll;
    }
    // ----------------------------------------------------------
    /**
     * @param toll the toll to set
     */
    public void setToll(float toll)
    {
        this.toll = toll;
    }
}
