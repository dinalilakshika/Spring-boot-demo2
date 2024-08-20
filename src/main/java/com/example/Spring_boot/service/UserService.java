package com.example.Spring_boot.service;

import com.example.Spring_boot.dto.UserDTO;

public interface UserService {
    int saveUser(UserDTO userDTO);
    UserDTO searchUser(String username);
}
