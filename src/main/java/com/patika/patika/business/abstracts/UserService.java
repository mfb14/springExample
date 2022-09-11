package com.patika.patika.business.abstracts;

import java.util.List;

import com.patika.patika.entities.User;

public interface UserService {

	List<User> findAllUsers();

}
