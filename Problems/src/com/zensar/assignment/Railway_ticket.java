package com.zensar.assignment;

//Inheritance
public class Railway_ticket extends Tickets {

	private String seatType;

	public Railway_ticket(String from, String to, int seatNo, float price, float agent_commission, String seatType) {
		super(from, to, seatNo, price, agent_commission);
		this.seatType = seatType;
	}

	public void total_ticket_price() {

		float price = 0;
		float agent_commission = 0.0f;

		float price_prtge = this.agent_commission * this.price;
		float total_prtge = this.price + price_prtge;

		System.out.println("Total price of the ticket is : " + total_prtge);

	}

	// Polymorphism
	public void ticket_details() {
		System.out.println("Railway Ticket Details...");
		System.out.println("Welcome.. <================>");
		System.out.println("From which place : " + from);
		System.out.println("To which place : " + to);
		System.out.println("Seat Number of the passenger  : " + seatNo);
		System.out.println("Price of the ticket : " + price);
		System.out.println("Agent's commission  : " + agent_commission);
		System.out.println("Your seatType  : " + seatType);

	}

}
