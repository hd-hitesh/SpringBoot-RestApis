package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

//	private List<Course> list;

	@Autowired
	private CourseDao courseDao;
	
	public CourseServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Course(145, "Java Core", "This course contains basics of java"));
//		list.add(new Course(146, "Python Core", "This course contains basics of python"));

	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
//		return list;
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {
//		Course c = null;
//		for (Course cc : list) {
//			if (cc.getId() == courseId) {
//				c = cc;
//				break;
//			}
//		}
//		return c;
		return courseDao.getOne(courseId);
//		return courseDao.getById(courseId);
	}

	@Override
	public String addCourse(Course course) {
//		list.add(course);
//		return "Course added successfully.";
		courseDao.save(course);
		return "Course added successfully.";
	}

	@Override
	public void deleteCourse(long courseId) {
//		Course c = null;
//		for (Course cc : list) {
//			if (cc.getId() == courseId) {
//				c = cc;
//				break;
//			}
//		}
//		if (c == null) {
//			list.remove(c);
////			return "Course deleted successfully.";
//		} else {
////			return "Course Not Found.";
//		}
////		list  = this.list.filter(e->e.getId()!= courseId).collect(Collectors.toList());
		courseDao.delete(courseDao.getById(courseId));
	}

	@Override
	public String updateCourse(Course course) {
//		boolean flag = false;
//		for (Course cc : list) {
//			if (cc.getId() == course.getId()) {
//				cc.setDescription(course.getDescription());
//				cc.setTitle(course.getTitle());
//				flag = true;
//				break;
//			}
//		}
//		if (flag)
//			return "Course Updated successfully.";
//		else
//			return "Course not found.";
		
		courseDao.save(course);
		return "Course Updated successfully.";
		
	}

}
