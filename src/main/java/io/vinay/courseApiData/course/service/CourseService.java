package io.vinay.courseApiData.course.service;

import io.vinay.courseApiData.course.model.Course;
import io.vinay.courseApiData.course.repository.CourseRepository;
import io.vinay.courseApiData.topic.model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(String topicId) {
        return courseRepository.findByTopicId(topicId);
    }

    public Course getById(String topicId, String id) {

        return courseRepository.
                findByTopicId(topicId).
                stream().
                filter(c -> c.getId().equals(id)).
                findFirst().get();
        //return courseRepository.findById(id).get();

    }

    public void addCourses(String topicId, Course course) {
        course.setTopic(new Topic(topicId, "", ""));
        courseRepository.save(course);
    }


    public void updateCourses(String topicId, String id, Course course) {

        course.setTopic(new Topic(topicId, "", ""));
        courseRepository.save(course);

    }

    public void deleteById(String id) {

        // courses.removeIf(t -> t.getId().equals(id));
        courseRepository.deleteById(id);
    }

}
