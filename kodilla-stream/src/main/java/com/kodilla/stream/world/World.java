package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    private final List<Continent> listContinents = new ArrayList<>();

    public World() {
        listContinents.add(new Continent("Europe"));
        listContinents.add(new Continent("Africa"));
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
