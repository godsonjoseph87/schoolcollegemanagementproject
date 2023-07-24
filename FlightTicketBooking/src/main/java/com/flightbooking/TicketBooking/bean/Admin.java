package com.flightbooking.TicketBooking.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {
	
	@Id
	private String id = "1";
	private String email = "admin@gmail.com";
	private String username = "admin";
	private String password = "admin";
	private String name = "Admin";
	
	public Admin() {
		
	}
	
	public Admin(String id, String email, String username, String password, String name) {
		super();
		this.id = id;
		this.email = email;
		this.username = username;
		this.password = password;
		this.name = name;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
