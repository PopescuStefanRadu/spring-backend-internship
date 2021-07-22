package com.example.app3.mapper;

import com.example.app3.entity.Car;
import com.example.app3.entity.CarRental;
import com.example.app3.entity.User;

public final class CarRentalMapper {
    private CarRentalMapper() {}

    public static CarRental toRentedCar(Car car, User user) {
        return CarRental.builder().id(1L).car(car).user(user).build();
    }
}
