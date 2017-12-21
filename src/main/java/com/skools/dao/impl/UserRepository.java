package com.skools.dao.impl;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skools.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	public User findByFirstName(String firstName);

	public List<User> findByLastName(String lastName);

}
