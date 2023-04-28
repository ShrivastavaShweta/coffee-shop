package org.launchcode.coffeeshopbackend.models;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Calendar;

@Entity
public class User extends AbstractEntity {

    //Fields
    @NotNull
    private String username;
    private Calendar birthday;
    private String email;
    private ArrayList<Drink> savedDrinks = new ArrayList<>();
    private Drink faveDrink;
   @NotNull
    private String pwHash;
    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    //Constructors
    public User() {}
    public User(String username, String password, String email, Calendar birthday) {
        this.username = username;
        this.pwHash = encoder.encode(password);
        this.email = email;
        this.birthday = birthday;
    }

    //Getters and Setters
    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public void setBirthday(Calendar birthday) {
        this.birthday = birthday;
    }

    public Drink getFaveDrink() {
        return faveDrink;
    }

    public void setFaveDrink(Drink faveDrink) {
        this.faveDrink = faveDrink;
    }

    //Instance Methods
    public boolean isMatchingPassword(String password) {
        return encoder.matches(password, pwHash);
    }

    public void addSavedDrink(Drink drink) {
        savedDrinks.add(drink);
    }

    public void deleteSavedDrink(Drink drink) {
        savedDrinks.remove(drink);
    }
}
