package ie.lyit.testers;

import java.util.ArrayList;

import ie.lyit.hotel.CreditCard;
import ie.lyit.hotel.Date;
import ie.lyit.hotel.Guest;
import ie.lyit.hotel.Name;

public class GuestTester {

	public static void main(String[] args) {
		// Cannot create object from Abstract class Person
		// Person p=new Person();
		
		ArrayList<Guest> guests=new ArrayList<Guest>();
		
		// Construct g1
		Name homer=new Name("Mr","Homer","Simpson");
		CreditCard homersCard=new CreditCard(1111222233334444L,
				                             new Date(31,12,2027),
				                             111);
		Guest g1=new Guest(homer, "087 1234567", 
				             "homer.simpson@atu.ie", homersCard);
		
		// Construct g2
		CreditCard margesCard=new CreditCard(5555666677778888L,
                                             new Date(31,12,2024),
                                             222);

		Guest g2=new Guest(new Name("Mrs","Marge","Simpson"),
				            "086 1234567", 
	                        "marge.simpson@atu.ie",margesCard);

		// Construct g3
		CreditCard lisasCard=new CreditCard(5555666677778888L,
                                            new Date(31,3,2024),
                                            333);		
		Guest g3=new Guest(new Name("Miss","Lisa","Simpson"),
	                        "087 9876543", 
                            "lisa.simpson@atu.ie",lisasCard);
		
		guests.add(g1);
		guests.add(g2);
		guests.add(g3);

		System.out.println("LIST OF GUESTS");
		for(Guest guest:guests) 
			System.out.println(guest);
		
		int femaleCount=0,maleCount=0;
		for(Guest guest:guests) {
			if(guest.getName().isFemale())
				femaleCount++;
			else
				maleCount++;
		}
		System.out.println("");
		System.out.println("MALE/FEMALE GUEST COUNT");
		System.out.println(maleCount + " MALE(S), " + femaleCount + " FEMALE(S).");		
		
		System.out.println("");
		System.out.println("GUESTS CREDIT CARD DETAILS");
		for(Guest guest:guests) 
			System.out.println(guest.getName() + 
					           " Card Number :" +
					           guest.getCreditCard());
	}
}
