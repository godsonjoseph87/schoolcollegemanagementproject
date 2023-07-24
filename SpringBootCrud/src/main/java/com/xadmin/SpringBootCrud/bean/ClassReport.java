package com.xadmin.SpringBootCrud.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.lang.reflect.Field;

@Entity
public class ClassReport {
	@Id
	private String classid;
	private String classname;
	private String teachername;
	private String subjectname;
	private String studentname;
	private String studentaddress;
	
	 @Override
	 public String toString() {
	     StringBuilder sb = new StringBuilder("{");
	     Field[] fields = this.getClass().getDeclaredFields();

	     try {
	         for (int i = 0; i < fields.length; i++) {
	             Field field = fields[i];
	             field.setAccessible(true);
	             Object value = field.get(this);
	             sb.append(field.getName()).append("='").append(value).append("'");
	             if (i < fields.length - 1) {
	                 sb.append(", ");
	             }
	         }
	     } catch (IllegalAccessException e) {
	         e.printStackTrace();
	     }

        sb.append("}");
        return sb.toString();
	 }
	
	public ClassReport() {
		
	}
	public ClassReport(String classid, String classname, String teachername, String subjectname, String studentname, String studentaddress) {
		super();
		this.classid = classid;
		this.classname = classname;
		this.teachername = teachername;
		this.subjectname = subjectname;
		this.studentname = studentname;
		this.studentaddress = studentaddress;
}
	
	public String getClassid() {
		return classid;
	}
	public void setClassid(String classid) {
		this.classid = classid;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getTeachername() {
		return teachername;
	}
	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}
	public String getSubjectname() {
		return subjectname;
	}
	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentaddress() {
		return studentaddress;
	}
	public void setStudentaddress(String studentaddress) {
		this.studentaddress = studentaddress;
	}
	
}
