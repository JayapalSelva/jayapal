package com.oasys.Car.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oasys.Car.Entity.Engine;



public interface EngineRepository extends JpaRepository<Engine, Integer> {

}
