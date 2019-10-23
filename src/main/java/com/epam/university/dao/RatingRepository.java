package com.epam.university.dao;

import com.epam.university.entity.Rating;
import org.springframework.data.repository.CrudRepository;

public interface RatingRepository extends CrudRepository<Rating, Long> {
}
