package edu.sabanciuniv.sucourse.repository;
import edu.sabanciuniv.sucourse.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student, Integer> {
}
