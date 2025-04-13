package com.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.entity.Cycle;

public interface CycleRepository extends JpaRepository<Cycle, Integer>
{
	

}
