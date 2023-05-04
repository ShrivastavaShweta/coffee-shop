package org.launchcode.coffeeshopbackend.models;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;


@Entity
public class Admin {

    @Id
    @NotNull
    @Email
    private String userId;

    @NotNull
    private String pwHash;

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    //Constructors
    public Admin() {}

    public Admin(String userId, String password) {
        this.userId = userId;
        this.pwHash = encoder.encode(password);
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPwHash() {
        return pwHash;
    }

}
