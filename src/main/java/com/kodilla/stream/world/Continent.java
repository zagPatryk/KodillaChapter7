package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Continent {
    private final List<Country> countryList = new ArrayList<Country>();
    private final String continentName;

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public boolean addCountryToList(Country country) {
        countryList.add(country);
        return true;
    }
    public List<Country> getCountryList() {
        return countryList;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "countryList=" + countryList +
                ", continentName='" + continentName + '\'' +
                '}';
    }
}
