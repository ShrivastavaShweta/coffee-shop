package org.launchcode.coffeeshopbackend.models;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Calendar;
import java.util.Objects;

@MappedSuperclass
public abstract class AbstractUser {
    //Fields
    @Id
    @GeneratedValue
    private int id;
    @NotNull
    private String name;
    private Calendar birthday;
    @NotNull
    private String email;
//    @OneToMany
//    @JoinColumn(name = "user_id")
//    private ArrayList<Drink> savedDrinks = new ArrayList<>();
//
//    private Drink faveDrink;
   @NotNull
    private String pwHash;
    public static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    //Constructors
    public AbstractUser() {}
    public AbstractUser(String name, String password, String email, Calendar birthday) {
        this.name = name;
        this.pwHash = encoder.encode(password);
        this.email = email;
        this.birthday = birthday;
    }

    //Getters and Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public String getPwHash() {
        return pwHash;
    }
    public void setPwHash(String password) {
        this.pwHash = encoder.encode(password);
    }

    public Calendar getBirthday() {
        return birthday;
    }
    public void setBirthday(Calendar birthday) {
        this.birthday = birthday;
    }

//    public Drink getFaveDrink() {
//        return faveDrink;
//    }

//    public void setFaveDrink(Drink faveDrink) {
//        this.faveDrink = faveDrink;
//    }

    //Instance Methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractUser that = (AbstractUser) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    public boolean isAdmin() {
        if (this.getClass() == Admin.class) {return true;}
        else {return false;}
    }
    public boolean isMatchingPassword(String password) {
        return encoder.matches(password, pwHash);
    }

//    public void addSavedDrink(Drink drink) {
//        savedDrinks.add(drink);
//    }

//    public void deleteSavedDrink(Drink drink) {
//        savedDrinks.remove(drink);
//    }
}