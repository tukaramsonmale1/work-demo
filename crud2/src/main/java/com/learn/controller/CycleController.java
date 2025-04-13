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

import com.learn.entity.Cycle;
import com.learn.service.CycleService;

@RestController
public class CycleController 
{
	@Autowired
	private CycleService cycleService;
	
	@PostMapping("/add-cycle")
	public Cycle addData(@RequestBody Cycle cycle)
	{
		return cycleService.addCycle(cycle);
	}
	
	@GetMapping("/get-cycle/{id}")
	public Cycle getData(@PathVariable int id)
	{
		return cycleService.getCycle(id);
	}
	
	@PutMapping("/update-cycle/{id}")
	public Cycle updateData(@PathVariable int id,@RequestBody Cycle cycle)
	{
		return cycleService.updateCycle(id, cycle);
	}
	
	@DeleteMapping("/delete-cycle/{id}")
	public String deleteData(@PathVariable int id)
	{
		return cycleService.deleteCycle(id);
	}
	
	@GetMapping("/getAll-cycle")
	public List<Cycle> getAllData()
	{
		return cycleService.getAllCycle();
	}

}
