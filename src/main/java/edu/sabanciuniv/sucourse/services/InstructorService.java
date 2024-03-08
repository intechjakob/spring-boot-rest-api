// InstructorService.java
package edu.sabanciuniv.sucourse.services;

import edu.sabanciuniv.sucourse.entity.Instructor;
import edu.sabanciuniv.sucourse.repository.InstructorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InstructorService {

    @Autowired
    private InstructorRepo instructorRepository;

    public void addInstructor(Instructor instructor) {
        instructorRepository.save(instructor);
    }

    public void updateInstructor(int insId, Instructor instructor) {
        Optional<Instructor> instructorOptional = instructorRepository.findById(insId);
        if (instructorOptional.isPresent()) {
            Instructor instructorToUpdate = instructorOptional.get();
            instructorToUpdate.setInsName(instructor.getInsName());
            instructorToUpdate.setInsTitle(instructor.getInsTitle());
            instructorToUpdate.setInsDepartment(instructor.getInsDepartment());
            instructorToUpdate.setInsEmail(instructor.getInsEmail());
            instructorToUpdate.setCourses(instructor.getCourses());
            instructorRepository.save(instructorToUpdate);
        }
    }

    public void deleteInstructor(int insId) {
        instructorRepository.deleteById(insId);
    }

    public List<Instructor> getAllInstructors() {
        return (List<Instructor>) instructorRepository.findAll();
    }

    public Instructor getInstructorById(int insId) {
        return instructorRepository.findById(insId).get();
    }
}