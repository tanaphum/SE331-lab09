package camt.cbsd.dao;

import camt.cbsd.entity.Course;
import camt.cbsd.repository.CourseRepository;
import jersey.repackaged.com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class CourseDaoImpl implements CourseDao {
    CourseRepository courseRepository;
    @Autowired
    public void setCourseRepository(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public Course add(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public List<Course> list() {
        return Lists.newArrayList(courseRepository.findAll());
    }


}
