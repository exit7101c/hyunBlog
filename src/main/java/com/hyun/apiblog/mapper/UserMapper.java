package com.hyun.apiblog.mapper;

import com.hyun.apiblog.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    UserDto getUserById(String userId);
    List<UserDto> getAllUsers();
    void insertUser(UserDto userDTO);
    void updateUser(UserDto userDTO);
    void deleteUser(String userId);

    UserDto getUserLogin(String userId, String password);
}