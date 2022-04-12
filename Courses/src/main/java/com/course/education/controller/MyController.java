package com.course.education.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.course.education.model.ListOfCategory;
import com.course.education.model.ListOfCourse;
import com.course.education.service.CourseService;


/**
 * 
 * @author 33000014
 *
 */

@RestController
@RequestMapping("/api/v1/education")
@CrossOrigin(origins = "*")
public class MyController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/courses")
	public List<ListOfCourse> getAllCourse() {
		return courseService.getAllCourse();
	}
	
	@GetMapping("/courses/{id}")
	public ListOfCourse getCourse(@PathVariable int id)
	{
		return courseService.getCourse(id);
	}
	
	@PostMapping("/getCourseByLevel")
	public List<ListOfCourse> getCourseByLevel(@RequestParam String level)
	{
		System.out.println(level);
		return courseService.getCourseByLevel(level);
	}
	
	
	@PostMapping("/getCourseByPrice")
	public List<ListOfCourse> getCoursesByPrice(@RequestParam double price)
	{
		
		return courseService.getCourseByPrice(price);
	}
	
	
	@GetMapping("/getCategory")
	public ListOfCategory getAllCategpry()
	{
		return courseService.getAllcategory();
	}
	
	
}
