package com.api.flightReservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.flightReservation.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
