package com.kodilla.good.patterns.flight_finder;

public class Application {
    public static void main(String[] args) {
        FlightDatabase flightDatabase = new FlightDatabase();
        flightDatabase.loadListFlight();
        FlightSearchEngine flightSearchEngine = new FlightSearchEngine(flightDatabase.getListFlight());
        flightSearchEngine.departureFrom("Kraków");
        System.out.println("\n");
        flightSearchEngine.flightTo("Warszawa");
        System.out.println("\n");
        flightSearchEngine.connectingFlight("Berlin", "New York");

    }
}
