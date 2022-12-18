package com.api.flightReservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.flightReservation.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger,Long> {
}
