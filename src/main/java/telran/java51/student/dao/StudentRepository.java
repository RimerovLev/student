package telran.java51.student.dao;

import java.util.Collection;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import telran.java51.student.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{
	
}
