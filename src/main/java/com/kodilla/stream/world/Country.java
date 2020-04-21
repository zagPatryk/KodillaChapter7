package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public class Country {
    private final String name;
    private final BigDecimal peopleQuantity;

    public Country(String name, BigDecimal peopleQuantity) {
        this.name = name;
        this.peopleQuantity = peopleQuantity;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return name.equals(country.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + name + '\'' +
                ", peopleQuantity=" + peopleQuantity +
                '}';
    }
}
