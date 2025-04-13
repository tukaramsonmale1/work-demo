package com.learn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.entity.Bus;
import com.learn.repository.BusRepository;

@Service
public class BusService 
{
	@Autowired
	private BusRepository busRepo;

	public Bus addBus(Bus bus)
	{
		return busRepo.save(bus);
	}
	
	public Bus getBus(int id)
	{
		Optional<Bus> demo = busRepo.findById(id);
		
		return demo.orElse(null);
	}
	
	public Bus updateBus(int id,Bus bus)
	{
		Optional<Bus> demo = busRepo.findById(id);
		
		if(demo.isPresent())
		{
			Bus exstd = demo.get();
			
			exstd.setName(bus.getName());
			exstd.setOrigin(bus.getOrigin());
			exstd.setManufacture(bus.getManufacture());
			return busRepo.save(exstd);
		}
		else
			return null;
	}
	
	public String deleteBus(int id)
	{
		Optional<Bus> demo = busRepo.findById(id);
		
		Bus bus=demo.orElse(null);
		busRepo.delete(bus);
		return "Done";
	}
	
	public List<Bus> getAllBus()
	{
		return busRepo.findAll();
		
	}
}
