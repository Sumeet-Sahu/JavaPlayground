package com.experiments.inheritance;

public class Car implements Vehicle {

	@Override
	public int getWheels() {
		return 4;
	}

	@Override
	public String getModel() {
		return "ANY";
	}
	
	public String getEngineCapacity() {
		return "2L";
	}
	

}
