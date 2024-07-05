package drubatchTwentyFour.one.unitTestingDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import drubatchTwentyFour.one.unitTestingDemo.entity.Vehicle;
import drubatchTwentyFour.one.unitTestingDemo.service.VehicleService;


@RestController
public class VehicleController {

	@Autowired
	VehicleService service;
	
	@GetMapping("/vehicle/{id}")
	public Vehicle getVehicle(@PathVariable long id) {
		return service.getVehicle(id);
	}
	
}