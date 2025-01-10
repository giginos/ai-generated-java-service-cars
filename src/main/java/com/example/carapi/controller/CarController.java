package com.example.carapi.controller;

import com.example.carapi.model.Car;
import com.example.carapi.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars/v1")
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping("/detail/{id}")
    public ResponseEntity<Car> getCarById(@PathVariable String id) {
        Long carId = Long.parseLong(id, 16); // Assuming ID is in hexadecimal format
        return carService.findById(carId)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/list")
    public List<Car> getAllCars() {
        return carService.findAll();
    }

    @PostMapping("/detail")
    public Car createCar(@RequestBody Car car) {
        return carService.save(car);
    }

    @PutMapping("/detail/{id}")
    public ResponseEntity<Car> updateCar(@PathVariable String id, @RequestBody Car carDetails) {
        Long carId = Long.parseLong(id, 16); // Assuming ID is in hexadecimal format
        Car updatedCar = carService.update(carId, carDetails);
        return ResponseEntity.ok(updatedCar);
    }
}