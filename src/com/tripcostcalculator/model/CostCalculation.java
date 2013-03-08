package com.tripcostcalculator.model;

import java.util.ArrayList;

// -------------------------------------------------------------------------
/**
 *  We calculate the cost of a trip
 *
 *  @author Taylor Smock (tsmock)
 *  @version Mar 8, 2013
 */

public class CostCalculation
{
    /** The directions on how to get somewhere */
    ArrayList<Route> mapDirections;
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
        // TODO Auto-generated method stub

    }

}
