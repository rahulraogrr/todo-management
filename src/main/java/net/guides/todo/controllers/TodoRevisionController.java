package net.guides.todo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.guides.todo.repositories.TodoRepository;

@RestController
@RequestMapping("/todo-revision")
public class TodoRevisionController {

	private TodoRepository todoRepository;
	
	@GetMapping("/getInfo/{id}") 
	public void getRevisionInfo(@PathVariable Long id) {
		System.out.println("Came inside getRevisionInfo"); 
		System.out.println(todoRepository.findLastChangeRevision(id)); 
	} 
	
}