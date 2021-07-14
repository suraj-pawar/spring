package com.java.example;

import org.springframework.beans.factory.config.AbstractFactoryBean;

public class VehicleFactoryBean  extends AbstractFactoryBean{

	private Vehicle vehicle;
	
	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public Class getObjectType() {
		return Vehicle.class;
	}

	@Override
	protected Object createInstance() throws Exception {
		return vehicle;
	}

}
