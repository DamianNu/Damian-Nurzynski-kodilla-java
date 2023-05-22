package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public final class World {

    private final List<Continent> listContinents = new ArrayList<>();

    public List<Continent> getListContinents(){
        return new ArrayList<>(listContinents);
    }

    public void addContinent(Continent continent) {
        listContinents.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal quantity = listContinents.stream()
                .flatMap(a -> a.getList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));
        return quantity;
    }

}
