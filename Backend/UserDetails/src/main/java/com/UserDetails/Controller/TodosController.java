package com.UserDetails.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UserDetails.Entity.Todos;
import com.UserDetails.Repository.TodosRepository;

@RestController
@RequestMapping("/todos")
public class TodosController {

	@Autowired
	private TodosRepository Trepos;
	
	@PostMapping("/single")
	public Todos todos(@RequestBody Todos tdata) {
		return Trepos.save(tdata);
	}
	
	@PostMapping("/multiple")
	public List<Todos> todos(@RequestBody List<Todos> tdata){
		return Trepos.saveAll(tdata);
	}
	
	@GetMapping("/multiple")
	public List<Todos> todos(){
		return Trepos.findAll();
	}
	
}
