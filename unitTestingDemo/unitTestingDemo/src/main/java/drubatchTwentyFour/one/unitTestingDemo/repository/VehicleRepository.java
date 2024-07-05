package drubatchTwentyFour.one.unitTestingDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import drubatchTwentyFour.one.unitTestingDemo.entity.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long>{
	
}
