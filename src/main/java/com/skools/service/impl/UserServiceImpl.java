package com.skools.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skools.dao.impl.UserRepository;
import com.skools.dto.UserRequest;
import com.skools.entity.User;
import com.skools.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repository;

	/* (non-Javadoc)
	 * @see com.skools.service.impl.UserService#createUser(java.lang.String, java.lang.String)
	 */
	@Override
	public void createUser(UserRequest request) {
		repository.save(new User(request.getFirstName(), request.getLastName(), request.getEmail(), request.getPhone(), request.getAddress(), request.getAadhaar()));
	}

	/* (non-Javadoc)
	 * @see com.skools.service.impl.UserService#findUser(java.lang.String)
	 */
	@Override
	public User findUser(String firstName) {
		return repository.findByFirstName(firstName);
	}

	/* (non-Javadoc)
	 * @see com.skools.service.impl.UserService#findUsers(java.lang.String)
	 */
	@Override
	public List<User> findUsers(String lastName) {
		return repository.findByLastName(lastName);
	}
}
