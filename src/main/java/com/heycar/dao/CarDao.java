package com.heycar.dao;



import java.util.Collection;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.heycar.model.Car;

@Component
public class CarDao {

	
	
	  private final CarRepository carRepository;

	    public CarDao(CarRepository carRepository) {
	        this.carRepository = carRepository;
	    }

	    public Car insertPersonData(Car car) {
	        return carRepository.insert(car);
	    }

	    public Collection<Car> getAllCarInformation() {
	        return carRepository.findAll();
	    }

	    public Optional<Car> getCarInformationByCode(String code) {
	        return carRepository.findById(code);
	    }
}
