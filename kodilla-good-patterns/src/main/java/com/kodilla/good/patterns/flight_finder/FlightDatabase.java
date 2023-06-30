package com.kodilla.good.patterns.flight_finder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FlightDatabase implements Serializable {
    private Flight flight;
    private ArrayList<Flight> listFlight = new ArrayList<>();
    File flightDatabase = new File("kodilla-good-patterns/src/main/resources/listFlight");

    public Flight getFlight() {
        return flight;
    }

    public ArrayList<Flight> getListFlight() {
        return listFlight;
    }

    public void setListFlight(ArrayList<Flight> listFlight) {
        this.listFlight = listFlight;
    }

    public void addFlightToList(Flight flight) {
        listFlight.clear();
        loadListFlight();
        listFlight.add(flight);
        saveListFlight();
    }

    private void saveListFlight() {
        try {
            FileOutputStream fileOut =
                    new FileOutputStream(flightDatabase);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(listFlight);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in flightDatabase");
        } catch (IOException i) {
            i.printStackTrace();
            System.out.println("File write error");
        }
    }

    public void loadListFlight() {
        listFlight.clear();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(flightDatabase));
            Object readList = ois.readObject();
            if (readList instanceof List<?>) {
                listFlight.addAll((ArrayList) readList);
                System.out.println("File loaded correctly");
            }
            ois.close();
        } catch (IOException i) {
            i.printStackTrace();
            System.out.println("File read error");
        } catch (ClassNotFoundException c) {
            System.out.println("Flight database file missing");
            c.printStackTrace();
        }
    }
}
