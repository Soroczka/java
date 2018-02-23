package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightSearchEngine {

    private Map<String, List<String>> flightMap = new HashMap<>();

    public void addNewAirport(Flight flight) {
        flightMap.putIfAbsent(flight.getDepartureAirport(), new ArrayList<String>()); //if(flightMap.get(flight.getArrivalAirport()) == null) { new map with arraylist}
        flightMap.get(flight.getDepartureAirport()).add(flight.getArrivalAirport()); //adding new airports to a "key".
    }

    public Map<String, List<String>> getFlightMap() {
        for (Map.Entry<String, List<String>> entry : flightMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        return flightMap;
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        boolean result = findFlightInternational(flight);

        if (!result) {
            throw new RuntimeException();
        }
        return result;
    }


    public boolean findFlightInternational(Flight flight) {

        final List<String> flights = new ArrayList<>();

        final String departure = flight.getDepartureAirport();
        final String arrival = flight.getArrivalAirport();

        boolean result = false;

        if(flight.getArrivalAirport() != null){
            result = true;
        }

        for (Map.Entry<String, List<String>> entry : flightMap.entrySet()) {



        }

        return result;
    }


}
