package com.devops.demo.controller;

import com.devops.demo.model.User;
import com.devops.demo.repository.UserRepository;
import org.springframework.web.bind.annotation.*;  // RestController, RequestMapping, PostMapping, GetMapping, RequestBody
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("/users")
    public Iterable<User> getUsers() {
        return userRepository.findAll();
    }
}
