package com.UserDetails.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UserDetails.Entity.Comments;

public interface CommentsRepository extends JpaRepository<Comments, Integer> {

}
