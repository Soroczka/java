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

        boolean result = findFlightInternal(flight);

        if (!result) {
            throw new RouteNotFoundException("");
        }
        return result;
    }


    private boolean findFlightInternal(Flight flight) {

        final String departure = flight.getDepartureAirport();
        final String arrival = flight.getArrivalAirport();

        if(flightMap.get(departure) == null || flightMap.get(departure).isEmpty()){
            return false;
        }

        if(flightMap.get(departure).contains(arrival)){
            return true;
        }

        for (String f : flightMap.get(departure)) {
            if(findFlightInternal(new Flight(f, arrival))){
                return true;
            }
        }

        return false;

    }


}
