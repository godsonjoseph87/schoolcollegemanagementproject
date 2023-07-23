package com.xadmin.SpringBootCrud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.xadmin.SpringBootCrud.bean.Teachers;

public interface TeachersRepository extends JpaRepository<Teachers, String>{
	
	@Query(value="select * from student where classid=?1", nativeQuery = true)
	public List<Teachers> getUserByClass(int classid);
	
	@Query(value="select * from student where name=?1", nativeQuery = true)
	public List<Teachers> selectStudentByName(String name);
}

