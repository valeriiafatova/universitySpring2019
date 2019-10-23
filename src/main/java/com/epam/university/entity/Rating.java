package com.epam.university.entity;

import com.epam.university.enums.Ratings;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class Rating extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private Student student;
    @ManyToOne
    @JoinColumn(name = "course_id", referencedColumnName = "id")
    private Course course;
    @Column(name = "date", columnDefinition = "DATE")
    private LocalDate date;
    @Enumerated(value = EnumType.STRING)
    private Ratings rating;

    public Rating() {
    }

    public Rating(Student student, Course course, LocalDate date, Ratings rating) {
        this.student = student;
        this.course = course;
        this.date = date;
        this.rating = rating;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course subject) {
        this.course = subject;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Ratings getRating() {
        return rating;
    }

    public void setRating(Ratings rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Rating{" + "student=" + student + ", subject=" + course + ", date=" + date + ", rating=" + rating +
                "} " + super.toString();
    }
}
