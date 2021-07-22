package com.example.app3.repository;

import com.example.app3.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Component;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findByOrderById();

    @Query("SELECT c FROM Car c ORDER BY c.id DESC") // JPQL
    Streamable<Car> findAllStreamableOrderById();



    @Query("SELECT c FROM Car c LEFT JOIN FETCH User u ON c.tenant=u ORDER BY c.id DESC") // JPQL
    Streamable<Car> findAllStreamableOrderByIdOneQuery();
}
