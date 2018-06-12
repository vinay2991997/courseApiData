package io.vinay.courseApiData.topic.service;

import io.vinay.courseApiData.topic.model.Topic;
import io.vinay.courseApiData.topic.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics() {

        return topicRepository.findAll();
    }

    public Topic getById(String id) {

        return topicRepository.findById(id).get();

    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }


    public void updateTopic(String id, Topic topic) {

        topicRepository.save(topic);

    }

    public void deleteById(String id) {

        // topics.removeIf(t -> t.getId().equals(id));
        topicRepository.deleteById(id);
    }

}
