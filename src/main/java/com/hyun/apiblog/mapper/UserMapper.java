package com.hyun.apiblog.mapper;

import com.hyun.apiblog.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    UserDTO getUserById(String userId);
    List<UserDTO> getAllUsers();
    void insertUser(UserDTO userDTO);
    void updateUser(UserDTO userDTO);
    void deleteUser(String userId);

    UserDTO getUserLogin(String userId, String password);
}