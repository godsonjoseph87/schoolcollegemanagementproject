package com.xadmin.SpringBootCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xadmin.SpringBootCrud.bean.Teachers;
import com.xadmin.SpringBootCrud.service.TeachersService;

@RestController
public class TeachersController {
	@Autowired
	private TeachersService teachersService;

	@RequestMapping("/teachers")
	public List<Teachers> getAllTeachers()
	{
		return teachersService.getAllTeachers();
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/teachers")
	public void addSubject(@RequestBody Teachers teachers)
	{
		teachersService.addTeachers(teachers);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/teachers/{id}")
	public void updateTeachers(@PathVariable String id, @RequestBody Teachers teachers)
	{
		teachersService.updateTeachers(id, teachers);
	}
	@RequestMapping(method = RequestMethod.DELETE, value="/teachers/{id}")
	public void DeleteTeachers(@PathVariable String id)
	{
		teachersService.deleteTeachers(id);
	}
	
	
	
	
	
	
	
	
}
