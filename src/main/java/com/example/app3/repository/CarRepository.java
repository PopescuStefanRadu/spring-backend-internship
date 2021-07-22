package com.example.app3.repository;

import com.example.app3.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository  extends JpaRepository<Car, Long> {
    List<Car> findByOrderById();
}
