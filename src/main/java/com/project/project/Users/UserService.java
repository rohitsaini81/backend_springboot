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
        System.out.println("full_name = " + full_name + " email = " + email + " password = " + password);
        if (full_name ==null || email == null || password == null) {
            throw new IllegalArgumentException("Error: All fields must be provided!");
        }
        if (userRepository.findByEmail(email).isPresent()) {
            throw new IllegalStateException("Error: Email already exists!");
        }
        try {
        UserEntity user = new UserEntity();
        user.setFull_name(full_name);
        user.setEmail(email);
        user.setPassword(password);
        return userRepository.save(user);        }
        catch (Exception e) {
            throw new RuntimeException("Error creating user", e);        }

    }

}

