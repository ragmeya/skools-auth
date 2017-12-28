package com.skools.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.skools.auth.util.SMSSender;
import com.skools.dto.UserRequest;
import com.skools.service.UserService;

@Controller
@RequestMapping("/user")
public class AuthController {

	@Autowired
	private UserService userService;

	@Autowired
	private SMSSender smsSender;

	@RequestMapping("/sendotp")
	public HttpEntity<String> hello(@RequestParam String mobileNumber, @RequestParam String message, @RequestParam String sender) {
		smsSender.send(mobileNumber, message, sender);
		return new ResponseEntity<>("Hello world", HttpStatus.OK);
	}

	@RequestMapping(value = "/student/", method = RequestMethod.POST)
	public HttpEntity<String> createStudent(@RequestBody UserRequest request) {
		userService.createStudent(request);
		return new ResponseEntity<>("Created user", HttpStatus.OK);
	}

	@RequestMapping(value = "/teacher/", method = RequestMethod.POST)
	public HttpEntity<String> createTeacher(@RequestBody UserRequest request) {
		userService.createTeacher(request);
		return new ResponseEntity<>("Created user", HttpStatus.OK);
	}
}