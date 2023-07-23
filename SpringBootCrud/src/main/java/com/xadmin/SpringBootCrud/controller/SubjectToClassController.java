package com.xadmin.SpringBootCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xadmin.SpringBootCrud.bean.SubjectToClass;
import com.xadmin.SpringBootCrud.service.SubjectToClassService;

@RestController
public class SubjectToClassController {
	@Autowired
	private SubjectToClassService subjectToClassService;

	@RequestMapping("/classSubjects")
	public List<SubjectToClass> getAllSubjectsToClass()
	{
		return subjectToClassService.getAllSubjectsToClass();
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/subjectsToClass")
	public String addSubject(@RequestBody SubjectToClass subjecttoclass)
	{
		return subjectToClassService.addSubjectToClass(subjecttoclass);
	}
	
	@RequestMapping(value="/subjectsForClass/{id}")
	public List<SubjectToClass> getSubjectsOfAClass(@PathVariable String id)
	{
		return subjectToClassService.getSubjectOfAClass(id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/SubjectOfAClass/{id}")
	public void DeleteSubjectOfAClass(@PathVariable String id)
	{
		subjectToClassService.deleteSubjectOfAClass(id);
	}
	
	
	
	
	
	
	
	
}
