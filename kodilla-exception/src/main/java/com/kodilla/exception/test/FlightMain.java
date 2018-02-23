package com.kodilla.exception.test;

public class FlightMain {

    public static void main(String[] args) {
        Flight flight = new Flight("Warsaw", "Kongo");
        Flight flight2 = new Flight("Warsaw", "New York");
        Flight flight3 = new Flight("New York", "San Francisco");
        Flight flight4 = new Flight("San Francisco", "Ottawa");
        Flight flight5 = new Flight("San Francisco", "Montreal");

        FlightSearchEngine flightSearchEngine = new FlightSearchEngine();

        flightSearchEngine.addNewAirport(flight);
        flightSearchEngine.addNewAirport(flight2);
        flightSearchEngine.addNewAirport(flight3);
        flightSearchEngine.addNewAirport(flight4);
        flightSearchEngine.addNewAirport(flight5);

        flightSearchEngine.getFlightMap();

        try {
            flightSearchEngine.findFlight(flight);
        } catch (RouteNotFoundException e){
            System.out.println("ooops");
        }
    }
}
