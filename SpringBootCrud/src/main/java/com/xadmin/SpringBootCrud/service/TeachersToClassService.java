package com.xadmin.SpringBootCrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xadmin.SpringBootCrud.bean.Student;
import com.xadmin.SpringBootCrud.bean.TeachersToClass;
import com.xadmin.SpringBootCrud.repository.TeachersToClassRepository;

@Service
public class TeachersToClassService {
	@Autowired
	public TeachersToClassRepository TeachersToClassRepo;



	public List<TeachersToClass> getAllTeachersToClass()
	{
		List<TeachersToClass> teacherstoclass = new ArrayList<>();
		TeachersToClassRepo.findAll().forEach(teacherstoclass::add);
		return teacherstoclass;
	}

	public String addTeachersToClass(TeachersToClass teacherstoclass) {
		String newclassid = teacherstoclass.getClassid();
		String newteacherid = teacherstoclass.getTeacherid();
		List<TeachersToClass> teachersToClassExisting = TeachersToClassRepo.selectTeacherByClassAndId(newclassid, newteacherid);
		for (TeachersToClass eachteachertoclass : teachersToClassExisting) {
        	String classid = eachteachertoclass.getClassid();
        	String teacherid = eachteachertoclass.getTeacherid();
            if(classid.equals(newclassid) && teacherid.equals(newteacherid)) {
            	return "Teacher Already belongs to class " + classid + " for same Subject";
            }
        }
		TeachersToClassRepo.save(teacherstoclass);
		return "Teacher Added To Class";
	}

	
	public void deleteTeacherOfAClass(String id) {
		TeachersToClassRepo.deleteById(id);
		
	}
	
	public List<TeachersToClass> getTeachersOfAClass(String classid){
		return TeachersToClassRepo.getTeachersOfAClass(classid);
	}
	
	public List<TeachersToClass> getClassOfATeacher(String teacherid){
		return TeachersToClassRepo.getClassOfATeacher(teacherid);
	}

}



















