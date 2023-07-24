package com.flightbooking.TicketBooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightbooking.TicketBooking.bean.Admin;
import com.flightbooking.TicketBooking.repository.AdminRepository;

import java.util.List;

@Service
public class AdminService {
	@Autowired
	public AdminRepository adminRepo;

	public void updateAdmin(String id, Admin admin) {
		adminRepo.save(admin);
		
	}
	
	public String validateAdminLogin(String username, String password) {
		return "Admin Verified";
	}
	
	public String validateAdmin(String username, String password) {
		System.out.println(username);
		System.out.println(password);
		List<Admin> admin = adminRepo.getAdminByUserNameAndPassword(username, password);
		return "Admin Vlidated";
	}
	
}
