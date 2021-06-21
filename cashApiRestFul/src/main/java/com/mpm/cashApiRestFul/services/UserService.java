package com.mpm.cashApiRestFul.services;

import java.util.ArrayList;

import com.mpm.cashApiRestFul.models.UserModel;
import com.mpm.cashApiRestFul.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public ArrayList<UserModel> getUsers(){
        return  (ArrayList<UserModel>) this.userRepository.findAll();
    }

    public UserModel addUser(UserModel usuario){
        return this.userRepository.save(usuario);

    }
    public String deleteUser(Long id){
        try {
            userRepository.deleteById(id);
            return "User delete with id: "+id;
        } catch (Exception e) {
            return "could not delete user";
        }
    }
}
