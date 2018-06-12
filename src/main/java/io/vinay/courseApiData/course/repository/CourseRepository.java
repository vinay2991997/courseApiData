package io.vinay.courseApiData.course.repository;

import io.vinay.courseApiData.course.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, String> {

//    public List<Course> findCoursesByTopic(String topicId);

    public List<Course> findByName(String name);

    public List<Course> findByDescription(String desc);

    public List<Course> findByTopicId(String topicId);


}
