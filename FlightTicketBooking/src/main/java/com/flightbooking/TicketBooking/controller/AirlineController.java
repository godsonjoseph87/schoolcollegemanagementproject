package com.flightbooking.TicketBooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.flightbooking.TicketBooking.bean.Airline;
import com.flightbooking.TicketBooking.service.AirlineService;

@RestController
public class AirlineController {
	@Autowired
	private AirlineService airlineService;

	@RequestMapping("/airlines")
	public List<Airline> getAllAirliness()
	{
		return airlineService.getAllAirlines();
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/airlines")
	public void addClasses(@RequestBody Airline airline)
	{
		airlineService.addAirline(airline);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/airline/{id}")
	public void updateAirline(@PathVariable String id, @RequestBody Airline airline)
	{
		airlineService.updateAirline(id, airline);
	}
	@RequestMapping(method = RequestMethod.DELETE, value="/airline/{id}")
	public void DeleteAirline(@PathVariable String id)
	{
		airlineService.deleteAirline(id);
	}
}
