package com.zensar.assignment;
/*
 * A travel agent helps customer to book bus/railway/flight ticket. 
 * The agent's commission is 2% of the total ticket amount. 
 * All tickets have basic information like from, to, seatNo & price.
Railway ticket will have specific information 
like seatType (second class, second AC or third AC).
Flight ticket will have specific information like luggage weight. 
If weight exceeds 15kg then 3% of ticket basic price charge is applicable. 
Also every flight ticket has travel insurance applicable that 
charges 1% of the basic ticket price.
Book 2 bus tickets, 3 railway tickets & 5 flight tickets. 
Write a method to calculate total price all tickets. 
Note: you need to maintain hierarchy of classes using inheritance & polymorphism.
 */
public class Starter {
	
	public static void decorate() {
		System.out.println("=====================================");
	}
	
	public static void main(String[] args) {
//		Tickets ticket = new Tickets("Hyderabad", "Bangalore", 12313, 248, 0.02f);
//		ticket.ticket_details();
//		decorate();
		
		Bus_ticket bus1 = new Bus_ticket("Hyderabad", "Bangalore", 12313, 248, 0.02f);
		bus1.ticket_details();
		decorate();
		bus1.total_ticket_price();
		decorate();
		
		Bus_ticket bus2 = new Bus_ticket("bangalore", "Pune", 86862, 467, 0.02f);
		bus2.ticket_details();
		decorate();
		bus2.total_ticket_price();
		decorate();
		

		
		Railway_ticket  railway1 = new Railway_ticket("Bangalore", "Hyderabad", 12339, 987, 0.02f, "second_class");
		railway1.ticket_details();
		decorate();
		
		Railway_ticket  railway2 = new Railway_ticket("Delhi NCR", "Assam", 12339, 877, 0.02f, "second_AC");
		railway2.ticket_details();
		decorate();
		
		Railway_ticket  railway3 = new Railway_ticket("Hyderabad", "Mumbai", 12339, 864, 0.02f, "thrid_AC");
		railway3.ticket_details();
		decorate();
		
		
		Flight_ticket flight = new Flight_ticket("Chennai", "Pune", 531433, 2500, 0.02f, 18);
		flight.ticket_details();
		decorate();
//		flight.fligt_insurance();
//		decorate();
//		flight.flight_total_ticket_price();
		flight.final_ticket_price();
		decorate();
		
		Flight_ticket flight1 = new Flight_ticket("Pune", "Bangalore", 868823, 2788, 0.02f, 4);
		flight1.ticket_details();
		decorate();
//		flight.fligt_insurance();
//		decorate();
//		flight.flight_total_ticket_price();
		flight1.final_ticket_price();
		decorate();
		
		Flight_ticket flight2 = new Flight_ticket("Hyderbad", "Chennai", 989982, 31239, 0.02f, 12);
		flight2.ticket_details();
		decorate();
//		flight.fligt_insurance();
//		decorate();
//		flight.flight_total_ticket_price();
		flight2.final_ticket_price();
		decorate();
		
		Flight_ticket flight3 = new Flight_ticket("Assam", "Delhi", 989834, 53782, 0.02f, 16);
		flight3.ticket_details();
		decorate();
//		flight.fligt_insurance();
//		decorate();
//		flight.flight_total_ticket_price();
		flight3.final_ticket_price();
		decorate();
		
		Flight_ticket flight4 = new Flight_ticket("Hyderabad", "Mumbai", 593433, 43429, 0.02f, 9);
		flight4.ticket_details();
		decorate();
//		flight.fligt_insurance();
//		decorate();
//		flight.flight_total_ticket_price();
		flight4.final_ticket_price();
		decorate();
		
	}

}
