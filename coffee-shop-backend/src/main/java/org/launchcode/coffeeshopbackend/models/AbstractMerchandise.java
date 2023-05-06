package org.launchcode.coffeeshopbackend.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Objects;

@MappedSuperclass
public abstract class AbstractMerchandise {

    //Fields
    @Id
    @GeneratedValue
    private int id;

    //Getters and Setters
    public int getId() {
        return id;
    }

    //Equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractMerchandise that = (AbstractMerchandise) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}