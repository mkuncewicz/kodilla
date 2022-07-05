package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {

    private final String name;
    private final List<Country> list = new ArrayList<>();

    public Continent(String name) {
        this.name = name;
    }

    public void addCountry(Country country){
        list.add(country);
    }

    public String getName() {
        return name;
    }

    public List<Country> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "name='" + name + '\'' +
                ", list=" + list +
                '}';
    }
}
