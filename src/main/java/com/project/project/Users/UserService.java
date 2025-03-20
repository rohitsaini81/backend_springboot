package com.project.project.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserEntity> getUsers() {
        return userRepository.findAll();
    }

    public UserEntity getUserByEmail(String email) {
        return userRepository.findByEmail(email).orElse(null);  // Returns user if found, otherwise null
    }


    public UserEntity createUser(String full_name, String email, String password) {
        System.out.println("creating user 1");
        if (full_name ==null &&email == null && password == null) {return null;}
        if (userRepository.findByEmail(email).isEmpty()) {
            return null;}
        System.out.println("creating user");
        return  null;
    }

}

