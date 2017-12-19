package com.skools.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.skools.dto.UserRequest;
import com.skools.service.UserService;

@Controller
@RequestMapping("/dashboard")
public class DashboardController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/hello")
	public HttpEntity<String> hello() {
		 return new ResponseEntity<>("Hello world", HttpStatus.OK);
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.POST)
    public HttpEntity<String> createUser(@RequestBody UserRequest request) {
        userService.createUser(request.getFirstName(), request.getLastName());
        return new ResponseEntity<>("Created user", HttpStatus.OK);
    }

}