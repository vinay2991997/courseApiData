package io.vinay.courseApiData.course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, String> {

//    public List<Course> findCoursesByTopic(String topicId);

    public List<Course> findByName(String name);

    public List<Course> findByDescription(String desc);

    public List<Course> findByTopicId(String topicId);


}
