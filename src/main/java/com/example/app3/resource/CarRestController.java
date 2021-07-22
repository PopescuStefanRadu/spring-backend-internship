package com.example.app3.resource;

import com.example.app3.model.CarModel;
import com.example.app3.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/cars")
@RestController
@RequiredArgsConstructor
public class CarRestController {
    private final CarService carService;

    @GetMapping
    List<CarModel> getAllCars() {
        return carService.getAllCarsAsModel();
    }


    @GetMapping("/onequery")
    List<CarModel> getAllCarsOneQuery() {
        return carService.getAllCarsAsModelOneQuery();
    }
}
