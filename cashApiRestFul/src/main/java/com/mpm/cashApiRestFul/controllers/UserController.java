package com.mpm.cashApiRestFul.controllers;

import java.util.ArrayList;

import com.mpm.cashApiRestFul.models.UserModel;
import com.mpm.cashApiRestFul.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping()
    public ArrayList<UserModel> getUsers(){
        return this.userService.getUsers();
        
    }
    @PostMapping()
    public UserModel addUser(@RequestBody UserModel usuario){
        return this.userService.addUser(usuario);
    }
    @DeleteMapping(path = "/{id}")
    public String deleteUser(@PathVariable("id") Long id){
        return this.userService.deleteUser(id);
    }
    
}
