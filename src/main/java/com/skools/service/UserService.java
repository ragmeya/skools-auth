package com.skools.service;

import java.util.List;

import com.skools.dto.UserRequest;
import com.skools.entity.User;

public interface UserService {

	User findUser(String firstName);

	List<User> findUsers(String lastName);

	void createStudent(UserRequest request);
	
	void createTeacher(UserRequest request);

}