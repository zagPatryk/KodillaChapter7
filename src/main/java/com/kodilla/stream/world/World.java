package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    private final List<Continent> list = new ArrayList<Continent>();

    public boolean addContinent(Continent continent) {
        list.add(continent);
        return true;
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleQuantity = list.stream()
                .map(Continent::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return peopleQuantity;
    }

    @Override
    public String toString() {
        return "World{" +
                "continentList=" + list +
                '}';
    }
}
