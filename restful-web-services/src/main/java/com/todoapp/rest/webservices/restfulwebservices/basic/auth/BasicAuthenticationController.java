package com.todoapp.rest.webservices.restfulwebservices.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class BasicAuthenticationController {
	
	//@RequestMapping(method=RequestMethod.GET, path="/hello-world")
	@GetMapping(path="/basicauth")
	public AuthenticationBean AuthenticationBean() {
		return new AuthenticationBean("You are authenticated");
	}

}
