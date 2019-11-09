package net.guides.todo.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.guides.todo.models.TodoModel;
import net.guides.todo.repositories.TodoRepository;

@Service
public class TodoService implements ITodoService {


	@Autowired
	private TodoRepository todoRepository;

	@Override
	public List < TodoModel > getTodosByUser(String user) {
		return todoRepository.findByUserName(user);
	}

	@Override
	public Optional < TodoModel > getTodoById(long id) {
		return todoRepository.findById(id);
	}

	@Override
	public void updateTodo(TodoModel todo) {
		todoRepository.save(todo);
	}

	@Override
	public void addTodo(String name, String desc, Date targetDate, boolean isDone) {
		todoRepository.save(new TodoModel(name, desc, targetDate, isDone));
	}

	@Override
	public void deleteTodo(long id) {
		Optional < TodoModel > todo = todoRepository.findById(id);
		if (todo.isPresent()) {
			todoRepository.delete(todo.get());
		}
	}

	@Override
	public void saveTodo(TodoModel todo) {
		todoRepository.save(todo);
	}
}
