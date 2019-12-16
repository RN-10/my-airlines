package com.airlines.travel.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.airlines.travel.Entity.Flight;

@Repository
public interface FlightRepository extends CrudRepository<Flight, Integer>{

}
