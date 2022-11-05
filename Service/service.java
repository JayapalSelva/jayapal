package com.oasys.Car.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oasys.Car.Entity.Car;
import com.oasys.Car.Entity.Engine;
import com.oasys.Car.Repository.CarRepository;
@Repository

public class service {
@Autowired

CarRepository carRepo;
	
		public String add(Car c) {
			carRepo.save(c);
			return"ADDED SUCEESFULLY";
	
	}

		public List<Car> getcar() {
			
			return carRepo.getcarByEngine();
		}

		

		

}
