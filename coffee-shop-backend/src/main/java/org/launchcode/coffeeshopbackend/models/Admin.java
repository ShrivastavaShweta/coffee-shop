package org.launchcode.coffeeshopbackend.models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class Admin extends AbstractUser{
}
