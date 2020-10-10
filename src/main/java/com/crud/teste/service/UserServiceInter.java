package com.crud.teste.service;

import com.crud.teste.model.User;

import java.util.List;

public interface UserServiceInter {

    List<User> findAll();
    User findById(long id);
    User create (User user);
    void delete(long id);
    void update(User user, long id);

}
