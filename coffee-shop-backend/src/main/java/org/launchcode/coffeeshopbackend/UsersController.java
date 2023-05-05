package org.launchcode.coffeeshopbackend;

import org.launchcode.coffeeshopbackend.models.Admin;
import org.launchcode.coffeeshopbackend.models.User;
import org.launchcode.coffeeshopbackend.models.data.AdminRepository;
import org.launchcode.coffeeshopbackend.models.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UsersController {

    // constructors
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AdminRepository adminRepository;

    // methods
    @GetMapping("register-user")
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    @PostMapping("register-user")
    public void addUser(@RequestBody User user) {
        if (userRepository.count() == 0) {
            adminRepository.save((Admin) user);
        }
        userRepository.save(user);
    }

}
