package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public void findFilght(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airportsAvailable = new HashMap<>();
        airportsAvailable.put("Gdańsk", true);
        airportsAvailable.put("Modlin", false);
        airportsAvailable.put("Warszawa", false);
        airportsAvailable.put("Balice", true);
        airportsAvailable.put("Lublinek", false);

        String arrivals = flight.getArrivalAirport();

        if (airportsAvailable.containsKey(arrivals)) {
            boolean airportAccessibility = airportsAvailable.get(arrivals);
            if (airportAccessibility == true) {
                System.out.println("Have a nice flight to: " + arrivals);
            } else {
                System.out.println("Airport " + arrivals + " is not available");
            }
        } else {
            throw new RouteNotFoundException("The airport " + arrivals + " does not exist");
        }
    }

}
