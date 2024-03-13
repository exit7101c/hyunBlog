package com.hyun.apiblog.controller;

import com.hyun.apiblog.dto.LoginRequest;
import com.hyun.apiblog.dto.UserDTO;
import com.hyun.apiblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("hb")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{userId}")
    public UserDTO getUserById(@PathVariable String userId) {
        return userService.getUserById(userId);
    }

    @PostMapping("/login")
    public UserDTO getUserLogin(@RequestBody LoginRequest loginRequest) {
        String userId = loginRequest.getUserId();
        String password = loginRequest.getPassword();

//        UserDTO loggedInUser = userService.getUserLogin(userId, password);
//        if (loggedInUser != null) {
//            // 로그인 성공 시 JWT 토큰 생성
//            String token = generateJWTToken(userId); // 토큰 생성 메서드 호출
//
//            // 토큰과 사용자 정보를 함께 반환
//            Map<String, Object> response = new HashMap<>();
//            response.put("token", token);
//            response.put("user", loggedInUser);
//
//            return ResponseEntity.ok(response);
//        } else {
//            // 로그인 실패 시 적절한 응답을 반환합니다. (예: 401 Unauthorized)
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
//        }


        return userService.getUserLogin(userId, password);
    }

    @GetMapping
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public void insertUser(@RequestBody UserDTO userDTO) {
        userService.insertUser(userDTO);
    }

    @PutMapping
    public void updateUser(@RequestBody UserDTO userDTO) {
        userService.updateUser(userDTO);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable String userId) {
        userService.deleteUser(userId);
    }
}