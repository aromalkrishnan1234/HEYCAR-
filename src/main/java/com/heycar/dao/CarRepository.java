package com.heycar.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.heycar.model.*;


@Repository
public interface CarRepository extends MongoRepository<Car, String> {

}
