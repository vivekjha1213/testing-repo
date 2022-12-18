package com.api.flightReservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.api.flightReservation.entity.Flight;

import java.util.Date;
import java.util.List;

public interface FlightRepository extends JpaRepository<Flight,Long> {

    @Query(value = "from Flight where departureCity=:departureCity and arrivalCity=:arrivalCity and dateOfDeparture=:dateOfDeparture")
    List<Flight> findFlights(@Param("departureCity")String from, @Param("arrivalCity") String to, @Param("dateOfDeparture") Date dateOfDeparture);
}
