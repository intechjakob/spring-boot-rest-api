// StudentService.java
package edu.sabanciuniv.sucourse.services;

import edu.sabanciuniv.sucourse.entity.Student;
import edu.sabanciuniv.sucourse.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepository;

    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public void updateStudent(int studId, Student student) {
        Optional<Student> studentOptional = studentRepository.findById(studId);
        if (studentOptional.isPresent()) {
            Student studentToUpdate = studentOptional.get();
            studentToUpdate.setStudName(student.getStudName());
            studentToUpdate.setStudDepartment(student.getStudDepartment());
            studentToUpdate.setStudEmail(student.getStudEmail());
            studentToUpdate.setCourses(student.getCourses());
            studentRepository.save(studentToUpdate);
        }
    }

    public void deleteStudent(int studId) {
        studentRepository.deleteById(studId);
    }

    public List<Student> getAllStudents() {
        return (List<Student>) studentRepository.findAll();
    }

    public Student getStudentById(int studId) {
        return studentRepository.findById(studId).get();
    }
}