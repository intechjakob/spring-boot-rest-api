package edu.sabanciuniv.sucourse.repository;

import edu.sabanciuniv.sucourse.entity.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepo extends CrudRepository<Course, Integer> {
}

