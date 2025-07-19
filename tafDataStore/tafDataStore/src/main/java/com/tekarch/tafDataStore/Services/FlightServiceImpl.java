package com.tekarch.tafDataStore.Services;
//
//
//
//import com.tekarch.tafDataStore.Entity.Flight;
//import com.tekarch.tafDataStore.Repositories.FlightRepository;
//import com.tekarch.tafDataStore.Interfaces.FlightServiceInterface;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class FlightServiceImpl implements FlightServiceInterface {
//
//    @Autowired
//    private FlightRepository flightRepository;
//
//    @Override
//    public Flight saveFlight(Flight flight) {
//        return flightRepository.save(flight);
//    }
//
//    @Override
//    public Flight updateFlight(Long id, Flight flight) {
//        return null;
//    }
//
//    @Override
//    public void deleteFlight(Long id) {
//
//    }
//
//    @Override
//    public List<Flight> getAllFlights() {
//        return null;
//    }
//
//    @Override
//    public Optional<Flight> getFlightById(Long id) {
//        return flightRepository.findById(id);
//    }
//}



//import com.tekarch.tafDataStore.Entity.Flight;
//import com.tekarch.tafDataStore.Repositories.FlightRepository;
//import com.tekarch.tafDataStore.Services.Interfaces.FlightServiceInterface;
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.time.LocalDateTime;
//import java.util.List;
//import java.util.Optional;
//
//@Service
//@RequiredArgsConstructor
//public class FlightServiceImpl implements FlightServiceInterface {
//
//    @Autowired
//    private final FlightRepository flightRepository;
//
//    @Override
//    public Flight createFlight(Flight flight) {
//        if (flight.getArrival() == null) {
//            throw new IllegalArgumentException("Arrival cannot be null");
//        }
//        if (flight.getDeparture() == null) {
//            throw new IllegalArgumentException("Departure cannot be null");
//        }
//        // Add similar checks for other non-nullable fields
//        return flightRepository.save(flight);
//    }
//
//    @Override
//    public Flight getFlight(Long flightId) {
//        return flightRepository.findById(flightId).orElse(null);
//    }
//
//    @Override
//    public List<Flight> getAllFlights() {
//        return flightRepository.findAll();
//    }
//
//
//        @Override
//        public Flight updateFlight(Long id, Flight flight) {
//            Flight existingFlight = flightRepository.findById(id)
//                    .orElseThrow(() -> new RuntimeException("Flight not found with id " + id));
//
//            // Update the existing flight's fields
//            existingFlight.setFlightNumber(flight.getFlightNumber());
//            existingFlight.setDeparture(flight.getDeparture());
//            existingFlight.setArrival(flight.getArrival());
//            existingFlight.setDepartureTime(flight.getDepartureTime());
//            existingFlight.setArrivalTime(flight.getArrivalTime());
//            existingFlight.setPrice(flight.getPrice());
//            existingFlight.setAvailableSeats(flight.getAvailableSeats());
//
//            return flightRepository.save(existingFlight); // Save the updated flight
//    }
//    @Override
//    public Flight saveFlight(Flight flight) {
//        // Validate non-nullable fields
//        if (flight.getFlightNumber() == null) {
//            throw new IllegalArgumentException("Flight number cannot be null");
//        }
//        if (flight.getDeparture() == null) {
//            throw new IllegalArgumentException("Departure cannot be null");
//        }
//        if (flight.getArrival() == null) {
//            throw new IllegalArgumentException("Arrival cannot be null");
//        }
//        if (flight.getDepartureTime() == null) {
//            throw new IllegalArgumentException("Departure time cannot be null");
//        }
//        if (flight.getArrivalTime() == null) {
//            throw new IllegalArgumentException("Arrival time cannot be null");
//        }
//        if (flight.getPrice() == null) {
//            throw new IllegalArgumentException("Price cannot be null");
//        }
//        if (flight.getAvailableSeats() == null) {
//            throw new IllegalArgumentException("Available seats cannot be null");
//        }
//        // Set timestamps
//        flight.setCreatedAt(LocalDateTime.now());
//        flight.setUpdatedAt(LocalDateTime.now());
//
//        return flightRepository.save(flight); // Save the flight
//    }
//
//
//    @Override
//    public Optional<Flight> getFlightById(Long flightId) {
//        return flightRepository.findById(flightId);
//    }
//
//
//}


