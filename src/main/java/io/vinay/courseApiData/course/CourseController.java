package io.vinay.courseApiData.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/topics/{topicId}/courses")
    public List<Course> getAllCourses(@PathVariable String topicId) {
        return courseService.getAllCourses(topicId);
    }

    @RequestMapping("/topics/{topicId}/courses/{id}")
    public Course getById(@PathVariable String topicId, @PathVariable String id) {
        return courseService.getById(topicId, id);
        //return courseService.getById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses")
    public void addCourses(@PathVariable String topicId, @RequestBody Course course) {

        courseService.addCourses(topicId, course);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/courses/{id}")
    public void updateCourses(@PathVariable String topicId, @PathVariable String id, @RequestBody Course course) {
        courseService.updateCourses(topicId, id, course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicId}/courses/{id}")
    public void deleteCourses(@PathVariable String id) {
        courseService.deleteById(id);
    }
}
