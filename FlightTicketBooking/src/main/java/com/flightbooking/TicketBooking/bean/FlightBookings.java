package com.flightbooking.TicketBooking.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flightbookings")
public class FlightBookings {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String flightid;
	private String sourceid;
	private String destinationid;
	private String customerid;
	
	
	public FlightBookings() {
		
	}
	
	public FlightBookings(Long id, String flightid, String sourceid, String destinationid, String customerid) {
		super();
		this.id = id;
		this.flightid = flightid;
		this.sourceid = sourceid;
		this.destinationid = destinationid;
		this.customerid = customerid;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFlightid() {
		return flightid;
	}
	public void setFlightid(String flightid) {
		this.flightid = flightid;
	}
	public String getSourceid() {
		return sourceid;
	}
	public void setSourceid(String sourceid) {
		this.sourceid = sourceid;
	}
	public String getDestinationid() {
		return destinationid;
	}
	public void setDestinationid(String destinationid) {
		this.destinationid = destinationid;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
}
