package com.kodilla.good.patterns.flight_finder;

public class Application {
    public static void main(String[] args) {
        FlightDatabase flightDatabase = new FlightDatabase();
        FlightSearchEngine flightSearchEngine = new FlightSearchEngine(flightDatabase.getListFlight());
        flightSearchEngine.showFullListOfFlights();
        System.out.println(" ");
        flightSearchEngine.departureFrom("Atlanta");
        System.out.println(" ");
        flightSearchEngine.flightTo("Londyn");
        System.out.println(" ");
        flightSearchEngine.connectingFlight("Atlanta", "Londyn");
    }
}
