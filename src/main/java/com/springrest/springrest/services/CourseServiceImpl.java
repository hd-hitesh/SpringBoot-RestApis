package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	private List<Course> list;
	
	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(145,"Java Core", "This course contains basics of java"));
		list.add(new Course(146,"Python Core", "This course contains basics of python"));
		
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		Course c=null;
		for(Course cc :	list) {
			if(cc.getId()==courseId) {
				c=cc;
				break;
			}
		}
		return c;
	}

	@Override
	public String addCourse(Course course) {
		list.add(course);
		return "Course added successfully.";
	}

	@Override
	public String deleteCourse(long courseId) {
		Course c=null;
		for(Course cc :	list) {
			if(cc.getId()==courseId) {
				c=cc;
				break;
			}
		}
		list.remove(c);
		return "Course deleted successfully.";
	}

	@Override
	public String updateCourse(Course course) {
		for(Course cc :	list) {
			if(cc.getId()==course.getId()) {
				cc.setDescription(course.getDescription());
				cc.setTitle(course.getTitle());
				break;
			}
		}
		return "Course Updated successfully.";
	}
	
	

}
