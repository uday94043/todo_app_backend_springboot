package com.todoapp.rest.webservices.restfulwebservices.todo;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardcodedService {
	
	private static List<Todo> todos = new ArrayList<Todo>();
	private static long idCounter=0;
	
	static {
		todos.add(new Todo(++idCounter,"in28minutes","Learn React",new Date(),false));
		todos.add(new Todo(++idCounter,"in28minutes","Learn React2",new Date(),false));
		todos.add(new Todo(++idCounter,"in28minutes","Learn React3",new Date(),false));
	}
	
	public List<Todo> findAll(){
		return todos;
	}
	
	public Todo save (Todo todo) {
		if(todo.getId()==-1 || todo.getId()==0) {
			todo.setId(++idCounter);
			todos.add(todo);
		}else {
			deleteById(todo.getId());
			todos.add(todo);
		}
		return todo;
	}
	public Todo deleteById(Long id){
		Todo todo = findById(id);
		if (todo==null) return null;
		if(todos.remove(todo)) {
			return todo;
		}
		return null;
	}

	public Todo findById(Long id) {
		// TODO Auto-generated method stub
		for(Todo todo: todos) {
			if(todo.getId()==id) {
				return todo;
			}
		}
		return null;
	}

}
