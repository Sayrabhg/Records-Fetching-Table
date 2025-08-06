package com.UserDetails.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UserDetails.Entity.Comments;
import com.UserDetails.Repository.CommentsRepository;

@RestController
@RequestMapping("/comments")
public class CommentsController {

	@Autowired
	private CommentsRepository Crepos;
	
	@PostMapping("/single")
	public Comments comments(@RequestBody Comments cdata) {
		return Crepos.save(cdata);
	}
	
	@PostMapping("/multiple")
	public List<Comments> comments(@RequestBody List<Comments> Cdata){
		return Crepos.saveAll(Cdata);
	}
	
	@GetMapping("/multiple")
	public List<Comments> comments(){
		return Crepos.findAll();
	}
}
