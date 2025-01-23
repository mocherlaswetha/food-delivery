package com.edu.service;

import java.util.List;
import com.edu.dao.User;
import com.edu.error.GlobalExceptionHandling;

public interface UserService {
    User createUser(User user);
    User getUserById(Long id);
    List<User> getAllUsers();
    void deleteUser(Long id);
	String loginUser(String name, String password);
	
	String updateEmailById(Long id, String email);
}
