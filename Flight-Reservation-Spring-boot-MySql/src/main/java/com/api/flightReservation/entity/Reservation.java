package com.api.flightReservation.entity;

import javax.persistence.*;

import com.api.flightReservation.entity.common.AbstractEntity;

@Entity
//@Table(name = "RESERVATION",schema = "Udemy")
public class Reservation extends AbstractEntity{


    private Boolean checkedIn;
    private Integer numberOfBags;

    @OneToOne
    private Passenger passenger;
    @OneToOne
    private Flight flight;

    public Reservation() {
    }



    public Boolean getCheckedIn() {
        return checkedIn;
    }

    public void setCheckedIn(Boolean checkedIn) {
        this.checkedIn = checkedIn;
    }

    public Integer getNumberOfBags() {
        return numberOfBags;
    }

    public void setNumberOfBags(Integer numberOfBags) {
        this.numberOfBags = numberOfBags;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}
