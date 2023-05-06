package org.launchcode.coffeeshopbackend.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Drink extends AbstractMerchandise {

    // TODO: Add members

    //added dummy code to help build the application. Can be deleted.
    @Id
     private int id;

    @NotNull
    private String name;

    public Drink() {
    }

    public Drink(String name) {
        this.name = name;
    }
}
