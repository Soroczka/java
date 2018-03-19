package com.kodilla.good.patterns.challenges.flights;


import java.util.List;
import java.util.stream.Collectors;

public class FlightSearchEngine {

    public static List<Flight> flightFrom (Flight flight, FindFlight findFlight){
        List<Flight> flights = findFlight.getFlightSet().stream()
                .filter(f -> f.getDepartureAirport() == flight.getDepartureAirport())
                .collect(Collectors.toList());

        System.out.println(flights);
        return flights;
    }

    public static List<Flight> flightTo (Flight flight, FindFlight findFlight){
        List<Flight> flights = findFlight.getFlightSet().stream()
                .filter(f -> f.getArrivalAirport() == flight.getArrivalAirport())
                .collect(Collectors.toList());

        System.out.println(flights);
        return flights;
    }


}
