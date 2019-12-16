package com.airlines.travel.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.airlines.travel.Entity.Flight;

@Component
public class FlightService {
	
	@Autowired
	private FlightRepository flightRepository;
	
	public List<Flight> getAllFlights() {	
		List<Flight> flights = new ArrayList<Flight>();
		flightRepository.findAll().forEach(flights::add);
		return flights;
	}
	
	public Flight getFlight(int flightNumber) {	
		return flightRepository.findOne(flightNumber);
	}
	
	public void addFlight(Flight flight) {
		flightRepository.save(flight);
	}

	public void updateFlight(int flightNumber, Flight flight) {
		if (flightRepository.exists(flightNumber)) {
			flightRepository.save(flight);
		}
	}
	
	public void deleteFlight (int flightNumber) {
		flightRepository.delete(flightNumber);
	}
}
