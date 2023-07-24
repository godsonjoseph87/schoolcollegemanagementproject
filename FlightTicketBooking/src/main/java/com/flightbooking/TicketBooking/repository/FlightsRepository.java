package com.flightbooking.TicketBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightbooking.TicketBooking.bean.Flights;

public interface FlightsRepository extends JpaRepository<Flights, String>{
	

}
