package com.xadmin.SpringBootCrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xadmin.SpringBootCrud.bean.SubjectToClass;
import com.xadmin.SpringBootCrud.bean.TeachersToClass;
import com.xadmin.SpringBootCrud.repository.SubjectToClassRepository;

@Service
public class SubjectToClassService {
	@Autowired
	public SubjectToClassRepository subjectToClassRepo;



	public List<SubjectToClass> getAllSubjectsToClass()
	{
		List<SubjectToClass> subjecttoclass = new ArrayList<>();
		subjectToClassRepo.findAll().forEach(subjecttoclass::add);
		return subjecttoclass;
	}

	public String addSubjectToClass(SubjectToClass subjecttoclass) {
		
		String newclassid = subjecttoclass.getClassid();
		String newsubjectid = subjecttoclass.getSubjectid();
		List<SubjectToClass> subjectsToClassExisting = subjectToClassRepo.selectSubjectByClassAndId(newclassid, newsubjectid);
		for (SubjectToClass eachsubjecttoclass : subjectsToClassExisting) {
        	String classid = eachsubjecttoclass.getClassid();
        	String subjectid = eachsubjecttoclass.getSubjectid();
            if(classid.equals(newclassid) && subjectid.equals(newsubjectid)) {
            	return "This Subject is Already assigned to class " + classid;
            }
        }
		
		subjectToClassRepo.save(subjecttoclass);
		return "Subject added to class";
	}

	
	public void deleteSubjectOfAClass(String id) {
		subjectToClassRepo.deleteById(id);
		
	}
	
	public List<SubjectToClass> getSubjectOfAClass(String classid){
		return subjectToClassRepo.getSubjectOfAClass(classid);
	}

}



















