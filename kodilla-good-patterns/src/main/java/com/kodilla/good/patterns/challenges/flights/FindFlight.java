package com.kodilla.good.patterns.challenges.flights;

import java.util.*;

public class FindFlight {

    private static Set<Flight> flightSet = new HashSet<>();

    public void addNewAirport(Flight flight) {
        flightSet.add(flight);
    }

    public Set<Flight> getFlightSet() {
        return flightSet;
    }

    @Override
    public String toString() {
        return "FindFlight{" +
                "flightSet=" + flightSet +
                '}';
    }
}
