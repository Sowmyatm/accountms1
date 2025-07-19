package com.tekarch.tafDataStore.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor // Lombok annotation to generate a no-args constructor
@AllArgsConstructor
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
//    private Long userId;
    private User user;



    @ManyToOne
    @JoinColumn(name = "flight_id", nullable = false)
    private Flight flight;

    private String status;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    @CreationTimestamp
    @Column(name = "updated_at", nullable = false, updatable = false)
    private LocalDateTime updatedAt = LocalDateTime.now();


//    private String bookingNumber;
//    private LocalDateTime bookingTime;

    // Getters and Setters
}

