package com.xadmin.SpringBootCrud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.xadmin.SpringBootCrud.bean.ClassReport;

public interface ClassReportRepository extends JpaRepository<ClassReport, String>{
	
	@Query(value="select c.id as classid, c.name as classname, te.name as teachername, s.name as studentname,"
			+ " s.address as studentaddress, sub.name as subjectname"
			+ " from classes as c   left join student as s on s.classid = c.id "
			+ " left join subjectstoclass as stc on stc.classid = s.classid "
			+ " left join subject as sub on sub.id = stc.subjectid"
			+ " left join teacherstoclass as ttc on ttc.classid = stc.classid"
			+ " left join teachers as te on te.id = ttc.teacherid"
			+ " where c.id=?1", nativeQuery = true)
	public List<ClassReport> getClassReport(String id);
	
}
