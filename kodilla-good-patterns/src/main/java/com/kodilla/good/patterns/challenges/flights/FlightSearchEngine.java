package com.kodilla.good.patterns.challenges.flights;


import java.util.List;
import java.util.stream.Collectors;

public class FlightSearchEngine {

    private FlightMap flightMap;

    public FlightSearchEngine(FlightMap flightMap) {
        this.flightMap = flightMap;
    }

    public List<Flight> flightFrom (String departureAirport){
        return flightMap.getAvailableFlights().stream()
                .filter(f -> f.getDepartureAirport().equalsIgnoreCase(departureAirport))
                .collect(Collectors.toList());
    }

    public List<Flight> flightTo (String arrivalAirport){
        return flightMap.getAvailableFlights().stream()
                .filter(f -> f.getArrivalAirport().equalsIgnoreCase(arrivalAirport))
                .collect(Collectors.toList());
    }

    public boolean flightToThrough(String to, String through) {
        List<Flight> flightsToExpectedAirport = flightMap.getAvailableFlights().stream()
                .filter(f -> f.getArrivalAirport().equalsIgnoreCase(to))
                .filter(f -> f.getDepartureAirport().equalsIgnoreCase(through))
                .collect(Collectors.toList());

        if(flightsToExpectedAirport.isEmpty()){
            return false;
        }
        return !flightTo(through).isEmpty();
    }

}
