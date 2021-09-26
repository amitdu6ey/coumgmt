package com.amitdu6ey.coumgmt.service;

import com.amitdu6ey.coumgmt.domain.Topic;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = Arrays.asList(
            new Topic("java-id", "java-name", "java-desc"),
            new Topic("cpp-id", "cpp-name", "cpp-desc"),
            new Topic("c-id", "c-name", "c-desc")
    );

    public List<Topic> getAllTopics(){
        return topics;
    }

    public Topic getTopic(String topicName){
        return topics.stream().filter(t -> t.getId().equals(topicName)).findFirst().get();
    }
}
