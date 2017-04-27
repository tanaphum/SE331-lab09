package camt.cbsd.dao;

import camt.cbsd.entity.Course;

import java.util.List;


public interface CourseDao {
    Course add(Course course);
    List<Course> list();
}
