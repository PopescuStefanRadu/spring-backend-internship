package com.example.app3.repository;

import com.example.app3.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findByOrderById();
}
