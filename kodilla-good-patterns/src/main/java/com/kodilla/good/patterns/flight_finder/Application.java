package com.kodilla.good.patterns.flight_finder;

public class Application {
    public static void main(String[] args) {
        FlightDatabase flightDatabase = new FlightDatabase();
        flightDatabase.showFlightList();
        System.out.println(" ");
        FlightSearchEngine flightSearchEngine = new FlightSearchEngine(flightDatabase.getListFlight());
        flightSearchEngine.departureFrom("Warszawa");
        System.out.println(" ");
        flightSearchEngine.flightTo("Pekin");
        System.out.println(" ");
        flightSearchEngine.connectingFlight("Warszawa", "Pekin");

    }
}
