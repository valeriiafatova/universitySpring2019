package com.epam.university.contoller;

import com.epam.university.entity.User;
import com.epam.university.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Optional;

@Controller
@RequestMapping("/login")
public class LoginController {
    private static final Logger LOG = LoggerFactory.getLogger(LoginController.class);
    @Resource
    private UserService userService;

    @PostMapping
    public String login(@RequestParam(name = "login") String login, 
                        @RequestParam String password,
                        HttpSession session) {
        LOG.info("Try to login : {}, password : {} ", login, password);

        Optional<User> user = userService.validateUser(login, password);
        if(user.isPresent()){
            session.setAttribute("user", user);
            return "redirect:/";
        }
        
        session.setAttribute("error", "Error");
        return "index";
    }
}
