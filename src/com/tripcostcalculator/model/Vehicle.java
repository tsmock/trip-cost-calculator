package com.tripcostcalculator.model;

// -------------------------------------------------------------------------
/**
 *  We do stuff with vehicles
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

public class Vehicle
{
    private Double mpg;

    // ----------------------------------------------------------
    /**
     * Create a new Vehicle object.
     * @param make The make of the model
     * @param model The model
     * @param year The year the model was made in
     */
    public Vehicle(String make, String model, String year)
    {
        TripHashMap map = new TripHashMap();
        mpg = map.vehicleMap(year + " " + make + " " + model);
        if (mpg == null)
        {
            mpg = 0.0;
        }
    }

    // ----------------------------------------------------------
    /**
     * @return The MPG of the vehicle given.
     */
    public double getMPG()
    {
        return this.mpg;
    }
}
