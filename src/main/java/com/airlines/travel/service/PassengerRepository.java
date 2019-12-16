package com.airlines.travel.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.airlines.travel.Entity.Passenger;

@Repository
public interface PassengerRepository extends CrudRepository<Passenger, Integer>{

}
