package com.example.restproject.Service;

import com.example.restproject.Model.Course;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;
@Service
public class CourseService implements CourseServiceInterface{
    @Override
    public Set<Course> findAll() {
        return null;
    }

    @Override
    public Course save(Course object) {
        return null;
    }

    @Override
    public void delete(Course object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Optional<Course> findById(Long aLong) {
        return Optional.empty();
    }
}
