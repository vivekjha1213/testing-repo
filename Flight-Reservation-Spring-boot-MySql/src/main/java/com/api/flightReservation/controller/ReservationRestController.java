package com.api.flightReservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.api.flightReservation.Dto.ReservationUpdateRequest;
import com.api.flightReservation.entity.Reservation;
import com.api.flightReservation.repository.ReservationRepository;

@RestController
public class ReservationRestController {

    @Autowired
    ReservationRepository reservationRepository;

    @RequestMapping("/reservations/{id}")
    public Reservation findReservation(@PathVariable Long id){
        return reservationRepository.findById(id).get();
    }

    @PostMapping("/reservations")
    public Reservation updateReservation(@RequestBody ReservationUpdateRequest request){
        Reservation currReservation = reservationRepository.findById(request.getId()).get();
        currReservation.setCheckedIn(request.getCheckedIn());
        currReservation.setNumberOfBags(request.getNumberOfBags());
        return reservationRepository.save(currReservation);
    }
}
