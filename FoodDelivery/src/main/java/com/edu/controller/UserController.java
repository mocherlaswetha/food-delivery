package com.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.edu.dao.User;
import com.edu.error.GlobalExceptionHandling;
import com.edu.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
    @PostMapping("/login")
    public String loginUser(@RequestBody User request) {
        return userService.loginUser(request.getName(), request.getPassword());
    }
    @PutMapping("/updateEmail/id/{id}/email/{email}")
    public String updateEmailById(@PathVariable Long id,@PathVariable String email){
    	return userService.updateEmailById(id,email);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}

