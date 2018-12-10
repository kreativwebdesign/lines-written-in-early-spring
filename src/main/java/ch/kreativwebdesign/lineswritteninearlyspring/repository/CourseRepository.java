package ch.kreativwebdesign.lineswritteninearlyspring.repository;

import ch.kreativwebdesign.lineswritteninearlyspring.model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long> {
}
