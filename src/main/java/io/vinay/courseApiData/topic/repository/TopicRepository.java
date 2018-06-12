package io.vinay.courseApiData.topic.repository;

import io.vinay.courseApiData.topic.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, String> {

}
