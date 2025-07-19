package com.tekarch.tafDataStore.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data

@RequiredArgsConstructor
@AllArgsConstructor
@Table(name = "flights")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "flight_number", unique = true, nullable = false)
    private String flightNumber;

//    @Column(nullable = false)
//    private String departure;
//
//    @Column(nullable = false)
//    private String arrival;
//
//    @Column(name = "departure_time", nullable = false)
//    private LocalDateTime departureTime;
//
//    @Column(name = "arrival_time", nullable = false)
//    private LocalDateTime arrivalTime;
//
//    @Column(nullable = false)
//    private Double price;
//
//    @Column(name = "available_seats", nullable = false)
//    private Integer availableSeats;
//
//    @Column(name = "created_at", nullable = false, updatable = false)
//    private LocalDateTime createdAt;
//
//    @Column(name = "updated_at", nullable = false)
//    private LocalDateTime updatedAt;
//
//    // Getters and Setters
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getFlightNumber() {
//        return flightNumber;
//    }
//
//    public void setFlightNumber(String flightNumber) {
//        this.flightNumber = flightNumber;
//    }
//
//    public String getDeparture() {
//        return departure;
//    }
//
//    public void setDeparture(String departure) {
//        this.departure = departure;
//    }
//
//    public String getArrival() {
//        return arrival;
//    }
//
//    public void setArrival(String arrival) {
//        this.arrival = arrival;
//    }
//
//    public LocalDateTime getDepartureTime() {
//        return departureTime;
//    }
//
//    public void setDepartureTime(LocalDateTime departureTime) {
//        this.departureTime = departureTime;
//    }
//
//    public LocalDateTime getArrivalTime() {
//        return arrivalTime;
//    }
//
//    public void setArrivalTime(LocalDateTime arrivalTime) {
//        this.arrivalTime = arrivalTime;
//    }
//
//    public Double getPrice() {
//        return price;
//    }
//
//    public void setPrice(Double price) {
//        this.price = price;
//    }
//
//    public Integer getAvailableSeats() {
//        return availableSeats;
//    }
//
//    public void setAvailableSeats(Integer availableSeats) {
//        this.availableSeats = availableSeats;
//    }
//
//    public LocalDateTime getCreatedAt() {
//        return createdAt;
//    }
//
//    public void setCreatedAt(LocalDateTime createdAt) {
//        this.createdAt = createdAt;
//    }
//
//    public LocalDateTime getUpdatedAt() {
//        return updatedAt;
//    }
//
//    public void setUpdatedAt(LocalDateTime updatedAt) {
//        this.updatedAt = updatedAt;
//    }
private String departure;
    private String arrival;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private double price;
    private int availableSeats;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    @CreationTimestamp
    @Column(name = "updated_at", nullable = false, updatable = false)
    private LocalDateTime updatedAt = LocalDateTime.now();
}


