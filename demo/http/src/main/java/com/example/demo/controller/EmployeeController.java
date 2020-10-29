package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@RestController
//@RequestMapping(value="/rest/users")
public class EmployeeController {
	@Autowired
	EmployeeRepository employeeRepository;
	
	//@GetMapping(value="/all")
	@RequestMapping(value = "/read")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Employee> getAll(){
		System.out.println("Checking");
		return employeeRepository.findAll();
	}
	
	@PostMapping(value="/add")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Employee> persist(@RequestBody final Employee emp){
		employeeRepository.save(emp);
		return employeeRepository.findAll();
	}
	
	@PostMapping(value="/delete")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Employee> deleteEmp(@RequestBody final Employee emp){
		//System.out.println("Delete called");
		List<Employee> allEmp =  employeeRepository.findAll();
		for(Employee each : allEmp) {
			if(each.getEmpId().equals(emp.getEmpId())) {
				employeeRepository.delete(each);
			}
		}
		//System.out.println(emp.getEmpId()+" ********");
		return employeeRepository.findAll();
	}
}
