package com.example.app3.resource;

import com.example.app3.entity.CarRental;
import com.example.app3.model.CarRentalModel;
import com.example.app3.model.CarRentalRequestModel;
import com.example.app3.service.CarRentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/car-rental")
@RequiredArgsConstructor
public class CarRentalRestController {
    private final CarRentalService carRentalService;


    // TODO intors pe pagini
    @GetMapping("/{id}")
    public ResponseEntity<CarRental> getAll(@PathVariable Long id) {
        return carRentalService.getCurrentCarRental(id).map(car -> ResponseEntity.ok(car)).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/create")
    public CarRentalModel save(@RequestBody CarRentalRequestModel carRentalRequestModel) {
        CarRental carRental = carRentalService.addRental(carRentalRequestModel);
        return CarRentalModel.builder().id(carRental.getId()).carId(carRental.getCar().getId()).userId(carRental.getUser().getId()).build();
    }

}
