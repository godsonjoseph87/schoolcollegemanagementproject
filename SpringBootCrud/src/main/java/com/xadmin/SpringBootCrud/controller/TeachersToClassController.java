package com.xadmin.SpringBootCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xadmin.SpringBootCrud.bean.TeachersToClass;
import com.xadmin.SpringBootCrud.service.TeachersToClassService;

@RestController
public class TeachersToClassController {
	@Autowired
	private TeachersToClassService teachersToClassService;

	@RequestMapping("/teacherstoclass")
	public List<TeachersToClass> getAllTeachersToClass()
	{
		return teachersToClassService.getAllTeachersToClass();
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/teacherstoclass")
	public String addTeachersToClass(@RequestBody TeachersToClass teacherstoclass)
	{
		return teachersToClassService.addTeachersToClass(teacherstoclass);
	}
	
	@RequestMapping(value="/teachersForClass/{id}")
	public List<TeachersToClass> getTeachersOfAClass(@PathVariable String id)
	{
		return teachersToClassService.getTeachersOfAClass(id);
	}
	
	@RequestMapping(value="/classesOfATeacher/{id}")
	public List<TeachersToClass> getClassOfATeacher(@PathVariable String id)
	{
		return teachersToClassService.getClassOfATeacher(id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/TeacherOfAClass/{id}")
	public void deleteTeacherOfAClass(@PathVariable String id)
	{
		teachersToClassService.deleteTeacherOfAClass(id);
	}
	
	
	
	
	
	
	
	
}
