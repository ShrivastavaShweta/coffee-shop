package org.launchcode.coffeeshopbackend.models.data;

import org.launchcode.coffeeshopbackend.models.ERole;
import org.launchcode.coffeeshopbackend.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
