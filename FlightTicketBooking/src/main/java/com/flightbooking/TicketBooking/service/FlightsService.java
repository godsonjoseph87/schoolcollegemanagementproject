package com.flightbooking.TicketBooking.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightbooking.TicketBooking.bean.Flights;
import com.flightbooking.TicketBooking.repository.FlightsRepository;

@Service
public class FlightsService {
	@Autowired
	public FlightsRepository classesRepo;

	public List<Flights> getAllFlights()
	{
		List<Flights> flights = new ArrayList<>();
		classesRepo.findAll().forEach(flights::add);
		return flights;
	}

	public void addFlight(Flights flights) {
		classesRepo.save(flights);
		
	}

	public void updateFlight(String id, Flights flights) {
		classesRepo.save(flights);
		
	}

	public void deleteFlight(String id) {
		classesRepo.deleteById(id);
		
	}
}
