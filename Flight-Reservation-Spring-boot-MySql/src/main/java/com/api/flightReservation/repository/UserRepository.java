package com.api.flightReservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.flightReservation.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {
    public User findByEmail(String email);
}
