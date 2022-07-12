package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class AirportClass {

    public AirportClass() {
    }

    public void findFlight(Flight flight) throws RouteNotFoundException{
        Map<String, Boolean> map = new HashMap<>();
        map.put("Warsaw", true);
        map.put("Wroclaw", false);
        map.put("Gdansk", true);

        if(map.containsKey(flight.getArrivalAirport()) && map.get(flight.getArrivalAirport())){
            System.out.println("Jest lotnisko: " + flight.getArrivalAirport());
        }else {
            throw new RouteNotFoundException();
        }


    }
}
