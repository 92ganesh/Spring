package com.example.demo.resource;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.repository.UsersRepository;
import com.example.demo.model.Users;

@RestController
@RequestMapping(value="/rest/users")
public class UsersResource {
	@Autowired
	UsersRepository usersRepository;
	
	@GetMapping(value="/all")
	public List<Users> getAll(){
		System.out.println("Checking");
		return usersRepository.findAll();
	}
	
	@PostMapping(value="/load")
	public List<Users> persist(@RequestBody final Users users){
		usersRepository.save(users);
		return usersRepository.findAll();
	}
}
