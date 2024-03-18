package com.hyun.apiblog.service;

import com.hyun.apiblog.dto.UserDto;
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

    public UserDto getUserById(String userId) {
        return userMapper.getUserById(userId);
    }

    public List<UserDto> getAllUsers() {
        return userMapper.getAllUsers();
    }

    public void insertUser(UserDto userDTO) {
        userMapper.insertUser(userDTO);
    }

    public void updateUser(UserDto userDTO) {
        userMapper.updateUser(userDTO);
    }

    public void deleteUser(String userId) {
        userMapper.deleteUser(userId);
    }

    public UserDto getUserLogin(String userId, String password) {
        return userMapper.getUserLogin(userId, password);
    }
}