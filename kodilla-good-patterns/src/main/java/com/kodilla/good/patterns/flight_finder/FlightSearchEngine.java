package com.kodilla.good.patterns.flight_finder;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSearchEngine {
    private ArrayList<Flight> listFlight;

    public FlightSearchEngine(ArrayList<Flight> listFlight) {
        this.listFlight = listFlight;
    }

    public void departureFrom(String cityName) {
        System.out.println("*************** All available flights from " + cityName + " ***************");
        listFlight.stream()
                .filter(a -> a.getFlightFrom().equals(cityName))
                .forEach(System.out::println);
        System.out.println("*************** ************************* ***************");
    }

    public void flightTo(String cityName) {
        System.out.println("*************** All available flights to " + cityName + " ***************");
        listFlight.stream()
                .filter(a -> a.getFlightTo().equals(cityName))
                .forEach(System.out::println);
        System.out.println("*************** ************************* ***************");
    }

    public void connectingFlight(String departureFromCity, String flightToCity) {
        List<Flight> listDeparture =
                listFlight.stream()
                        .filter(a -> a.getFlightFrom().equals(departureFromCity))
                        .filter(a -> !a.getFlightTo().equals(flightToCity))
                        .collect(Collectors.toList());

        List<Flight> listFlightTo =
                listFlight.stream()
                        .filter(a -> a.getFlightTo().equals(flightToCity))
                        .filter(a -> !a.getFlightFrom().equals(departureFromCity))
                        .collect(Collectors.toList());
        if (listDeparture.isEmpty() || listFlightTo.isEmpty()) {
            System.out.println("No connections");
        } else {

            List<Flight> flightConnecting = new ArrayList<>();
            for (Flight from : listDeparture) {
                for (Flight to : listFlightTo) {
                    if (from.getFlightTo().equals(to.getFlightFrom())) {
                        flightConnecting.add(new Flight(from.getFlightTo(), to.getFlightTo()));
                    }
                }
            }
            System.out.println("*************** All available flights from " + departureFromCity + " to " + flightToCity + " via another city ***************");
            for (Flight to : listDeparture) {
                for (Flight from : flightConnecting) {
                    if (to.getFlightTo().equals(from.getFlightFrom())) {
                        System.out.println(" Flight: " + "from >" + departureFromCity + "< through >" + to.getFlightTo() +
                                "< to >" + flightToCity + "<");
                    }
                }
            }
            System.out.println("*************** ************************* ***************");
        }
    }
}
