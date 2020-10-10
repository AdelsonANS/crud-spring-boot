package com.crud.teste.controller;

import com.crud.teste.model.User;
import com.crud.teste.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/users"})
public class UserController {


    @Autowired
    UserService userService;

    @GetMapping
    public List findAll(){
        return userService.findAll();
    }
    @GetMapping(path= {"/{id}"})
    public ResponseEntity findById(@PathVariable long id){
        User result = userService.findById(id);
        return ResponseEntity.ok().body(result);
    }
    @PostMapping
    public User create(@RequestBody User user){
        return userService.create(user);
    }
    @PutMapping(value = "/{id}")
    public void update(@RequestBody User user
            ,@PathVariable("id") long id){
    userService.update(user, id);

    }
    @DeleteMapping(path = {"/{id}"})
    public void delete(@PathVariable long id){
        userService.delete(id);
    }
}
