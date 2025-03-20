package com.project.project.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
//@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<UserEntity> users(){
        return userService.getUsers();
    }
    @GetMapping("/test")
//    @Param("title") this will go in repository
    public UserEntity test(@RequestParam String email){
        System.out.println("email = "+email);
        if (email == null) {return null;}
        var name = email.split("@")[0];
        var useremail = email;
        var password = "<PASSWORD>";
        if (userService.getUserByEmail(email)==null) {return new UserEntity();}

        return userService.createUser(name, useremail, password);
    }

}
