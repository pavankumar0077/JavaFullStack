package com.zensar.assignment;

// Inheritance
public class Flight_ticket extends Tickets {

	protected float luggage_weight;

	public Flight_ticket(String from, String to, int seatNo, float price, float agent_commission,
			float luggage_weight) {
		super(from, to, seatNo, price, agent_commission);
		this.luggage_weight = luggage_weight;
	}

	// polymorphism
	public void ticket_details() {
		System.out.println("Flight Ticket Details...");
		System.out.println("Welcome.. <================>");
		System.out.println("From which place : " + from);
		System.out.println("To which place : " + to);
		System.out.println("Seat Number of the passenger  : " + seatNo);
		System.out.println("Price of the ticket : " + price);
		System.out.println("Agent's commission  : " + agent_commission);
		System.out.println("Luggage weight  : " + luggage_weight);
	}

	public void fligt_insurance() {
		final float insurance_percentage = (0.01f * this.price);
		final float total_ins_per = this.price + insurance_percentage;
		System.out.println("Price of the ticket with insurance 1% is : " + total_ins_per);
	}

	public void flight_total_ticket_price() {
		if (this.luggage_weight > 15) {
			final float total_percentage = (0.03f * this.price);
			final float total_price = this.price + total_percentage;
			System.out.println("Total ticket price with luggage > 15kg of luggage is : " + total_price);
		} else {
			System.out.println("Total ticket price with luggage < or = 15kg of luggage is : " + this.price);
		}
	}

	public void final_ticket_price() {
		fligt_insurance();
		flight_total_ticket_price();

	}

}
