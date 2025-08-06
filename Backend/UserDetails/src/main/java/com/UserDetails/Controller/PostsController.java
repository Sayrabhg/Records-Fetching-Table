package com.UserDetails.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UserDetails.Entity.Posts;
import com.UserDetails.Repository.PostsRepository;

@RestController
@RequestMapping("/posts")
public class PostsController {

	@Autowired
	private PostsRepository Prepos;
	
	@PostMapping("/single")
	public Posts posts(@RequestBody Posts pdata) {
		return Prepos.save(pdata);
	}
	
	@PostMapping("/multiple")
	public List<Posts> postdata(@RequestBody List<Posts> pdata){
		return Prepos.saveAll(pdata);
	}
	
	@GetMapping("/multiple")
	public List<Posts> posts(){
		return Prepos.findAll();
	}
	
	@GetMapping("/multiple/{id}")
	public Optional<Posts> getsingledata(@PathVariable("id")int id) {
		return Prepos.findById(id);
	}
}
