package com.epam.university.dao;

import com.epam.university.entity.Lecturer;
import org.springframework.data.repository.CrudRepository;

public interface LecturerRepository extends CrudRepository<Lecturer, Long> {
}
