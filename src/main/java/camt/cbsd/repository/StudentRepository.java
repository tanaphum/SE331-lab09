package camt.cbsd.repository;

import camt.cbsd.entity.Student;
import org.springframework.data.repository.CrudRepository;


public interface StudentRepository extends CrudRepository <Student,Long> {
    Student findById(Long id);
}
