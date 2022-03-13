package com.zensar.assignment;

// Inheritance
public class Bus_ticket extends Tickets {

	public Bus_ticket(String from, String to, int seatNo, float price, float agent_commission) {
		super(from, to, seatNo, price, agent_commission);

	}

	public void total_ticket_price() {

		float price_percentage = this.agent_commission * this.price;
		float total_percentage = this.price + price_percentage;

		System.out.println("Total price of the ticket is : " + total_percentage);

	}

	// polymorphism
	public void ticket_details() {
		System.out.println("Bus Ticket Details...");
		System.out.println("Welcome.. <================>");
		System.out.println("From which place : " + from);
		System.out.println("To which place : " + to);
		System.out.println("Seat Number of the passenger  : " + seatNo);
		System.out.println("Price of the ticket : " + price);
		System.out.println("Agent's commission  : " + agent_commission);
	}

}
