package com.example.restproject.Service;

import com.example.restproject.Model.Course;
import com.example.restproject.Repository.CourseRepoInterface;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
@Service
public class CourseService implements CourseServiceInterface{
    private CourseRepoInterface repo;

    public CourseService(CourseRepoInterface repo) {
        this.repo = repo;
    }

    @Override
    public Set<Course> findAll() {
        Set <Course> set = new HashSet<>();
        repo.findAll().forEach(set::add);
        return set;
    }

    @Override
    public Course save(Course object) {
        return repo.save(object);
    }

    @Override
    public void delete(Course object) {
        repo.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        repo.deleteById(aLong);
    }

    @Override
    public Optional<Course> findById(Long aLong) {
        return repo.findById(aLong);
    }
}
