package com.oasys.Car.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.oasys.Car.Entity.Car;
import com.oasys.Car.Entity.Engine;
import com.oasys.Car.Repository.CarRepository;
import com.oasys.Car.Repository.EngineRepository;
@Repository
public class Eservice {
	@Autowired
	EngineRepository carRepo;
public String eng(Engine  e) {
		
		carRepo.save(e);
		
		return"ADDED SUCEESFULLY";
}
	
}


