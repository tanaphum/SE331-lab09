package camt.cbsd.repository;

import camt.cbsd.entity.Course;
import camt.cbsd.entity.Student;
import org.springframework.data.repository.CrudRepository;


public interface CourseRepository extends CrudRepository<Course,Long> {
}
