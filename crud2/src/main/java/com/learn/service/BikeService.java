package com.learn.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.entity.Bike;
import com.learn.repository.BikeRepository;

@Service
public class BikeService 
{
	@Autowired
	private BikeRepository bikeRepo;

	
	public Bike addBike(Bike bike)
	{
		return bikeRepo.save(bike);
	}
	
	public Bike getBike(int id)
	{
		Optional<Bike> demo = bikeRepo.findById(id);
		return demo.orElse(null);
	}
	
	public Bike updateBike(int id,Bike bike)
	{
		Optional<Bike> demo = bikeRepo.findById(id);
		
		if(demo.isPresent())
		{
			Bike exstd = demo.orElse(null);
			
			exstd.setName(bike.getName());
			exstd.setReleaseDate(bike.getReleaseDate());
			return bikeRepo.save(exstd);
			
		}else
		{
			return null;
		}
	}
	
	public String deleteBike(int id)
	{
		Optional<Bike> demo = bikeRepo.findById(id);
		
		Bike demo2 = demo.orElse(null);
		bikeRepo.delete(demo2);
		return "Done";
	}
	
	public List<Bike> getAllBike()
	{
		return bikeRepo.findAll();
	}
}
