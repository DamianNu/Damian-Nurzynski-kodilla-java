package com.kodilla.stream.world;


import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final String nameContinent;
    private final List<Country> countries = new ArrayList<>();

    public Continent(final String nameContinent) {
        this.nameContinent = nameContinent;
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public boolean removeCountry(Country country) {
        return countries.remove(country);
    }

    public List<Country> getCountries() {
        return new ArrayList<>(countries);
    }

    public List<Country> getList(){
        return new ArrayList<>(countries);
    }


}
