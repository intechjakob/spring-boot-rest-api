package edu.sabanciuniv.sucourse.repository;
import edu.sabanciuniv.sucourse.entity.Instructor;
import org.springframework.data.repository.CrudRepository;

public interface InstructorRepo extends CrudRepository<Instructor, Integer> {
}
