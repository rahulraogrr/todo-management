package net.guides.todo.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.stereotype.Repository;

import net.guides.todo.models.TodoModel;

@Repository
public interface TodoRepository extends RevisionRepository<TodoModel, Long, Long>,JpaRepository < TodoModel, Long > {
	List <TodoModel> findByUserName(String user);
}