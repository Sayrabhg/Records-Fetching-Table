package com.UserDetails.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UserDetails.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
