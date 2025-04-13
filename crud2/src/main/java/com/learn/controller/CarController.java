package com.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learn.entity.Car;
import com.learn.service.CarService;

@RestController
public class CarController 
{

	@Autowired
	private CarService carService;
	
	@PostMapping("/add-car")
	public String addData(@RequestBody Car car)
	{
		carService.addCar(car);
		return "Done";
	}
	
	@PutMapping("/update/{carId}")
	public String updateData(@PathVariable int carId,@RequestBody Car car)
	{
		
		carService.updateCar(carId, car);
		return "Done";
	}
	
	@GetMapping("/get/{carId}")
	public Car getData(@PathVariable int carId)
	{
		return carService.getCar(carId);
	}
	
	
	@DeleteMapping("/delete/{carId}")
	public String deleteData(@PathVariable int carId)
	{
		carService.deleteCar(carId);
		return "Done";
	}
}
