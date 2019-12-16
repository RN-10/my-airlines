package com.airlines.travel.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.ColumnDefault;
import org.springframework.stereotype.Component;

@Entity
@Component
public class Passenger {
	
	@Id
	private int id;
	@OneToOne
	private Flight flight;
	private String name;
	@Column(nullable=true)
	private int age;
	private String passportNumber;
	private Address address;
	private Ancilliary ancilliary;
	@ColumnDefault("false")
	private boolean checkinStatus;
	@Column(nullable=false)
	private int seat;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Ancilliary getAncilliary() {
		return ancilliary;
	}
	public void setAncilliary(Ancilliary ancilliary) {
		this.ancilliary = ancilliary;
	}
	public boolean getCheckinStatus() {
		return checkinStatus;
	}
	public void setCheckinStatus(boolean checkinStatus) {
		this.checkinStatus = checkinStatus;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	
}
