package com.crud.teste.service;

import com.crud.teste.model.User;
import com.crud.teste.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserServiceInter{
    @Autowired
    UserRepository userRepository;


    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public void update(User user, long id) {
        userRepository.findById(id)
                .map(result ->{
                    result.setName(user.getName());
                    result.setEmail(user.getEmail());
                    result.setPhone(user.getPhone());
                    User update = userRepository.save(result);
                    return ResponseEntity.ok().body(update);
                }).orElse(ResponseEntity.notFound().build());


    }
    @Override
    public void delete(long id) {
        userRepository.deleteById(id);

    }


}
