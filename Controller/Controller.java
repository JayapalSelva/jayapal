package com.oasys.Car.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.oasys.Car.Entity.Car;
import com.oasys.Car.Service.service;


@RestController

public class Controller {
	@Autowired
	service carser;
	
	@PostMapping("/caradded")
	public String add(@RequestBody Car c) {
	return carser.add(c);
	}
	
@GetMapping("/getcar")
public List<Car> getcar() {
	return carser.getcar();
	
}
}
