package com.devops.demo.controller;

import com.devops.demo.model.User;
import com.devops.demo.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")   // ✅ Frontend public EC2 ke liye
@RestController
@RequestMapping("/api")
public class UserController {

    private final UserRepository userRepository;

    // ✅ Constructor Injection (Best Practice)
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // ✅ Save user in MongoDB
    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userRepository.save(user);
    }

    // ✅ Fetch all users from MongoDB
    @GetMapping("/users")
    public Iterable<User> getUsers() {
        return userRepository.findAll();
    }
}
