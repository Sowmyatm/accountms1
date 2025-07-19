package com.tekarch.tafDataStore.Controllers;

import com.tekarch.tafDataStore.Entity.Flight;
import com.tekarch.tafDataStore.Repositories.FlightRepository;
//import com.tekarch.tafDataStore.Services.Interfaces.FlightServiceInterface;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;



@RestController
@RequestMapping("/datastore/flights")
public class FlightController {

    //    @Autowired
//    private FlightServiceInterface flightService;
    private final FlightRepository flightRepository;

    public FlightController(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @GetMapping
    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

//    @PostMapping
//    public Flight addFlight(@RequestBody Flight flight) {
//        return flightRepository.save(flight);
//    }

    @PostMapping
    public ResponseEntity<Flight> addFlight(@RequestBody Flight flight) {
        // Save the flight and return a response
        Flight savedFlight = flightRepository.save(flight);
        return ResponseEntity.ok(savedFlight);
    }

    @GetMapping("/{flightId}")
    public Optional<Flight> getFlightById(@PathVariable Long flightId) {
        Optional<Flight> flight = flightRepository.findById(flightId);
        return Optional.ofNullable(flight.orElse(null));
    }

//    @GetMapping("/{flightId}")
//    public ResponseEntity<Flight> getFlightById(@PathVariable Long flightId) {
//        // Fetch the flight using the service
//        Optional<Flight> flight = FlightRepository.getFlightById(flightId);
//
//        // Check if the flight is present
//        if (flight.isPresent()) {
//            return ResponseEntity.ok(flight.get());
//        } else {
//            // Return 404 if the flight is not found
//            return ResponseEntity.notFound().build();
//        }
//    }

    @PutMapping("/{flightId}")
    public Flight updateFlight(@PathVariable Long flightId, @RequestBody Flight flightDetails) {
        return flightRepository.findById(flightId).map(flight -> {
            flight.setFlightNumber(flightDetails.getFlightNumber());
            flight.setDeparture(flightDetails.getDeparture());
            flight.setArrival(flightDetails.getArrival());
            flight.setDepartureTime(flightDetails.getDepartureTime());
            flight.setArrivalTime(flightDetails.getArrivalTime());
            flight.setPrice(flightDetails.getPrice());
            flight.setAvailableSeats(flightDetails.getAvailableSeats());
            flight.setUpdatedAt(flightDetails.getUpdatedAt());
            return flightRepository.save(flight);
        }).orElse(null);
    }

    @DeleteMapping("/{flightId}")
    public void deleteFlight(@PathVariable Long flightId) {
        flightRepository.deleteById(flightId);
    }

}

