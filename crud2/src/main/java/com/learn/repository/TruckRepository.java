package com.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.entity.Truck;

public interface TruckRepository extends JpaRepository<Truck, Integer>
{

}
