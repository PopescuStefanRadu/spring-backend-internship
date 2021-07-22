package com.example.app3.mapper;

import com.example.app3.entity.Car;
import com.example.app3.model.CarModel;

import java.util.Optional;

public final class CarMapper {

    private CarMapper() {}

    public static CarModel entityToModel(Car car) {
        return CarModel.builder()
                .id(car.getId())
                .color(car.getColor())
                .name(car.getName())
                .tenantModel(Optional.ofNullable(car.getTenant()).map(UserMapper::entityToModel))
                .build();
    }
}
