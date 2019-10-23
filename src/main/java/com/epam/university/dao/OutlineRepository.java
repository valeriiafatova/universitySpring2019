package com.epam.university.dao;

import com.epam.university.entity.Outline;
import org.springframework.data.repository.CrudRepository;

public interface OutlineRepository extends CrudRepository<Outline, Long> {
}
