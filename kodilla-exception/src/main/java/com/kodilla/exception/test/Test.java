package com.kodilla.exception.test;

public class Test {
    public static void main(String[] args) {

        AirportClass airportClass = new AirportClass();
        Flight flight = new Flight("Barcelona", "ABUDABI");

        try {
            airportClass.findFlight(flight);
        }catch (RouteNotFoundException e){
            System.out.println("Blad: " + e);
        }



    }
}
