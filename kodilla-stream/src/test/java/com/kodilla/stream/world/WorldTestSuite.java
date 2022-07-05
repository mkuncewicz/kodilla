package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;

public class WorldTestSuite {


    @Test
    void testGetPeopleQuantity(){
        //Given
        World world = new World();
        Continent continent1 = new Continent("Europe");
        Continent continent2 = new Continent("Asia");
        Continent continent3 = new Continent("North America");

        continent1.addCountry(new Country("Poland",new BigDecimal(38000000)));
        continent1.addCountry(new Country("Germany",new BigDecimal(50000000)));
        continent1.addCountry(new Country("France",new BigDecimal(45000000)));

        continent2.addCountry(new Country("China", new BigDecimal(321321321)));
        continent2.addCountry(new Country("Hong Kong",new BigDecimal(321321321)));
        continent2.addCountry(new Country("Tajlandia",new BigDecimal(321321321)));

        continent3.addCountry(new Country("USA",new BigDecimal(234132132)));
        continent3.addCountry(new Country("Canada",new BigDecimal(234132132)));
        continent3.addCountry(new Country("Mexico",new BigDecimal(234132132)));

        world.addContinent(continent1);
        world.addContinent(continent2);
        world.addContinent(continent3);
        //When
        BigDecimal result = world.getPeopleQuantity();
        //Then
        BigDecimal bigDecimal = new BigDecimal("1799360359");
        Assertions.assertEquals(bigDecimal, result);
    }
}
