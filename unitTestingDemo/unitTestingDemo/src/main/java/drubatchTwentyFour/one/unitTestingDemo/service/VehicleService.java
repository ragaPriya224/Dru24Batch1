package drubatchTwentyFour.one.unitTestingDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import drubatchTwentyFour.one.unitTestingDemo.entity.Vehicle;
import drubatchTwentyFour.one.unitTestingDemo.repository.VehicleRepository;


@Service
public class VehicleService {

	@Autowired
	VehicleRepository vehicleRepository;

	public Vehicle getVehicle(long id) {
		return vehicleRepository.findById(id).get();
	}
}
