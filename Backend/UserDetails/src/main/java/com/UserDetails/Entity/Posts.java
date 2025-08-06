package com.UserDetails.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Posts {

	@Id
	private int id;
//	user_id
	private String title;
	private String body;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	@Override
	public String toString() {
		return "Posts [id=" + id + ", title=" + title + ", body=" + body + ", user=" + user + "]";
	}
	
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	@OneToMany(mappedBy = "posts", cascade = CascadeType.ALL)
	private List<Comments> comments = new ArrayList<>();
}


// mapped user_id as foreign key
