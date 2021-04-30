package com.heycar.service;



import java.util.Collection;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.heycar.dao.CarDao;
import com.heycar.model.Car;


@Service
public class CarService {
	
	
	 private final CarDao carDao;

	    public CarService(CarDao carDao) {
	        this.carDao = carDao;
	    }

	    public Car insertCarData(Car car) {
	        return carDao.insertPersonData(car);
	    }

	    public Collection<Car> getAllCarInformation() {
	        return carDao.getAllCarInformation();
	    }

	    public Optional<Car> getCarInformationUsingId(String code) {
	        return carDao.getCarInformationByCode(code);
	    }

}
