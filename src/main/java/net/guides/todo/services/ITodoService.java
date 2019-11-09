package net.guides.todo.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import net.guides.todo.models.TodoModel;

public interface ITodoService {
	List < TodoModel > getTodosByUser(String user);

	Optional < TodoModel > getTodoById(long id);

	void updateTodo(TodoModel todo);

	void addTodo(String name, String desc, Date targetDate, boolean isDone);

	void deleteTodo(long id);

	void saveTodo(TodoModel todo);
}