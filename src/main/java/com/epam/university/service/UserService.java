package com.epam.university.service;

import com.epam.university.dao.UserRepository;
import com.epam.university.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class UserService {
    @Resource
    private UserRepository userRepository;
    
    public Optional<User> validateUser(String login, String password){
        User user = userRepository.findByLogin(login);
        return user != null && user.getPassword().equals(password) 
                ? Optional.of(user) : Optional.empty();
    }
}
