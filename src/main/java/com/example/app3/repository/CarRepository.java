package com.example.app3.repository;

import com.example.app3.entity.Car;
import com.example.app3.model.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Component;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findByOrderById();

    @Query("SELECT c FROM Car c ORDER BY c.id DESC") // JPQL
    Streamable<Car> findAllStreamableOrderById();
}
