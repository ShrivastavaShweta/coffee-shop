package org.launchcode.coffeeshopbackend.controllers;

import org.launchcode.coffeeshopbackend.models.Admin;
import org.launchcode.coffeeshopbackend.models.User;
import org.launchcode.coffeeshopbackend.models.data.AdminRepository;
import org.launchcode.coffeeshopbackend.models.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:8080"})
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

    @PostMapping("/register-user")
    public ResponseEntity createUser(@RequestBody User user) {
        try {
            if (adminRepository.count() == 0) {
                Admin _user = adminRepository.save(user.castToAdmin());
            } else {
                User _user = userRepository.save(user);
            }
            return new ResponseEntity<>(_user, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity(null, HttpStatus.INTERNAL_SERVER_ERROR)
        }

    }

}
