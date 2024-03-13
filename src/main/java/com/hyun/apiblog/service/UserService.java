package com.hyun.apiblog.service;

import com.hyun.apiblog.dto.UserDTO;
import com.hyun.apiblog.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserMapper userMapper;

    @Autowired
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public UserDTO getUserById(String userId) {
        return userMapper.getUserById(userId);
    }

    public List<UserDTO> getAllUsers() {
        return userMapper.getAllUsers();
    }

    public void insertUser(UserDTO userDTO) {
        userMapper.insertUser(userDTO);
    }

    public void updateUser(UserDTO userDTO) {
        userMapper.updateUser(userDTO);
    }

    public void deleteUser(String userId) {
        userMapper.deleteUser(userId);
    }

    public UserDTO getUserLogin(String userId, String password) {
        return userMapper.getUserLogin(userId, password);
    }
}