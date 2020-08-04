package com.neeraj.springbootstarter.Topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = Arrays.asList(
			new Topic("spring", "Spring framework", "Spring framework descr"),
			new Topic("java", "Core Java", "Core Java descr"),
			new Topic("js", "JavaScript", "JavaScript descr")
			);
	
	public List<Topic> getAllTopics(){
		return topics;
	}

}
