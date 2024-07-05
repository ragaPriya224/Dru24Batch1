package drubatchTwentyFour.one.unitTestingDemo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import drubatchTwentyFour.one.unitTestingDemo.entity.Vehicle;
import drubatchTwentyFour.one.unitTestingDemo.repository.VehicleRepository;
@SpringBootTest
public class VehicleServiceTest {

	@Autowired
	VehicleService service;
	@MockBean
	VehicleRepository vehicleRepository;
	
	@Test
	public void testGetVehicle() {
		when(vehicleRepository.findById(1L)).thenReturn(prepareVehicleData());
		Vehicle vehicle = service.getVehicle(1L);
		assertEquals(1L,vehicle.getId());
		assertEquals("bmw",vehicle.getName());
		//we called the method
		//output - assertequals - expectation, actual 
	}
	
	private Optional<Vehicle> prepareVehicleData() {
		Vehicle v = new Vehicle();
		v.setId(1);
		v.setName("bmw");
		return Optional.of(v);
	}
}