package com.hyun.apiblog.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class UserDTO {
    private final String username;
    private final String email;
    private final String password;
    private final int experience;
    private final String userId;
    private final int level;

    public UserDTO(String userId, String username, String email, String password, int experience, int level) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.experience = experience;
        this.level = level;
        this.userId = userId;
    }
}