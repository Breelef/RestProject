package com.example.restproject.Controller;

import com.example.restproject.Model.Course;
import com.example.restproject.Model.Customer;
import com.example.restproject.Service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    private CourseService courseService;

    public CourseController (CourseService courseService){
        this.courseService = courseService;
    }

    @PostMapping("/addCourse")
    public ResponseEntity<Course> addCustomer(@RequestBody Course course){
        courseService.save(course);
        return new ResponseEntity<>(course, HttpStatus.OK);
    }
}
