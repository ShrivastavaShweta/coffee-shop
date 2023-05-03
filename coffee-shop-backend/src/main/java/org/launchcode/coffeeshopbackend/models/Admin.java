package org.launchcode.coffeeshopbackend.models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("1")
public class Admin extends User {

    //Constructors
    public Admin() {}

}
