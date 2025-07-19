package com.tekarch.tafDataStore.Controllers;



import com.tekarch.tafDataStore.Entity.Booking;
//import com.tekarch.tafDataStore.Services.Interfaces.BookingServiceInterface;
import com.tekarch.tafDataStore.Entity.Flight;
import com.tekarch.tafDataStore.Entity.User;
import com.tekarch.tafDataStore.Repositories.BookingRepository;
import com.tekarch.tafDataStore.Repositories.FlightRepository;
import com.tekarch.tafDataStore.Repositories.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/datastore/bookings")
public class BookingController {


    private final BookingRepository bookingRepository;

    public BookingController(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

//    @PostMapping
//    public ResponseEntity<Booking> createBooking(@Valid @RequestBody Booking booking, BindingResult bindingResult) {
//        if (bindingResult.hasErrors()) {
//            // Handle validation errors, e.g., return 400 Bad Request
//            return ResponseEntity.badRequest().body(null);
//        }
//        return ResponseEntity.ok(bookingRepository.save(booking));
//    }

    @PostMapping
    public Booking createBooking(@RequestBody Booking booking) {
        return bookingRepository.save(booking);
    }

    @GetMapping("/{bookingId}")
    public Optional<Booking> getBookingById(@PathVariable Long bookingId) {
        Optional<Booking> booking = bookingRepository.findById(bookingId);
        return Optional.ofNullable(booking.orElse(null));
    }

    @GetMapping("/user/{userId}")
    public List<Booking> getAllBookingsForUser(@PathVariable Long userId) {
        return bookingRepository.findByUserId(userId);
    }

    @PutMapping("/{bookingId}")
    public Booking updateBooking(@PathVariable Long bookingId, @RequestBody Booking bookingDetails) {
        return bookingRepository.findById(bookingId).map(booking -> {
            booking.setStatus(bookingDetails.getStatus());
            booking.setUpdatedAt(bookingDetails.getUpdatedAt());
            return bookingRepository.save(booking);
        }).orElse(null);
    }

    @DeleteMapping("/{bookingId}")
    public void deleteBooking(@PathVariable Long bookingId) {
        bookingRepository.deleteById(bookingId);
    }
}


