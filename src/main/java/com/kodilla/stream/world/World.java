package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class World {
    private final List<Continent> continentList = new ArrayList<Continent>();

    public boolean addContinent(Continent continent) {
        continentList.add(continent);
        return true;
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal worldPopulation = continentList.stream()
                .map(Continent::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return worldPopulation;
    }

    @Override
    public String toString() {
        return "World{" +
                "continentList=" + continentList +
                '}';
    }
}
