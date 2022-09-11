package com.patika.patika.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.patika.patika.business.abstracts.UserService;
import com.patika.patika.dataAccess.UserDao;
import com.patika.patika.entities.User;

@Service
public class UserManager implements UserService{

	UserDao userDao;

	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public List<User> findAllUsers() {
		return userDao.findAll();
	}
	
	
}
