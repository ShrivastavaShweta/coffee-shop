package org.launchcode.coffeeshopbackend.controllers;

import org.launchcode.coffeeshopbackend.models.User;
import org.launchcode.coffeeshopbackend.models.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(originPatterns = "http://localhost:4200/*", allowedHeaders = {"x-auth-token", "x-requested-with", "x-xsrf-token"})
@RestController
public class UsersController {

    // constructors
    @Autowired
    private UserRepository userRepository;

    // methods
    @GetMapping("/register-user")
    public Iterable<User> getUsers() {
        return userRepository.findAll();
    }

    @CrossOrigin(originPatterns = "http://localhost:4200/*")
    @PostMapping("/register-user")
    public @ResponseBody User createUser(@Valid @RequestBody User user) {
            return userRepository.save(user);
    }

}
