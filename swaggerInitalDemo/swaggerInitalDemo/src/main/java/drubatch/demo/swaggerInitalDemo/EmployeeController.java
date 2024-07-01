package drubatch.demo.swaggerInitalDemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepository;


	@GetMapping("/employees")
	public List<Employee> findAllEmployees(){
		return employeeRepository.findAll();
	}

	@GetMapping("/employees/{employeeId}")
	public Employee getEmployee(@PathVariable int employeeId){
		Employee emp = employeeRepository.findById(employeeId).orElseThrow(()-> new RuntimeException(
				"Employee Id not found -" +employeeId));
		return emp;
	}
	
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee emp) {
		emp.setId(0);
		return employeeRepository.save(emp);
	}
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee emp) {
		return employeeRepository.save(emp);
	}
	

	@DeleteMapping("/employees/{employeeId}")
	public String deleteEmployee(@PathVariable int employeeId){
		Employee emp = employeeRepository.findById(employeeId).orElseThrow(()-> new RuntimeException(
				"Employee Id not found -" +employeeId));
		employeeRepository.delete(emp);
		return "deleted employee with id" +employeeId;
	}
}
