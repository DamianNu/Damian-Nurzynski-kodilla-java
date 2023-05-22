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

//        Continent europe = new Continent("Europe");
//        Continent africa = new Continent("Africa");
//        Continent asia = new Continent("Asia");
//        Continent australia = new Continent("Australia");
//        Continent northAmerica = new Continent("North America");
//        Continent southAmerica = new Continent("South America");


//        countries.add(new Country("Germany",new BigDecimal("83783942")));
//        countries.add(new Country("United Kingdom",new BigDecimal("67886011")));
//        countries.add(new Country("France",new BigDecimal("65273511")));
//        countries.add(new Country("Italy",new BigDecimal("60461826")));
//
//        countries.add(new Country("Nigeria",new BigDecimal("206139589")));
//        countries.add(new Country("Ethiopia",new BigDecimal("114963588")));
//        countries.add(new Country("Egypt",new BigDecimal("102334404")));
//        countries.add(new Country("RPA",new BigDecimal("59308690")));
//
//        countries.add(new Country("China",new BigDecimal("1410539758")));
//        countries.add(new Country("India",new BigDecimal("1389637446")));
//        countries.add(new Country("Indonesia",new BigDecimal("277329163")));
//        countries.add(new Country("Pakistan",new BigDecimal("242923845")));
//
//        countries.add(new Country("Australia",new BigDecimal("26141369")));
//        countries.add(new Country("Fiji",new BigDecimal("943737")));
//        countries.add(new Country("Kiribati",new BigDecimal("114189")));
//        countries.add(new Country("Micronesia",new BigDecimal("101009")));
//
//        countries.add(new Country("USA",new BigDecimal("327096265")));
//        countries.add(new Country("Mexico",new BigDecimal("126190788")));
//        countries.add(new Country("Canada",new BigDecimal("37064562")));
//        countries.add(new Country("Guatemala",new BigDecimal("17247849")));
//
//        countries.add(new Country("Brazil",new BigDecimal("211755962")));
//        countries.add(new Country("Colombia",new BigDecimal("43677372")));
//        countries.add(new Country("Argentina",new BigDecimal("40913584")));
//        countries.add(new Country("Peru",new BigDecimal("29546963")));
//
//    }



    public List<Country> getList(){
        return new ArrayList<>(countries);
    }


}
