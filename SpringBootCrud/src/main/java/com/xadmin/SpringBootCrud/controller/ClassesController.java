package com.xadmin.SpringBootCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xadmin.SpringBootCrud.bean.Classes;
import com.xadmin.SpringBootCrud.service.ClassesService;

@RestController
public class ClassesController {
	@Autowired
	private ClassesService classesService;

	@RequestMapping("/classes")
	public List<Classes> getAllClasses()
	{
		return classesService.getAllClasses();
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/classes")
	public void addClasses(@RequestBody Classes classes)
	{
		classesService.addClasses(classes);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/classes/{id}")
	public void updateClasses(@PathVariable String id, @RequestBody Classes classes)
	{
		classesService.updateClasses(id, classes);
	}
	@RequestMapping(method = RequestMethod.DELETE, value="/classes/{id}")
	public void DeleteClasses(@PathVariable String id)
	{
		classesService.deleteClasses(id);
	}
}
