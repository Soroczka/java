package com.kodilla.exception.test;

public class FlightMain {

    public static void main(String[] args) {
        Flight flight = new Flight("Warsaw", "Kongo");
        FlightSearchEngine flightSearchEngine = new FlightSearchEngine();

        try {
            flightSearchEngine.findFlight(flight);
        } catch (RouteNotFoundException e){
            System.out.println("ooops");
        }
    }
}
