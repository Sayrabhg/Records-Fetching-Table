package com.UserDetails.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UserDetails.Entity.User;
import com.UserDetails.Repository.UserRepository;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {

	@Autowired
	private UserRepository Urepos;
	
	@PostMapping("/single")
	public User user(@RequestBody User udata) {
		return Urepos.save(udata);
	}
	
	@PostMapping("/multiple")
	public List<User> userdata(@RequestBody List<User> udata){
		return Urepos.saveAll(udata);
	}
	
	@GetMapping("/multiple")
	public List<User> users(){
		return Urepos.findAll();
	}
	
	@GetMapping("/multiple/{id}")
	public Optional<User> user(@PathVariable("id")int id) {
		return Urepos.findById(id);
	}
	
}
