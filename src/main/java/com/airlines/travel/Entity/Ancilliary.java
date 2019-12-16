package com.airlines.travel.Entity;

import javax.persistence.Embeddable;

import org.hibernate.annotations.ColumnDefault;
import org.springframework.stereotype.Component;

@Embeddable
@Component
public class Ancilliary {
	
	@ColumnDefault("false")
	private boolean normalMeals;
	@ColumnDefault("false")
	private boolean specialMeals;
	@ColumnDefault("false")
	private boolean wheelChair;
	
	public boolean isNormalMeals() {
		return normalMeals;
	}
	public void setNormalMeals(boolean normalMeals) {
		this.normalMeals = normalMeals;
	}
	public boolean isSpecialMeals() {
		return specialMeals;
	}
	public void setSpecialMeals(boolean specialMeals) {
		this.specialMeals = specialMeals;
	}
	public boolean isWheelChair() {
		return wheelChair;
	}
	public void setWheelChair(boolean wheelChair) {
		this.wheelChair = wheelChair;
	}
}
