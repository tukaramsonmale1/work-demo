package com.learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learn.entity.Bus;
import com.learn.service.BusService;

@RestController
public class BusController 
{
	@Autowired
	private BusService busService;

	@PostMapping("/add-bus")
	public Bus addData(@RequestBody Bus bus)
	{
		return busService.addBus(bus);
	}
	
	@GetMapping("/get-bus")
	public Bus getData(@RequestParam int id)
	{
		return busService.getBus(id);
	}
	
	@GetMapping("/getAll-bus")
	public List<Bus> getAllData()
	{
		return busService.getAllBus();
	}
	
	@PutMapping("/update-bus")
	public Bus updateData(@RequestParam int id,@RequestBody Bus bus)
	{
		return busService.updateBus(id, bus);
	}
	
	@DeleteMapping("/delete-bus")
	public String deleteData(@RequestParam int id)
	{
		busService.deleteBus(id);
		return "Done";
	}
	
}
