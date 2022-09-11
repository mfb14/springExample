package com.patika.patika.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patika.patika.entities.User;

public interface UserDao extends JpaRepository<User, Long>{

}
