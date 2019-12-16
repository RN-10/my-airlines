package com.airlines.travel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.airlines.travel.Entity.Flight;
import com.airlines.travel.service.FlightService;

@RestController
@CrossOrigin
public class FlightController {
	
	@Autowired
	private FlightService flightService;
	
	@RequestMapping("/flights")
	public List<Flight> getAllFlights() {
		return flightService.getAllFlights();
	}
	
	@RequestMapping(value="/flight/{flightNumber}")
	public Flight getFlight(@PathVariable int flightNumber) {
		return flightService.getFlight(flightNumber);
	}
	
	@RequestMapping(value="/flight", method=RequestMethod.POST)
	public void addFlight(@RequestBody Flight flight) {
		flightService.addFlight(flight);
	}
	
	@RequestMapping(value="/flight/{flightNumber}", method=RequestMethod.PUT)
	public void updateFlight(@PathVariable int flightNumber, @RequestBody Flight flight) {
		flightService.updateFlight(flightNumber, flight);
	}
	
	@RequestMapping(value="/flight/{flightNumber}", method=RequestMethod.DELETE)
	public void deleteFlight(@PathVariable int flightNumber) {
		flightService.deleteFlight(flightNumber);
	}
}
