package com.epam.university.entity;

import com.epam.university.enums.Role;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class Student extends User {
    
    @ManyToMany
    private Set<Course> courses;

    public Student(long id, String login, String password, Role role, Set<Course> courses) {
        super(id, login, password, role);
        this.courses = courses;
    }

    public Student() {
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
}
