package com.oasys.Car.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.oasys.Car.Entity.Engine;
import com.oasys.Car.Service.Eservice;
@RestController
public class Econtroller {
	@Autowired
	Eservice carser;
	
	@PostMapping("/engineadd")
	public String eng(@RequestBody Engine e) {
		return carser.eng(e);
	
	}
}
