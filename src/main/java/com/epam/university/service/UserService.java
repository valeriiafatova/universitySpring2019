package com.epam.university.service;

import com.epam.university.dao.UserRepository;
import com.epam.university.entity.User;
import com.epam.university.enums.Role;
import com.epam.university.form.RegistrationForm;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class UserService {
    @Resource
    private UserRepository userRepository;
    @Resource 
    private PasswordEncoder passwordEncoder;
    
    public Optional<User> validateUser(String login, String password){
        User user = userRepository.findByLogin(login);
        return user != null && user.getPassword().equals(password) 
                ? Optional.of(user) : Optional.empty();
    }
    
    public User registerUser(RegistrationForm form, Role role){
        if (loginExist(form.getLogin())){
            return null;
        }

        String password = passwordEncoder.encode(form.getPassword());
        
        User user = new User(form.getLogin(), password, form.getFirst_name(), form.getLast_name(), role);
        
        return userRepository.save(user);
    }
    
    private boolean loginExist(String login){
        return userRepository.findByLogin(login) != null;
    }
}
