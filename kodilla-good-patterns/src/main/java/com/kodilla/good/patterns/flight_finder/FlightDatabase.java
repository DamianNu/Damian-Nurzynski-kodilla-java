package com.kodilla.good.patterns.flight_finder;

import java.util.ArrayList;
import java.util.List;

public class FlightDatabase {
    private List<Flight> listFlight;
    public FlightDatabase(){
        listFlight = new ArrayList<>();
        listFlight.add(new Flight("Warszawa","Gdańsk"));
        listFlight.add(new Flight("Warszawa","Berlin"));
        listFlight.add(new Flight("Warszawa","New York"));
        listFlight.add(new Flight("Warszawa","Kraków"));
        listFlight.add(new Flight("Warszawa","Londyn"));
        listFlight.add(new Flight("Gdańsk","Kraków"));
        listFlight.add(new Flight("Gdańsk","Londyn"));
        listFlight.add(new Flight("Gdańsk","Pekin"));
        listFlight.add(new Flight("Gdańsk","Atlanta"));
        listFlight.add(new Flight("Gdańsk","Dubaj"));
        listFlight.add(new Flight("Berlin","Dubaj"));
        listFlight.add(new Flight("Berlin","Atlanta"));
        listFlight.add(new Flight("Berlin","Gdańsk"));
        listFlight.add(new Flight("Berlin","Londyn"));
        listFlight.add(new Flight("Atlanta","Londyn"));
        listFlight.add(new Flight("Atlanta","Kraków"));
        listFlight.add(new Flight("Atlanta","New York"));
        listFlight.add(new Flight("Atlanta","Dubaj"));
        listFlight.add(new Flight("Atlanta","Warszawa"));
        listFlight.add(new Flight("Atlanta","Pekin"));
        listFlight.add(new Flight("Atlanta","Gdańsk"));
        listFlight.add(new Flight("Kraków","Dubaj"));
        listFlight.add(new Flight("Kraków","Pekin"));
        listFlight.add(new Flight("Kraków","Atlanta"));
        listFlight.add(new Flight("Kraków","Londyn"));
        listFlight.add(new Flight("Londyn","Atlanta"));
        listFlight.add(new Flight("Londyn","Dubaj"));
        listFlight.add(new Flight("Londyn","Gdańsk"));
        listFlight.add(new Flight("Londyn","Kraków"));
        listFlight.add(new Flight("Dubaj","Londyn"));
        listFlight.add(new Flight("Pekin","Warszawa"));
        listFlight.add(new Flight("New York","Londyn"));
    }

    public List<Flight> getListFlight() {
        return listFlight;
    }
}
