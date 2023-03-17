package com.shyam.project.UserRegistrationLogin.repository;

import com.shyam.project.UserRegistrationLogin.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
