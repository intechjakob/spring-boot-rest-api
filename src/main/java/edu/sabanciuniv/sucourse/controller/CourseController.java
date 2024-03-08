// CourseController.java
package edu.sabanciuniv.sucourse.controller;

import edu.sabanciuniv.sucourse.entity.Course;
import edu.sabanciuniv.sucourse.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/add")
    public String addCourse(@RequestBody Course course) {
        courseService.addCourse(course);
        return "Course added successfully";
    }

    @PutMapping("/update/{courseId}")
    public void updateCourse(@PathVariable("courseId") int courseId, @RequestBody Course course) {
        courseService.updateCourse(courseId, course);
    }

    @DeleteMapping("/delete/{courseId}")
    public String deleteCourse(@PathVariable("courseId") int courseId) {
        courseService.deleteCourse(courseId);
        return "Course deleted successfully";
    }

    @GetMapping("/all")
    public Iterable<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("/details/{courseId}")
    public Course getCourseDetailsById(@PathVariable("courseId") int courseId) {
        return courseService.getCourseDetailsById(courseId);
    }
}