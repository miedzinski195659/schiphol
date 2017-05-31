package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by lm on 30.05.2017.
 */
public class FlightBoard {
    private List<Flight> flights;

    public FlightBoard() {
        flights = new ArrayList<>();
    }

    public FlightBoard(List<Flight> flights) {
        this.flights = flights;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    public Flight getFlight(String flightNumber) {
        Optional<Flight> flight = this.flights.stream().filter((x) -> x.getFlightNumber().equals(flightNumber)).findFirst();
        if (flight.isPresent()) {
            return flight.get();
        } else {
            return null;
        }
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    @Override
    public String toString() {
        String out = "FlightBoard:\n";
        for (Flight f : this.flights) {
            if (f.getFlightDirection().equals("A")) {
                out += "Arrival Flight: " + f.getFlightName() + " [" + f.getPrefixICAO() + "]";
                out += " FROM: " + f.getRoute().getDestinations()[0];
            } else if (f.getFlightDirection().equals("D")) {
                out += "Departure Flight: " + f.getFlightName() + " [" + f.getPrefixICAO() + "]";
                out += " TO: " + f.getRoute().getDestinations()[0];
            } else {
                out += "Flight: [" + f.getFlightNumber() + "] " + f.getFlightDirection();
            }
            out += "\n";
        }
        return out;
    }
}
