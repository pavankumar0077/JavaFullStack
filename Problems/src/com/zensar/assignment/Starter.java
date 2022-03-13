package com.zensar.assignment;

public class Starter {

	public static void decorate() {
		System.out.println("=====================================");
	}

	public static void decorate2() {
		System.out.println("...");
		System.out.println("...");
		System.out.println("...");
	}

	public static void decorate3() {
		System.out.println("====================================================================");
	}

	public static void main(String[] args) {

		Bus_ticket bus1 = new Bus_ticket("Hyderabad", "Bangalore", 12313, 248, 0.02f);
		bus1.ticket_details();
		decorate();
		bus1.total_ticket_price();
		decorate();

		Bus_ticket bus2 = new Bus_ticket("Bangalore", "Pune", 86862, 467, 0.02f);
		bus2.ticket_details();
		decorate();
		bus2.total_ticket_price();
		decorate();

		decorate2();

		Railway_ticket railway1 = new Railway_ticket("Bangalore", "Hyderabad", 12339, 987, 0.02f, "second_class");
		railway1.ticket_details();
		decorate();
		railway1.total_ticket_price();
		decorate();

		Railway_ticket railway2 = new Railway_ticket("Delhi NCR", "Assam", 23439, 877, 0.02f, "second_AC");
		railway2.ticket_details();
		decorate();
		railway2.total_ticket_price();
		decorate();

		Railway_ticket railway3 = new Railway_ticket("Hyderabad", "Mumbai", 65439, 864, 0.02f, "thrid_AC");
		railway3.ticket_details();
		decorate();
		railway3.total_ticket_price();
		decorate();

		decorate2();

		Flight_ticket flight = new Flight_ticket("Chennai", "Pune", 531433, 2500, 0.02f, 18);
		flight.ticket_details();
		decorate3();
		flight.final_ticket_price();
		decorate3();

		Flight_ticket flight1 = new Flight_ticket("Pune", "Bangalore", 868823, 2788, 0.02f, 4);
		flight1.ticket_details();
		decorate3();
		flight1.final_ticket_price();
		decorate3();

		Flight_ticket flight2 = new Flight_ticket("Hyderbad", "Chennai", 989982, 31239, 0.02f, 12);
		flight2.ticket_details();
		decorate3();
		flight2.final_ticket_price();
		decorate3();

		Flight_ticket flight3 = new Flight_ticket("Assam", "Delhi", 989834, 53782, 0.02f, 16);
		flight3.ticket_details();
		decorate3();
		flight3.final_ticket_price();
		decorate3();

		Flight_ticket flight4 = new Flight_ticket("Hyderabad", "Mumbai", 593433, 43429, 0.02f, 9);
		flight4.ticket_details();
		decorate3();
		flight4.final_ticket_price();
		decorate3();

	}

}
