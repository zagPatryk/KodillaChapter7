package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Continent {
    private final List<Country> countryList = new ArrayList<Country>();
    private final String name;

    public Continent(String name) {
        this.name = name;
    }

    public boolean addCountryToList(Country country) {
        countryList.add(country);
        return true;
    }
    public List<Country> getCountryList() {
        return countryList;
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal continentPopulation = countryList.stream()
                 .map(Country::getPeopleQuantity)
                 .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return continentPopulation;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "countryList=" + countryList +
                ", continentName='" + name + '\'' +
                '}';
    }
}
