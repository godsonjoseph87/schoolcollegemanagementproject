package com.flightbooking.TicketBooking.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightbooking.TicketBooking.bean.Airline;
import com.flightbooking.TicketBooking.repository.AirlineRepository;

@Service
public class AirlineService {
	@Autowired
	public AirlineRepository airlineRepo;

	public List<Airline> getAllAirlines()
	{
		List<Airline> airline = new ArrayList<>();
		airlineRepo.findAll().forEach(airline::add);
		return airline;
	}

	public void addAirline(Airline airline) {
		airlineRepo.save(airline);
		
	}

	public void updateAirline(String id, Airline airline) {
		airlineRepo.save(airline);
		
	}

	public void deleteAirline(String id) {
		airlineRepo.deleteById(id);
		
	}
}
