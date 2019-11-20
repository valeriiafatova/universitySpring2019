package com.epam.university.contoller;

import com.epam.university.entity.User;
import com.epam.university.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Optional;

@Controller
@RequestMapping("/login")
public class LoginController {
    @Resource
    private UserService userService;

    @PostMapping
    public String login(HttpServletRequest request) {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        System.out.println("login: " + login + ", password: " + password);

        HttpSession session = request.getSession();

        Optional<User> user = userService.validateUser(login, password);
        if(user.isPresent()){
            session.setAttribute("user", user);
            return "index";
        }
        
        session.setAttribute("error", "Error");
        return "index";
    }
}
