package com.neeraj.springbootstarter.Topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getTopics(){
		return Arrays.asList(
				new Topic("spring", "Spring framework", "Spring framework descr"),
				new Topic("java", "Core Java", "Core Java descr"),
				new Topic("js", "Javascript", "Javascript descr")
				);
	}
}
