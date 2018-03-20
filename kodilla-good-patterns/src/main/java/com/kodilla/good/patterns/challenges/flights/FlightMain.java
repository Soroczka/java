package com.kodilla.good.patterns.challenges.flights;

public class FlightMain {

    public static void main(String[] args) {
        FlightMap flightMap = new FlightMap();

        flightMap.addNewFlight(new Flight("Warsaw", "Kongo"));
        flightMap.addNewFlight(new Flight("Warsaw", "New York"));
        flightMap.addNewFlight(new Flight("New York", "San Francisco"));
        flightMap.addNewFlight(new Flight("San Francisco", "Ottawa"));
        flightMap.addNewFlight(new Flight("San Francisco", "Montreal"));

        System.out.println(flightMap.getAvailableFlights());

        final FlightSearchEngine engine = new FlightSearchEngine(flightMap);

        System.out.println(engine.flightFrom("Warsaw"));
        System.out.println(engine.flightTo("Kongo"));

        System.out.println(engine.flightToThrough("San Francisco", "Warsaw"));


    }
}
