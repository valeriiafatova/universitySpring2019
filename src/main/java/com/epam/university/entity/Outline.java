package com.epam.university.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.util.Objects;

@Entity
public class Outline extends BaseEntity {

    @Column(name = "title")
    private String title;
    @ManyToOne
    private Course course;

    public Outline() {
    }

    public Outline(Long id, String title) {
        super(id);
        this.title = title;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        Outline outline = (Outline) o;
        return Objects.equals(title, outline.title) && Objects.equals(course, outline.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), title, course);
    }

    @Override
    public String toString() {
        return "Outline{" + "title='" + title + '\'' + ", course=" + course + "} " + super.toString();
    }
}
