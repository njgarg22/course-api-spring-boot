package com.neeraj.springbootstarter.Topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic> getAllTopics(){
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic addTopic(Topic topic) {
		return topicRepository.save(topic);
	}
	
	public Topic getTopic(String id) {
		return topicRepository.findById(id).get();
	}
	
	public Topic updateTopic(String id, Topic topic) {
		return topicRepository.save(topic);
	}
	
	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
	}

}
