package org.sn.shopliker.controllers;

import org.sn.shopliker.entity.User;
import org.sn.shopliker.repository.UserRepository;
import org.sn.shopliker.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/user")
    public User saveUser(@Validated @RequestBody User user) {
        return userRepository.save(user);
    }
}
