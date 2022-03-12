package com.zensar.assignment;

public class Tickets {
	
	
	protected String from;
	protected String to;
	protected int seatNo;
	protected float price;
	protected float agent_commission;
	
	public Tickets(String from, String to, int seatNo, float price, float agent_commission) {
		super();
		this.from = from;
		this.to = to;
		this.seatNo = seatNo;
		this.price = price;
		this.agent_commission = agent_commission;
	}
	
	public void ticket_details() {
		System.out.println("From which place : " +from);
		System.out.println("To which place : " +to);
		System.out.println("Seat Number of the passenger is : " +seatNo);
		System.out.println("Price of the ticket : " +price);
		System.out.println("Agents commission is : " +agent_commission);
	}

}
