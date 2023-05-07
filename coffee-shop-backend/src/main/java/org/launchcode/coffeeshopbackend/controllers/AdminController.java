package org.launchcode.coffeeshopbackend.controllers;

import org.launchcode.coffeeshopbackend.models.Admin;
import org.launchcode.coffeeshopbackend.models.data.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {

    @Autowired
    private AdminRepository  adminRepository;

    @PostMapping("/admin-login")
    public ResponseEntity<?> loginAdmin(@RequestBody Admin adminData){
        Admin admin = adminRepository.findByEmail(adminData.getEmail());
        if (admin.getPwHash().equals(adminData.getPwHash())){
            return ResponseEntity.ok(admin);
        }
        return (ResponseEntity<?>) ResponseEntity.internalServerError();
    }
}
