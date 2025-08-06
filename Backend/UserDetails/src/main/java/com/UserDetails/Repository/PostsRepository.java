package com.UserDetails.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UserDetails.Entity.Posts;

public interface PostsRepository extends JpaRepository<Posts, Integer> {

}
