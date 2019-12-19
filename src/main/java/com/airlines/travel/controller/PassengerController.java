package com.airlines.travel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.airlines.travel.Entity.Passenger;
import com.airlines.travel.service.PassengerService;

@RestController
@CrossOrigin
public class PassengerController {
	
	@Autowired
	private PassengerService passengerService;
	
	@RequestMapping("/passengers")
	public List<Passenger> getAllPassengers() {
		return passengerService.getAllPassegners();
	}
	
	@RequestMapping(value="/passenger/{id}")
	public Passenger getPassenger(@PathVariable int id) {
		return passengerService.getPassenger(id);
	}
	
	@RequestMapping(value="/passenger", method=RequestMethod.POST)
	public void addPassenger(@RequestBody Passenger passenger) {
		passengerService.addPassenger(passenger);
	}
	
	@RequestMapping(value="/passenger/{id}", method=RequestMethod.PUT)
	public void updatePassenger(@PathVariable int id, @RequestBody Passenger passenger) {
		Passenger passengerForExtraDetails = passengerService.getPassenger(id);
		passenger.setAncilliary(passengerForExtraDetails.getAncilliary());
		passenger.setCheckinStatus(passengerForExtraDetails.getCheckinStatus());
		passenger.setFlight(passengerForExtraDetails.getFlight());
		passenger.setSeat(passengerForExtraDetails.getSeat());
		passengerService.updatePassenger(id, passenger);
	}
	
	@RequestMapping(value="/passenger/{id}", method=RequestMethod.DELETE)
	public void deletePassenger(int id) {
		passengerService.deletePassenger(id);
	}
	
	@RequestMapping("/passengerswithmissingdata")
	public List<Passenger> getAllPassengersWithMissingData() {
		return passengerService.getAllPassegnersWithMissingData();
	}
	
	@RequestMapping(value="/passengersOfFlight/{flightNumber}", method=RequestMethod.GET)
	public List<Passenger> getPassengersOfFlight(@PathVariable int flightNumber) {
		return passengerService.getPassengersOfFlight(flightNumber);
	}
	
	
}
 
