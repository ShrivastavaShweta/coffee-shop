package org.launchcode.coffeeshopbackend.models.data;

import org.launchcode.coffeeshopbackend.models.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends CrudRepository<Admin, Integer> {
    Admin findByEmail(String email);
}
