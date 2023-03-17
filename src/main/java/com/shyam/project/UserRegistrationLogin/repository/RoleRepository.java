package com.shyam.project.UserRegistrationLogin.repository;

import com.shyam.project.UserRegistrationLogin.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {

    Role findByName(String name);
}
