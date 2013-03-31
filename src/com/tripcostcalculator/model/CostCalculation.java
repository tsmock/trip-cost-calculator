package com.tripcostcalculator.model;

import java.util.ArrayList;

// -------------------------------------------------------------------------
/**
 *  We calculate the cost of a trip
 *
 *  @author Taylor Smock (tsmock)
 *  @version Mar 8, 2013
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

public class CostCalculation
{
    /** The directions on how to get somewhere */
    ArrayList<Route> mapDirections;
    /** The vehicle to use */
    Vehicle vehicle;



    /**
     * We make a new costcalculation with a vehicle
     * @param vehicle The vehicle to base costs off of.
     */
    public CostCalculation(Vehicle vehicle)
    {
        this.vehicle = vehicle;
        this.mapDirections = new ArrayList<Route>();
    }



    /**
     * @param string The specific string for the route
     * @return The route that goes with the specified string
     */
    public Route getRoutes(String string)
    {
        Route rightRoute = null;
        for (Route route : mapDirections)
        {
            if (route.getName().equalsIgnoreCase(string))
            {
                rightRoute = route;
            }
        }
        return rightRoute;
    }
    /**
     * @param newRoute The route to add
     */
    public void addRoutes(Route newRoute)
    {
        if (newRoute != null)
        {
            //TODO check to see if size returns size or size - 1
            this.addRoutes(newRoute, mapDirections.size() - 1);
        }
    }


    /**
     * @param newRoute The route to add
     * @param index The index to add it at
     */
    public void addRoutes(Route newRoute, int index)
    {
        if (newRoute != null)
        {
            this.mapDirections.add(index, newRoute);
        }
    }


    /**
     * @return the vehicle that is used for this trip
     */
    public Vehicle getVehicle() //TODO test
    {
        return this.vehicle;
    }


    /**
     * @param vehicle The vehicle to use
     */
    public void setVehicle(Vehicle vehicle) //TODO test
    {
        this.vehicle = vehicle;
    }


    /**
     * We calculate the costs
     * @return The total cost of the trip
     */
    public float tripCost()
    {
        float mpg = this.vehicle.getMpg();
        float totalCost = 0;
        for (Route route : mapDirections)
        {
            totalCost += route.getDistance() / mpg * route.getGasCost()
                + route.getCosts();
        }
        return totalCost;
    }



}
