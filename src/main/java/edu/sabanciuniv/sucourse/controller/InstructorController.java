// InstructorController.java
package edu.sabanciuniv.sucourse.controller;

import edu.sabanciuniv.sucourse.entity.Instructor;
import edu.sabanciuniv.sucourse.services.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/instructors")
public class InstructorController {

    @Autowired
    private InstructorService instructorService;

    @PostMapping("/add")
    public String addInstructor(@RequestBody Instructor instructor) {
        instructorService.addInstructor(instructor);
        return "Instructor added successfully";
    }

    @PutMapping("/update/{insId}")
    public void updateInstructor(@PathVariable("insId") int insId, @RequestBody Instructor instructor) {
        instructorService.updateInstructor(insId, instructor);
    }

    @DeleteMapping("/delete/{insId}")
    public String deleteInstructor(@PathVariable("insId") int insId) {
        instructorService.deleteInstructor(insId);
        return "Instructor deleted successfully";
    }

    @GetMapping("/all")
    public Iterable<Instructor> getAllInstructors() {
        return instructorService.getAllInstructors();
    }

    @GetMapping("/details/{insId}")
    public Instructor getInstructorById(@PathVariable("insId") int insId) {
        return instructorService.getInstructorById(insId);
    }
}