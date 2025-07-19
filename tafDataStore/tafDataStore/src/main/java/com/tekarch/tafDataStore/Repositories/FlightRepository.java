package com.tekarch.tafDataStore.Repositories;

import com.tekarch.tafDataStore.Entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
//    static Optional<Flight> getFlightById(Long flightId) {
//        return null;
    }

//    static Flight saveFlight(Flight flight) {
//        return flight;
//    }
//}

