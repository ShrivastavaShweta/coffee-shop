package org.launchcode.coffeeshopbackend.models;

import org.launchcode.coffeeshopbackend.models.AbstractUser;

import javax.persistence.Entity;
import java.util.Calendar;

@Entity
public class User extends AbstractUser {

    public Admin castToAdmin() {
        Admin admin = new Admin();
        admin.setName(this.getName());
        admin.setPwHash(this.getPwHash());
        admin.setEmail(this.getEmail());
        admin.setBirthday(this.getBirthday());
        return admin;
    }
}
