package org.launchcode.coffeeshopbackend.models.data;

import org.launchcode.coffeeshopbackend.models.Drink;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinkRepository extends CrudRepository<Drink, Integer> {
}
