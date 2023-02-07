package com.in28minutes.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	@RequestMapping("/courses")
	public List<Course> retrieveaAllCourses(){
		return Arrays.asList(
				new Course(1, "SpringBoot", "Paul"),
				new Course(1, "AWS","Rox"),
				new Course(1, "Docker","Rox"));
		
	}

}
