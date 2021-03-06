package com.clicker.repository;


import com.clicker.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<User,Integer>{
    User getUserByEmail(String email);
    User getUserByLogin(String login);
}
