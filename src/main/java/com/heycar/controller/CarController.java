package com.heycar.controller;


import java.util.Collection;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heycar.model.Car;
import com.heycar.service.CarService;

@RestController
@RequestMapping("car")
public class CarController {
	
	
	private final CarService carService;
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping
    public Car create(@RequestBody Car car) {
        return carService.insertCarData(car);
    }

    @GetMapping
    public Collection<Car> read() {
        return carService.getAllCarInformation();
    }

    @GetMapping(path = "{id}")
    public Optional<Car> readQueryUsingCode(@PathVariable("id") String code) {
        return carService.getCarInformationUsingId(code);
    }
}
