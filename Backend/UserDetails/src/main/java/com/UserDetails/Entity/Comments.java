package com.UserDetails.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Comments {

	@Id
	private int id;
	//post_id
	private String name;
	private String email;
	private String body;
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
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	@Override
	public String toString() {
		return "Comments [id=" + id + ", name=" + name + ", email=" + email + ", body=" + body + ", posts=" + posts
				+ "]";
	}
	
	@ManyToOne
	@JoinColumn(name="post_id")
	private Posts posts;
	public Posts getPosts() {
		return posts;
	}
	public void setPosts(Posts posts) {
		this.posts = posts;
	}
}


//mapped post_id as foreign key