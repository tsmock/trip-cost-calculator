package com.tripcostcalculator.model;

// -------------------------------------------------------------------------
/**
 *  Superclass for all potential route types
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

public abstract class Route
{
    /** The name of the route */
    private String name;
    /** The length of the route */
    private float distance;
    /** Any additional costs for using the route */
    private float costs;
    /** Average gas cost */
    private float gasCost;

    /**
     * @param name The name of the route
     * @param distance The distance of the route
     */
    public Route(String name, float distance)
    {
        this.name = name;
        this.distance = distance;
        this.costs = 0; //This should be the default.
    }


    /**
     * @return the name of the route
     */
    public String getName() //TODO tested in Toll.java
    {
        return this.name;
    }



    /**
     * @return the length of this route
     */
    public float getDistance()
    {
        return this.distance;
    }


    /**
     * @param distance The new distance
     */
    public void setDistance(float distance)
    {
        this.distance = distance;
    }


    /**
     * @param costs Any additional costs of using the route
     */
    public void setCosts(float costs)
    {
        this.costs = costs;
    }


    /**
     * @return The additional costs for using this route
     */
    public float getCosts()
    {
        return this.costs;
    }

    /**
     * We get the average cost of gas on this route
     * @return The average cost of gas for this route
     */
    public float getGasCost() //TODO test
    {
        return this.gasCost;
    }



    /**
     * We set the average cost of gas on this route
     * @param gasCost the average cost of gas on this route
     */
    public void setGasCost(float gasCost) //TODO test
    {
        this.gasCost = gasCost;
    }
}
