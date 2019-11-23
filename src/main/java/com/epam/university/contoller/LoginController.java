package com.epam.university.contoller;

import com.epam.university.data.AjaxResponse;
import com.epam.university.entity.User;
import com.epam.university.form.LoginForm;
import com.epam.university.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Optional;

@Controller
@RequestMapping("/login")
public class LoginController {
    private static final Logger LOG = LoggerFactory.getLogger(LoginController.class);
    @Resource
    private UserService userService;
    
    @GetMapping
    public String getLoginPage(Model model){
        model.addAttribute("command", new LoginForm());
        return "login";
    }
}
