package com.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.entity.Bus;

public interface BusRepository extends JpaRepository<Bus, Integer>
{

}
