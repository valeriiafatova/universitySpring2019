package com.epam.university.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "course")
public class Course extends BaseEntity {
    
    private String title;
    private String description;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "course_lecturer", 
            joinColumns = @JoinColumn(name = "course_id"), 
            inverseJoinColumns = @JoinColumn(name = "lecturer_id"))
    private Set<Lecturer> lecturers;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "course_student",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id"))
    private Set<Student> students;

    public Course() {
    }

    public Course(Long id, String title, String description) {
        super(id);
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Course course = (Course) o;
        return title.equals(course.title) && description.equals(course.description) &&
                Objects.equals(lecturers, course.lecturers) && Objects.equals(students, course.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), title, description);
    }

    @Override
    public String toString() {
        return "Course{" + "title='" + title + '\'' + ", description='" + description + '\'' + ", lecturers=" +
                lecturers + ", students=" + students + "} " + super.toString();
    }
}
