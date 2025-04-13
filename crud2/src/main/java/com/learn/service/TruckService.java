package com.learn.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.entity.Truck;
import com.learn.repository.TruckRepository;

@Service
public class TruckService 
{
	@Autowired
	private TruckRepository truckRepo;

	
	public Truck addTruck(Truck truck)
	{
		return truckRepo.save(truck);
	}
	
	public Truck getTruck(int id)
	{
		Optional<Truck> demotruck = truckRepo.findById(id);
		
		return demotruck.orElse(null);
	}
	
	public Truck updateTruck(int id,Truck truck)
	{
		Optional<Truck> demo = truckRepo.findById(id);
		
		if(demo.isPresent())
		{
			Truck exstd = demo.get();
			
			exstd.setName(truck.getName());
			exstd.setOrigin(truck.getOrigin());
			
			return truckRepo.save(exstd);
		}
		else
		{
			return null;
		}
	}
	
	public String deleteTruck(int id)
	{
		Optional<Truck> demo = truckRepo.findById(id);
		
			Truck truck=demo.orElse(null);
			truckRepo.delete(truck);
		
			return "Done";
		
	}
}
