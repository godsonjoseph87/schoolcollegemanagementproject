package com.flightbooking.TicketBooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.flightbooking.TicketBooking.bean.Admin;
import com.flightbooking.TicketBooking.bean.Student;
import com.flightbooking.TicketBooking.service.AdminService;

@RestController
public class AdminController {
	@Autowired
	private AdminService adminService;
	
	@RequestMapping(method = RequestMethod.POST, value="/validateadmin")
	public String validateAdmin(@RequestBody Admin admin)
	{
		String username = admin.getUsername();
		String password = admin.getPassword();
		return adminService.validateAdmin(username, password); 
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/admin/{id}")
	public void updateAdmin(@PathVariable String id, @RequestBody Admin admin)
	{
		adminService.updateAdmin(id, admin);
	}

}
