package com.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learn.entity.Truck;
import com.learn.service.TruckService;

@RestController
public class TruckController 
{
	@Autowired
	private TruckService truckService;

	@PostMapping("/add-truck")
	public Truck addData(@RequestBody Truck truck)
	{
		return truckService.addTruck(truck);
	}
	
	@GetMapping("/get-truck/{id}")
	public Truck getData(@PathVariable int id)
	{
		return truckService.getTruck(id);
	}
	
	@PutMapping("/update-truck/{id}")
	public Truck updateData(@PathVariable int id,@RequestBody Truck truck)
	{
		return truckService.updateTruck(id, truck);
	}
	
	@DeleteMapping("/delete-truck/{id}")
	public String deleteData(@PathVariable int id)
	{
		truckService.deleteTruck(id);
		return "Done";
	}
}
