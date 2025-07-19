//package com.tekarch.tafDataStore.Services;
//
//
//
//import com.tekarch.tafDataStore.Entity.Booking;
//import com.tekarch.tafDataStore.Repositories.BookingRepository;
//import com.tekarch.tafDataStore.Services.Interfaces.BookingServiceInterface;
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//@RequiredArgsConstructor
//public class BookingServiceImpl implements BookingServiceInterface {
//
//    @Autowired
//    private final BookingRepository bookingRepository;
//
//    @Override
//    public Booking createBooking(Booking booking) {
//        return bookingRepository.save(booking);
//    }
//
//    @Override
//    public Booking getBooking(Long bookingId) {
//        return bookingRepository.findById(bookingId).orElse(null);
//    }
//
//    @Override
//    public List<Booking> getBookingsByUser(Long userId) {
//        return bookingRepository.findByUserId(userId);
//    }
//
//    @Override
//    public Booking cancelBooking(Long bookingId) {
//        Booking booking = bookingRepository.findById(bookingId).orElse(null);
//        if (booking != null) {
//            booking.setStatus("Cancelled");
//            return bookingRepository.save(booking);
//        }
//        return null;
//    }
//
//    @Override
//    public Booking saveBooking(Booking booking) {
//        return bookingRepository.save(booking);
//    }
//
//    @Override
//    public Optional<Booking> getBookingById(Long bookingId) {
//        return bookingRepository.findById(bookingId);
//    }
//
//    @Override
//    public List<Booking> findByUserId(Long userId) {
//        return List.of();
//    }
//}
//
