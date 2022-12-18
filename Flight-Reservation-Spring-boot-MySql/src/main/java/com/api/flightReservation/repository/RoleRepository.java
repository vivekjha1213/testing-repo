package com.api.flightReservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.flightReservation.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
