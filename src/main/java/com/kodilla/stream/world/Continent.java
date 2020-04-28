package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Continent {
    private final List<Country> list = new ArrayList<Country>();
    private final String name;

    public Continent(String name) {
        this.name = name;
    }

    public boolean addToList(Country country) {
        list.add(country);
        return true;
    }
    public List<Country> getList() {
        return list;
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleQuantity = list.stream()
                 .map(Country::getPeopleQuantity)
                 .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return peopleQuantity;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "list=" + list +
                ", continentName='" + name + '\'' +
                '}';
    }
}
