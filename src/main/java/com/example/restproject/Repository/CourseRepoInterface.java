package com.example.restproject.Repository;

import com.example.restproject.Model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepoInterface extends CrudRepository<Course, Long> {
}
