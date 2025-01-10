package com.example.carapi.service;

import com.example.carapi.model.Car;
import com.example.carapi.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public List<Car> findAll() {
        return carRepository.findAll();
    }

    public Optional<Car> findById(Long id) {
        return carRepository.findById(id);
    }

    public Car save(Car car) {
        return carRepository.save(car);
    }

    public Car update(Long id, Car carDetails) {
        Car car = carRepository.findById(id).orElseThrow(() -> new RuntimeException("Car not found"));
        car.setManufacturer(carDetails.getManufacturer());
        car.setModelname(carDetails.getModelname());
        car.setModeltype(carDetails.getModeltype());
        car.setLicenseplate(carDetails.getLicenseplate());
        car.setProductiondate(carDetails.getProductiondate());
        return carRepository.save(car);
    }

    public void delete(Long id) {
        carRepository.deleteById(id);
    }
}