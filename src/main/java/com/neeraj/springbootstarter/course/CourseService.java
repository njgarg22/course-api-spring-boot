package com.neeraj.springbootstarter.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourses(String topicId){
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(courses::add);
		return courses;
	}
	
	public Course addCourse(Course course) {
		return courseRepository.save(course);
	}
	
	public Course getCourse(String id) {
		return courseRepository.findById(id).get();
	}
	
	public Course updateCourse(Course course) {
		return courseRepository.save(course);
	}
	
	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}

}
