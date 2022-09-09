package com.example.restproject.Controller;

import com.example.restproject.Model.Course;
import com.example.restproject.Model.Customer;
import com.example.restproject.Service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.Set;

@RestController
public class CourseController {
    private CourseService courseService;

    public CourseController (CourseService courseService){
        this.courseService = courseService;
    }

    @PostMapping("/addCourse")
    public ResponseEntity<Course> addCourse(@RequestBody Course course){
        courseService.save(course);
        return new ResponseEntity<>(course, HttpStatus.OK);
    }
    @GetMapping("/showCourses")
    public ResponseEntity<Set<Course>> showCourses(){
        return new ResponseEntity<>(courseService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/findCourseById")
    public ResponseEntity<Optional<Course>> findbyId(Long id){
        return new ResponseEntity<>(courseService.findById(id), HttpStatus.OK);
    }
    @PutMapping("/updateCourse")
    public ResponseEntity<String> updateCustomer(@RequestBody Course course){
        if(courseService.findById(course.getId()).isPresent()) {
            courseService.save(course);
            return new ResponseEntity<>("Course updated to DB", HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
