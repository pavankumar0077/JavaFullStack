package com.zensar.assignment;

public class Bus_ticket extends Tickets{
	
//	public float total_percentage = 0f;


	public Bus_ticket(String from, String to, int seatNo, float price, float agent_commission) {
		super(from, to, seatNo, price, agent_commission);
		// TODO Auto-generated constructor stub
	}
	
	public void total_ticket_price() {
//		this.agent_commission = 0.02f;
		
		
		float price_percentage = this.agent_commission * this.price;
		float total_percentage =  this.price + price_percentage;
		
		System.out.println("Total price of the ticket is : " +total_percentage);
						
		
	}
	
	public void ticket_details() {
		System.out.println("Bus Ticket Details...");
		System.out.println("Welcome.. <================>");
		System.out.println("From which place : " +from);
		System.out.println("To which place : " +to);
		System.out.println("Seat Number of the passenger is : " +seatNo);
		System.out.println("Price of the ticket : " +price);
		System.out.println("Agents commission is : " +agent_commission);
	}

}
