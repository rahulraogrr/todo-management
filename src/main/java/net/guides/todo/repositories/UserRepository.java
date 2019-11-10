package net.guides.todo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.stereotype.Repository;

import net.guides.todo.models.UserModel;

@Repository
public interface UserRepository extends 
RevisionRepository<UserModel, Long, Integer>,JpaRepository<UserModel, Long> {

	
	
}