package com.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.entity.Car;

public interface CarRepository extends JpaRepository<Car,Integer>
{

}
