package com.xadmin.SpringBootCrud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.xadmin.SpringBootCrud.bean.TeachersToClass;

public interface TeachersToClassRepository extends JpaRepository<TeachersToClass, String>{
	
	@Query(value="select * from teacherstoclass where teacherid=?1", nativeQuery = true)
	public List<TeachersToClass> getClassOfATeacher(String teacherid);
	
	@Query(value="select * from teacherstoclass where classid=?1", nativeQuery = true)
	public List<TeachersToClass> getTeachersOfAClass(String classid);
	
	@Query(value="select * from teacherstoclass where classid=?1 and teacherid=?2", nativeQuery = true)
	public List<TeachersToClass> selectTeacherByClassAndId(String classid, String Teachersid);
	
}

