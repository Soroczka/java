package com.kodilla.good.patterns.challenges.flights;

public class FlightMain {

    public static void main(String[] args) {
        Flight flight = new Flight("Warsaw", "Kongo");
        Flight flight2 = new Flight("Warsaw", "New York");
        Flight flight3 = new Flight("New York", "San Francisco");
        Flight flight4 = new Flight("San Francisco", "Ottawa");
        Flight flight5 = new Flight("San Francisco", "Montreal");

        FindFlight findFlight = new FindFlight();

        findFlight.addNewAirport(flight);
        findFlight.addNewAirport(flight2);
        findFlight.addNewAirport(flight3);
        findFlight.addNewAirport(flight4);
        findFlight.addNewAirport(flight5);

        System.out.println(findFlight.getFlightSet());

        FlightSearchEngine.flightFrom(flight, findFlight);
        FlightSearchEngine.flightTo(flight, findFlight);

        FlightSearchEngine.flightFrom(flight4, findFlight);
        FlightSearchEngine.flightTo(flight4, findFlight);
    }
}
