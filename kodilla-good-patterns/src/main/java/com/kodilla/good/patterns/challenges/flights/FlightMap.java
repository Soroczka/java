package com.kodilla.good.patterns.challenges.flights;

import java.util.*;

public class FlightMap {

    private Set<Flight> availableFlight = new HashSet<>();

    public void addNewFlight(Flight flight) {
        availableFlight.add(flight);
    }

    public Set<Flight> getAvailableFlights() {
        return availableFlight;
    }

    @Override
    public String toString() {
        return "FindFlight{" +
                "flightSet=" + availableFlight +
                '}';
    }
}
