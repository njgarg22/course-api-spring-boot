package com.neeraj.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String>{
	
	/**
	 * You don't have to implement the method.
	 * Just declare the method with the `findByProperty` name format.
	 * Spring Data JPA will implement the method for you!
	 */
	public List<Course> findByName(String name);
	
	public List<Course> findByTopicId(String topicId);
}
