package com.skools.service;

import java.util.List;

import com.skools.entity.User;

public interface UserService {

	void createUser(String firstName, String lastName);

	User findUser(String firstName);

	List<User> findUsers(String lastName);

}