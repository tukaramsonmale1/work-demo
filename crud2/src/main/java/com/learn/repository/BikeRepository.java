package com.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.entity.Bike;

public interface BikeRepository extends JpaRepository<Bike, Integer>
{

}
