package com.cenfotec.graphql.query;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

import com.cenfotec.graphql.entities.Vehicle;
import com.cenfotec.graphql.services.VehicleService;


@Component
public class VehicleQuery implements GraphQLQueryResolver {

	@Autowired
	private VehicleService vehicleService;
	public List<Vehicle> getVehicles(int count) {
	return this.vehicleService.getAllVehicles(count);
	}
	public Optional<Vehicle> getVehicle(int id) {
	return this.vehicleService.getVehicle(id);
	}
	
	
}
