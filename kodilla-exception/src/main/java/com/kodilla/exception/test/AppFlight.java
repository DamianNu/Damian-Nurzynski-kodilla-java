package com.kodilla.exception.test;

public class AppFlight {
    public static void main(String[] args) {

        Flight flight1 = new Flight("Atlanta", "Warszawa");
        Flight flight2 = new Flight("Atlanta", "Gdańsk");
        Flight flight3 = new Flight("Atlanta", "Poznań");
        Flight flight4 = new Flight("Atlanta", "Modlin");
        Flight flight5 = new Flight("Atlanta", "Lublinek");
        FlightSearch flightSearch = new FlightSearch();

        try {
            flightSearch.findFilght(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }

        try {
            flightSearch.findFilght(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }

        try {
            flightSearch.findFilght(flight3);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }

        try {
            flightSearch.findFilght(flight4);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }

        try {
            flightSearch.findFilght(flight5);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }

    }
}
