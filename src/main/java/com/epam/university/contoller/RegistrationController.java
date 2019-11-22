package com.epam.university.contoller;

import com.epam.university.entity.User;
import com.epam.university.enums.Role;
import com.epam.university.form.RegistrationForm;
import com.epam.university.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.validation.Valid;

@Controller
@RequestMapping(value = "/registration")
public class RegistrationController {
    private static final Logger LOG = LoggerFactory.getLogger(RegistrationController.class);
    @Resource
    private UserService userService;
    @Resource(name = "registrationValidator")
    private Validator validator;
    
    @InitBinder
    private void initBinder(WebDataBinder binder){
        binder.setValidator(validator);
    }
    
    @GetMapping
    public String getRegistrationPage(Model model){
        model.addAttribute("registrationForm", new RegistrationForm());
        return "registration";
    }
    
    @PostMapping
    public String registerUser(@Valid @ModelAttribute RegistrationForm registrationForm, BindingResult error, Model model){
        LOG.info("Form {}", registrationForm);
        if(error.hasErrors()){
            return "registration";
        }
        User user = userService.registerUser(registrationForm, Role.STUDENT);
        if(user == null){
            error.rejectValue("login", "registration.login.exist");
            return "registration";
        }
        return "redirect:/";
    }
}
