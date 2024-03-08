// CourseService.java
package edu.sabanciuniv.sucourse.services;

import edu.sabanciuniv.sucourse.entity.Course;
import edu.sabanciuniv.sucourse.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepo courseRepository;

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(int courseId, Course course) {
        Optional<Course> courseOptional = courseRepository.findById(courseId);
        if (courseOptional.isPresent()) {
            Course courseToUpdate = courseOptional.get();
            courseToUpdate.setCourseName(course.getCourseName());
            courseToUpdate.setCourseDescription(course.getCourseDescription());
            courseToUpdate.setStudents(course.getStudents());
            courseToUpdate.setInstructor(course.getInstructor());
            courseRepository.save(courseToUpdate);
        }
    }

    public void deleteCourse(int courseId) {
        courseRepository.deleteById(courseId);
    }

    public List<Course> getAllCourses() {
        return (List<Course>) courseRepository.findAll();
    }

    public Course getCourseDetailsById(int courseId) {
        return courseRepository.findById(courseId).get();
    }
}