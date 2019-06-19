package com.devericnjue.springbootjwttutorial.dao;

import com.devericnjue.springbootjwttutorial.model.DAOUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<DAOUser, Long> {

    DAOUser findByUsername(String username);
}
