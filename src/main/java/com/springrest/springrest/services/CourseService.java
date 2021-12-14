package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Course;

public interface CourseService {

	public List<Course> getCourses();
	
	public Course getCourse(long courseId);

	public String addCourse(Course course);
	
	public void deleteCourse(long courseId);

	public String updateCourse(Course course);
	
}
