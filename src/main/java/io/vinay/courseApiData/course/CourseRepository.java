package io.vinay.courseApiData.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {

//    public List<Course> findCoursesByTopic(String topicId);

    public List<Course> findByName(String name);

    public List<Course> findByDescription(String desc);

    public List<Course> findByTopicId(String topicId);


}
