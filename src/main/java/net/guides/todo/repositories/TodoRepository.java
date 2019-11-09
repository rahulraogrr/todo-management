package net.guides.todo.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import net.guides.todo.models.TodoModel;

public interface TodoRepository extends JpaRepository < TodoModel, Long > {
	List <TodoModel> findByUserName(String user);
}