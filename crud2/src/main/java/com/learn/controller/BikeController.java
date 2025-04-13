package com.learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learn.entity.Bike;
import com.learn.service.BikeService;

@RestController
public class BikeController 
{
	@Autowired
	private BikeService bikeService;
	
	@PostMapping("/add-bike")
	public Bike addData(@RequestBody Bike bike)
	{
		return bikeService.addBike(bike);
	}
	
	@GetMapping("/get-bike/{id}")
	public Bike getData(@PathVariable int id)
	{
		return bikeService.getBike(id);
	}
	
	@PutMapping("/update-bike/{id}")
	public Bike updateData(@PathVariable int id,@RequestBody Bike bike)
	{
		return bikeService.updateBike(id, bike);
	}
	
	@GetMapping("/getAll-bike")
	public List<Bike> getAllData()
	{
		return bikeService.getAllBike();
	}
	
	@DeleteMapping("/delete-bike/{id}")
	public String deleteData(@PathVariable int id)
	{
		bikeService.deleteBike(id);
		return "Done";
	}
	
	

}
