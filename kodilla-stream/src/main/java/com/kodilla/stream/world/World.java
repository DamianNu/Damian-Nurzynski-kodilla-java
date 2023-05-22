package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public final class World {

    private final List<Continent> listContinents = new ArrayList<>();

    public World() {
        Continent euro = new Continent("Europa");
        Continent africa = new Continent("Africa");
        euro.addCountry(new Country("Germany",new BigDecimal("1000")));
        euro.addCountry(new Country("Germdany",new BigDecimal("1001")));
        euro.addCountry(new Country("Gerdmany",new BigDecimal("2000")));
        listContinents.add(euro);
        listContinents.add(africa);
        listContinents.add(new Continent("Asia"));
        listContinents.add(new Continent("Australia"));
        listContinents.add(new Continent("North America"));
        listContinents.add(new Continent("South America"));
    }

    public List<Continent> getListContinents(){
        return new ArrayList<>(listContinents);
    }


    public BigDecimal getPeopleQuantity(){
        BigDecimal quantity = listContinents.stream()
                .flatMap(a -> a.getList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));
        return quantity;
    }

}
