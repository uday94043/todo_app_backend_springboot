package com.todoapp.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class HelloWorldController {
	
	//@RequestMapping(method=RequestMethod.GET, path="/hello-world")
	@GetMapping(path="/hello-world-bean/{name}")
	public HelloWorldBean HelloWorldBean(@PathVariable String name) {
		return new HelloWorldBean(String.format("Welcome, %s", name));
	}

}
