package com.example.app3.service;

import com.example.app3.entity.Car;
import com.example.app3.mapper.CarMapper;
import com.example.app3.model.CarModel;
import com.example.app3.repository.CarRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CarService {

    private final CarRepository carRepository;

    public CarService(final CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getAllCars() {
        return carRepository.findByOrderById();
    }

    public List<CarModel> getAllCarsAsModel() {
        return carRepository.findAllStreamableOrderById().map(CarMapper::entityToModel).toList();
    }

    /// try {
    // jta.startTransaction
    // save()
    // jta.commit()
    // } catch () {
    // ????
    // jta.rollback()
    // }
    ///
    public void save(final CarModel carModel) {
        Car car = new Car();
        car.setId(carModel.getId());
        car.setName(carModel.getName());
        car.setColor(carModel.getColor());
    }

    public Car getCarById(Long carId) {
        return carRepository.getById(carId);
    }
    // finally
}
