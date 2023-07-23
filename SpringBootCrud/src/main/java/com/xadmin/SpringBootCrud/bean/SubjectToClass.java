package com.xadmin.SpringBootCrud.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subjectstoclass")
public class SubjectToClass {
	
	@Id
	private String id;
	private String subjectid;
	private String classid;
	
	
	public SubjectToClass() {
		
	}
	public SubjectToClass(String id, String subjectid, String classid) {
		super();
		this.id = id;
		this.subjectid = subjectid;
		this.classid = classid;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getClassid() {
		return classid;
	}
	public void setClassid(String classid) {
		this.classid = classid;
	}
	public String getSubjectid() {
		return subjectid;
	}
	public void setSubject(String subjectid) {
		this.subjectid = subjectid;
	}
	
	

}
