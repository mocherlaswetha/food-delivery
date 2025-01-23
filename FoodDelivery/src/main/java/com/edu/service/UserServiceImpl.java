package com.edu.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.dao.User;
import com.edu.error.GlobalExceptionHandling;
import com.edu.repository.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

	@Override
	public String loginUser(String name, String password) {
		 User user = userRepository.findByNameAndPassword(name,password);
	        if (user != null) {
	            System.out.println("Login successful for user: " + name);
	            return "Login successful!";
	        } else {
	            System.out.println("Invalid username or password for user: " + name);
	            return "Invalid username or password.";
	        }
		
	}
	@Override
	 @Transactional
	    public String updateEmailById(Long id, String email){
	        int updatedRows = userRepository.updateEmailById(id, email);
	        if (updatedRows == 0) {
	        return  "User not found or email not updated";
	        }	
	        else {
	        	return "updated";
	        }
			
	    }

	
}
