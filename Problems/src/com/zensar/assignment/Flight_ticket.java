package com.zensar.assignment;

public class Flight_ticket extends Tickets{
	

	protected float luggage_weight;

	public Flight_ticket(String from, String to, int seatNo, float price, float agent_commission,
			float luggage_weight) {
		super(from, to, seatNo, price, agent_commission);
		this.luggage_weight = luggage_weight;
	}
	
	
	public void ticket_details() {
		System.out.println("Flight Ticket Details...");
		System.out.println("Welcome.. <================>");
		System.out.println("From which place : " +from);
		System.out.println("To which place : " +to);
		System.out.println("Seat Number of the passenger is : " +seatNo);
		System.out.println("Price of the ticket : " +price);
		System.out.println("Agents commission is : " +agent_commission);
		System.out.println("Luggage weight is : " +luggage_weight);
	}
	
	public void fligt_insurance() {
		final float insurance_percentage = (0.01f * this.price);
		final float total_ins_per = this.price - insurance_percentage;
		System.out.println("Price of the ticket with insurance is : "+total_ins_per);
	}
	
	public void flight_total_ticket_price() {
//		this.luggage_weight = 0;
		if (this.luggage_weight > 15) {
			final float total_percentage = (0.03f * this.price);
			final float total_price = this.price + total_percentage;
			System.out.println("Total ticket price with luggage > 15kg of luggage is : "+total_price);
		}else {
			System.out.println("Total ticket price with luggage < or = 15kg of luggage is : "+this.price);
		}
	}
	
	public void final_ticket_price () {
		fligt_insurance();
		flight_total_ticket_price();
		
//		final float insurance_percentage = (0.01f * this.price);
//		final float total_ins_per = this.price - insurance_percentage;
//		System.out.println("Price of the ticket with insurance is : "+total_ins_per);
//		
//		
//		if (this.luggage_weight > 15) {
//			final float total_percentage = (0.03f * this.price);
//			final float total_price = this.price + total_percentage;
//			System.out.println("Total ticket price with > 15kg of luggage is : "+total_price);
//		}else {
//			System.out.println("Total ticket price with < or = 15kg of luggage is : "+this.price);
//		}
		
//		float total_price = 0;
//		float grand_total_price = (total_ins_per + total_price);
//		
//		
//		System.out.println("Total price with insurance and luggage > 15kgs  : " +grand_total_price);
		
		
		
	}
		
}
	

	

		
	
	


