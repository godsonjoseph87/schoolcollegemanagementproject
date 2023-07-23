package com.xadmin.SpringBootCrud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.xadmin.SpringBootCrud.bean.SubjectToClass;

public interface SubjectToClassRepository extends JpaRepository<SubjectToClass, String>{
	
	@Query(value="select * from subjectstoclass where classid=?1", nativeQuery = true)
	public List<SubjectToClass> getSubjectOfAClass(String classid);
	
	@Query(value="select * from subjectstoclass where classid=?1 and subjectid=?2", nativeQuery = true)
	public List<SubjectToClass> selectSubjectByClassAndId(String classid, String subjectid);
	
}

