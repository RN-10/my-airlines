package com.airlines.travel.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.airlines.travel.Entity.Passenger;

@Component
public class PassengerService {

	@Autowired
	private PassengerRepository passengerRepository;

	public List<Passenger> getAllPassegners() {
		List<Passenger> passengers = new ArrayList<Passenger>();
		passengerRepository.findAll().forEach(passengers::add);
		return passengers;
	}

	public Passenger getPassenger(int id) {
		return passengerRepository.findOne(id);
	}

	public void addPassenger(Passenger passenger) {
		passengerRepository.save(passenger);
	}

	public void updatePassenger(int id, Passenger passenger) {
		if (passengerRepository.exists(id)) {
			passengerRepository.save(passenger);
		}
	}

	public void deletePassenger(int id) {
		passengerRepository.delete(id);
	}

	public List<Passenger> getAllPassegnersWithMissingData() {
		List<Passenger> passengers = new ArrayList<Passenger>();
		passengerRepository.findAll().forEach((passenger) -> {
			if ((passenger.getAge() == 0 || passenger.getPassportNumber() == null
					|| passenger.getAddress().getBasicAddress() == null || passenger.getAddress().getCity() == null
					|| passenger.getAddress().getState() == null || passenger.getAddress().getPin() == 0)) {
				passengers.add(passenger);
			}
		});
		return passengers;
	}
	
	public List<Passenger> getPassengersOfFlight(int flightNumber) {
		List<Passenger> passengers = new ArrayList<Passenger>();
		passengerRepository.findAll().forEach((passenger) -> {
			if (passenger.getFlight().getNumber() == flightNumber) {
				passengers.add(passenger);
			}
		});
		return passengers;
	}
}
