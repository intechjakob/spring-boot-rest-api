// StudentController.java
package edu.sabanciuniv.sucourse.controller;

import edu.sabanciuniv.sucourse.entity.Student;
import edu.sabanciuniv.sucourse.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
        return "Student added successfully";
    }

    @PutMapping("/update/{studId}")
    public void updateStudent(@PathVariable("studId") int studId, @RequestBody Student student) {
        studentService.updateStudent(studId, student);
    }

    @DeleteMapping("/delete/{studId}")
    public String deleteStudent(@PathVariable("studId") int studId) {
        studentService.deleteStudent(studId);
        return "Student deleted successfully";
    }

    @GetMapping("/all")
    public Iterable<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/details/{studId}")
    public Student getStudentById(@PathVariable("studId") int studId) {
        return studentService.getStudentById(studId);
    }
}