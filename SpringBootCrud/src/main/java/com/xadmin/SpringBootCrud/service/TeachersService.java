package com.xadmin.SpringBootCrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xadmin.SpringBootCrud.bean.Teachers;
import com.xadmin.SpringBootCrud.repository.TeachersRepository;

@Service
public class TeachersService {
	@Autowired
	public TeachersRepository teachersRepo;



	public List<Teachers> getAllTeachers()
	{
		List<Teachers> teachers = new ArrayList<>();
		teachersRepo.findAll().forEach(teachers::add);
		return teachers;
	}

	public void addTeachers(Teachers teachers) {
		teachersRepo.save(teachers);
		
	}

	public void updateTeachers(String id, Teachers teachers) {
		teachersRepo.save(teachers);
		
	}
	
	public void deleteTeachers(String id) {
		teachersRepo.deleteById(id);
		
	}
	
	public List<Teachers> selectTeachersByClass(int classid){
		return teachersRepo.getUserByClass(classid);
	}
	
	public List<Teachers> selectTeachersByName(String name){
		return teachersRepo.selectStudentByName(name);
	}

}



















