package com.example.app3.repository;

import com.example.app3.entity.CarRental;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRentalRepository extends JpaRepository<CarRental, Long> {
}
