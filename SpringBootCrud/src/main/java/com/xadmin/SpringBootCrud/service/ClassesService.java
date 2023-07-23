package com.xadmin.SpringBootCrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xadmin.SpringBootCrud.bean.Classes;
import com.xadmin.SpringBootCrud.repository.ClassesRepository;

@Service
public class ClassesService {
	@Autowired
	public ClassesRepository classesRepo;

	public List<Classes> getAllClasses()
	{
		List<Classes> classes = new ArrayList<>();
		classesRepo.findAll().forEach(classes::add);
		return classes;
	}

	public void addClasses(Classes classes) {
		classesRepo.save(classes);
		
	}

	public void updateClasses(String id, Classes classes) {
		classesRepo.save(classes);
		
	}

	public void deleteClasses(String id) {
		classesRepo.deleteById(id);
		
	}
}
