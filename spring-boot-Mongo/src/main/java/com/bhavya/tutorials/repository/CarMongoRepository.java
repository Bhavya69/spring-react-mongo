package com.bhavya.tutorials.repository;

import org.springframework.data.repository.CrudRepository;

import com.bhavya.tutorials.model.Car;

public interface CarMongoRepository extends CrudRepository<Car, String>{}