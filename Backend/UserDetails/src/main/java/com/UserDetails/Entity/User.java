package com.UserDetails.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class User {
	
	@Id
	private int id;
	private String name;
	private String email;
	private String gender;
	private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", gender=" + gender + ", status=" + status + "]";
	}
	
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<Posts> posts = new ArrayList<>();
	
//	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL) //(error)
//	private Todos todos;
}


//mapped posts success 
//mapped todos success
