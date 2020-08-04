package com.neeraj.springbootstarter.Topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 * Using `TopicService.java`, not this one.
 */
@Service
public class TopicServiceWithoutDB {
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring", "Spring framework", "Spring framework descr"),
			new Topic("java", "Core Java", "Core Java descr"),
			new Topic("js", "JavaScript", "JavaScript descr")
			));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	public Topic addTopic(Topic topic) {
		topics.add(topic);
		return topic;
	}

	public Topic updateTopic(String id, Topic topic) {
		for(int i = 0; i < topics.size(); i++) {
			if(topics.get(i).getId().equals(id)) {
				topics.set(i, topic);
				break;
			}
		}
		return topic;
	}

	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
	}

}
