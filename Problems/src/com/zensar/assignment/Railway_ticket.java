package com.zensar.assignment;

public class Railway_ticket extends Tickets{
	
	
	private String seatType;


	public Railway_ticket(String from, String to, int seatNo, float price, float agent_commission, String seatType) {
		super(from, to, seatNo, price, agent_commission);
		this.seatType = seatType;
	}
	
	public void ticket_details() {
		System.out.println("Railway Ticket Details...");
		System.out.println("Welcome.. <================>");
		System.out.println("From which place : " +from);
		System.out.println("To which place : " +to);
		System.out.println("Seat Number of the passenger is : " +seatNo);
		System.out.println("Price of the ticket : " +price);
		System.out.println("Agents commission is : " +agent_commission);
		System.out.println("Your seatType is : " +seatType);
		
	}
	
	

}
