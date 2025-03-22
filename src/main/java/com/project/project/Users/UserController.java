package com.project.project.Users;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
//    @PostMapping("/register")  // Use POST for creating new users
    public ResponseEntity<?> registerUser(@RequestParam String email, HttpServletResponse response) {

        if (email == null || email.isEmpty()) {
            return ResponseEntity.badRequest().body("Email cannot be null or empty.");
        }

        if (userService.getUserByEmail(email) != null) {
            return ResponseEntity.badRequest().body("Error: Email already exists!");
        }

        String name = email.split("@")[0];
        String password = "PASSWORD";
        UserEntity newUser = userService.createUser(name, email, password);

        // Create a cookie (e.g., for authentication)
        Cookie cookie = new Cookie("user_id", newUser.getId());
        cookie.setHttpOnly(true); // Prevent JavaScript access (security)
        cookie.setMaxAge(7 * 24 * 60 * 60); // Cookie expires in 7 days
        response.addCookie(cookie);

        return ResponseEntity.ok(newUser);  // Return the created user
    }

}
