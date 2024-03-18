package com.hyun.apiblog.controller;

import com.hyun.apiblog.dto.LoginRequest;
import com.hyun.apiblog.dto.UserDto;
import com.hyun.apiblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
    public UserDto getUserById(@PathVariable String userId) {
        return userService.getUserById(userId);
    }

    @PostMapping("/login")
    public HttpSession getUserLogin(@RequestBody LoginRequest loginRequest, HttpServletRequest request) {
        String userId = loginRequest.getUserId();
        String password = loginRequest.getPassword();

        UserDto user = userService.getUserLogin(userId, password);
        System.out.println(user);
        if (user != null) {
            HttpSession session = request.getSession(); // 로그인이 성공한 경우에만 세션 생성
            session.setAttribute("user", user);
            session.setMaxInactiveInterval(60 * 30);
            System.out.println(session);
            return session;
        } else {
            return null;
        }
    }

    @GetMapping
    public List<UserDto> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public void insertUser(@RequestBody UserDto userDTO) {
        userService.insertUser(userDTO);
    }

    @PutMapping
    public void updateUser(@RequestBody UserDto userDTO) {
        userService.updateUser(userDTO);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable String userId) {
        userService.deleteUser(userId);
    }
}