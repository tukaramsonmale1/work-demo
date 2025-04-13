package com.learn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.entity.Cycle;
import com.learn.repository.CycleRepository;

@Service
public class CycleService 
{
	
	@Autowired
	private CycleRepository cycleRepo;
	
	
	public Cycle addCycle(Cycle cycle)
	{
		return cycleRepo.save(cycle);
	}
	
	public Cycle getCycle(int id)
	{
		Optional<Cycle> demo = cycleRepo.findById(id);
		
		return demo.orElse(null);
	}
	

	public Cycle updateCycle(int id,Cycle cycle)
	{
		Optional<Cycle> demo = cycleRepo.findById(id);
		
		if(demo.isPresent())
		{
			Cycle exstd =demo.get();
			
			exstd.setName(cycle.getName());
			exstd.setBuyDate(cycle.getBuyDate());
			
			return cycleRepo.save(exstd);
		}
		else
			return null;
	}
	
	public String deleteCycle(int id)
	{
		Optional<Cycle> demo = cycleRepo.findById(id);
		
		Cycle cycle = demo.get();
		
		cycleRepo.delete(cycle);
		
		return "Done";
	}
	
	public List<Cycle> getAllCycle()
	{
		return cycleRepo.findAll();
	}

}
