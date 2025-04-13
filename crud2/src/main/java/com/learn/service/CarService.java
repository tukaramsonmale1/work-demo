package com.learn.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.entity.Car;
import com.learn.repository.CarRepository;

@Service
public class CarService 
{
	@Autowired
	private CarRepository carRepo;
	
	public Car addCar(Car car)
	{
		return carRepo.save(car);
	}
	
	public Car updateCar(int id,Car car)
	{
		Optional<Car> existingStudent = carRepo.findById(id);
		
		if(existingStudent.isPresent())
		{
			Car exstd = existingStudent.get();
			
			exstd.setCarName(car.getCarName());
			exstd.setCarModel(car.getCarModel());
			
			return carRepo.save(exstd);
		}
		else
		{
			return null;
		}
	}
	
	public Car getCar(int carId)
	{
		Optional<Car> democar = carRepo.findById(carId);
		
		return democar.orElse(null);
	}
	
	public String deleteCar(int carId)
	{
		Optional<Car> demo = carRepo.findById(carId);
		Car car=demo.orElse(null);
		carRepo.delete(car);
		return "Done";
	}

}
