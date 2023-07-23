package com.xadmin.SpringBootCrud.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="teachers")
public class Teachers {
	
	@Id
	private String id;
	private String name;
	private String address;
	
	
	public Teachers() {
		
	}
	public Teachers(String id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	 @Override
	 public String toString() {
	    return "{" +
	             "id='" + id + '\'' +
	             ", name='" + name + '\'' +
	             ", address='" + address + '\'' +
	            '}';
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}