package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    private final List<Continent> list = new ArrayList<>();

    public void addContinent(Continent continent){
        list.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        return list.stream()
                .flatMap(country -> country.getList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }

}
