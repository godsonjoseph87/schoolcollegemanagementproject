package com.xadmin.SpringBootCrud.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="teacherstoclass")
public class TeachersToClass {
	
	@Id
	private String id;
	private String classid;
	private String teacherid;
	private String subjectid;
	
	
	public TeachersToClass() {
		
	}
	public TeachersToClass(String id, String classid, String teacherid) {
		super();
		this.id = id;
		this.classid = classid;
		this.teacherid = teacherid;
		this.subjectid = subjectid;
	}
	
	 @Override
	 public String toString() {
	    return "{" +
	             "id='" + id + '\'' +
	             ", classid='" + classid + '\'' +
	             ", teacherid='" + teacherid + '\'' +
	             ", subjectid='" + subjectid + '\'' +
	            '}';
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
	public String getTeacherid() {
		return teacherid;
	}
	public void setTeacherid(String teacherid) {
		this.teacherid = teacherid;
	}
	public String getSubjectid() {
		return subjectid;
	}
	public void setSubjectid(String subjectid) {
		this.subjectid = subjectid;
	}

}
