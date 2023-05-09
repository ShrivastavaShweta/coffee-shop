package org.launchcode.coffeeshopbackend.controllers;

import org.launchcode.coffeeshopbackend.models.Admin;
import org.launchcode.coffeeshopbackend.models.User;
import org.launchcode.coffeeshopbackend.models.data.AdminRepository;
import org.launchcode.coffeeshopbackend.models.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("")
public class UsersController {

    // constructors
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AdminRepository adminRepository;

    // methods
    @GetMapping("/register-user")
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/register-user")
    public Object createUser(@Valid @RequestBody User user) {
        if (adminRepository.count() == 0) {
            return adminRepository.save(user.castToAdmin());
        } else {
            return userRepository.save(user);
        }
    }

}
