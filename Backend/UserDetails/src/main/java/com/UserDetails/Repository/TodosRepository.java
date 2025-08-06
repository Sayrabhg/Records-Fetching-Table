package com.UserDetails.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UserDetails.Entity.Todos;

public interface TodosRepository extends JpaRepository<Todos, Integer> {

}
