package com.oasys.Car.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.oasys.Car.Entity.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {
	
	@Query(value= "SELECT * from car INNER JOIN engine ON car.id=engine.id",nativeQuery = true)
	 
	public List<Car>getcarByEngine();
}
