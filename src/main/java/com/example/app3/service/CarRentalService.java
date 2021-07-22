package com.example.app3.service;

import com.example.app3.entity.Car;
import com.example.app3.entity.CarRental;
import com.example.app3.entity.User;
import com.example.app3.mapper.CarRentalMapper;
import com.example.app3.model.CarRentalRequestModel;
import com.example.app3.repository.CarRentalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class CarRentalService {

    private final CarRentalRepository carRentalRepository;
    private final CarService carService;
    private final UserService userService;

    public Optional<CarRental> getCurrentCarRental(Long carId) {
        return carRentalRepository.findById(carId);
    }

    public CarRental addRental(CarRentalRequestModel rentalRequestModel) {
        Car carById = carService.getCarById(rentalRequestModel.getCarId());
        User userById = userService.getUserById(rentalRequestModel.getUserId());
        return carRentalRepository.save(CarRentalMapper.toRentedCar(carById, userById));
    }
}
