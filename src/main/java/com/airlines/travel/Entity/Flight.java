package com.airlines.travel.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;


@Entity
@Component
public class Flight {
	
	@Id
	private int number;
	private String name;
	private Date departure;
	private Date destiny;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDeparture() {
		return departure;
	}
	public void setDeparture(Date departure) {
		this.departure = departure;
	}
	public Date getDestiny() {
		return destiny;
	}
	public void setDestiny(Date destiny) {
		this.destiny = destiny;
	}
	
}
