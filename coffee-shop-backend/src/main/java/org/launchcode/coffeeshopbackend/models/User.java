package org.launchcode.coffeeshopbackend.models;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "users",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "email")
        })
public class User {
    //Fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String name;
    @Pattern(message = "Please enter valid date in format DD/MM", regexp = "[[0-2]d|3[0,1]]/[0[1-9]|1[0-2]]")
    private String birthday;
    @NotBlank
    @Email
    private String email;
//    @OneToMany
//    @JoinColumn(name = "user_id")
//    private ArrayList<Drink> savedDrinks = new ArrayList<>();
//
//    private Drink faveDrink;
   @NotNull
    private String password;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    //Constructors
    public User() {}
    public User(String name, String password, String email, String birthday) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.birthday = birthday;
    }

    //Getters and Setters
    public Long getId() {
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

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Set<Role> getRoles() {
        return roles;
    }
    public void setRoles(Set<Role> roles) {
        this.roles = roles;
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
        User that = (User) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
//    public boolean isAdmin() {
//        if () {return true;}
//        else {return false;}
//    }

//    public void addSavedDrink(Drink drink) {
//        savedDrinks.add(drink);
//    }

//    public void deleteSavedDrink(Drink drink) {
//        savedDrinks.remove(drink);
//    }
}