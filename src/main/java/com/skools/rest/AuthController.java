package com.skools.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.skools.auth.util.SMSSender;
import com.skools.dto.UserRequest;
import com.skools.service.UserService;

@Controller
@RequestMapping("/auth")
public class AuthController {

	@Autowired
	private UserService userService;

	@Autowired
	private SMSSender smsSender;

	@RequestMapping("/sendotp")
	public HttpEntity<String> hello() {
		smsSender.send();
		return new ResponseEntity<>("Hello world", HttpStatus.OK);
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public HttpEntity<String> createUser(@RequestBody UserRequest request) {
		userService.createUser(request);
		return new ResponseEntity<>("Created user", HttpStatus.OK);
	}

}