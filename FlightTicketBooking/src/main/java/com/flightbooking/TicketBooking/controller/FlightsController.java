package com.flightbooking.TicketBooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.flightbooking.TicketBooking.bean.Flights;
import com.flightbooking.TicketBooking.service.FlightsService;

@RestController
public class FlightsController {
	@Autowired
	private FlightsService flightsService;

	@RequestMapping("/flights")
	public List<Flights> getAllClasses()
	{
		return flightsService.getAllFlights();
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/flights")
	public void addClasses(@RequestBody Flights classes)
	{
		flightsService.addFlight(classes);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/flight/{id}")
	public void updateClasses(@PathVariable String id, @RequestBody Flights classes)
	{
		flightsService.updateFlight(id, classes);
	}
	@RequestMapping(method = RequestMethod.DELETE, value="/flight/{id}")
	public void DeleteClasses(@PathVariable String id)
	{
		flightsService.deleteFlight(id);
	}
}
