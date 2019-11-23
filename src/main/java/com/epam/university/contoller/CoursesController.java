package com.epam.university.contoller;

import com.epam.university.dao.CourseRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/courses")
public class CoursesController {
    @Resource
    private CourseRepository repository;
    
    @GetMapping
    public String getCoursesPage(Model model){
        model.addAttribute("courses", repository.findAll());
        return "courses";
    }
}
