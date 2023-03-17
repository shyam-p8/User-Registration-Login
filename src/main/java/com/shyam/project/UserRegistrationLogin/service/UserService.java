package com.shyam.project.UserRegistrationLogin.service;

import com.shyam.project.UserRegistrationLogin.dto.UserDto;
import com.shyam.project.UserRegistrationLogin.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
