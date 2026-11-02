/**
 * Class: B.Sc. in Computing
 * Instructor: Maria Boyle
 * Description: Tester for the Guest class
 * Date: dd/mm/yyyy
 * @author Maria Boyle
 * @version 1.0
**/
package ie.atu.testers;

import java.util.ArrayList;

import ie.atu.hotel.PaymentCard;
import ie.atu.hotel.Date;
import ie.atu.hotel.Guest;
import ie.atu.hotel.Name;

public class GuestTester {

	public static void main(String[] args) {
		// Create an ArrayList of Guest objects called guests
		ArrayList <Guest> guests = new ArrayList<Guest>();
		
		// Create a Guest object called guest with initial values
		Name name=new Name("Mr", "Homer", "Simpson");
		PaymentCard card=new PaymentCard(1111222233334444L,
				             new Date(31,12,2027),111);
		Guest guest = new Guest(name, "087 1234567", 
				             "homer.simpson@atu.ie", card);	
		
		// and add guest to guests
		guests.add(guest);
		
		// Create another Guest object with initial values
		name=new Name("Mrs", "Marge", "Simpson");
		card=new PaymentCard(5555666677778888L,
				            new Date(31,12,2026),222);
		guest = new Guest(name, "086 1234567", 
				             "marge.simpson@atu.ie", card);	

		// and add this guest to guests
		guests.add(guest);
		
		// Create a final Guest object with initial values
		name=new Name("Miss", "Lisa", "Simpson");
		card=new PaymentCard(9999888877776666L,
				             new Date(31,3,2025),333);
		guest = new Guest(name, "087 9876543", 
				             "lisa.simpson@atu.ie", card);
		
		// and add this final guest to guests
		guests.add(guest);
		
		// Display all guest's
		System.out.println("LIST OF GUESTS");
		for(Guest g:guests)
			System.out.println(g);
		
		// Display male/female count
		int maleCount=0, femaleCount=0;
		for(Guest g:guests)
			if(g.getName().isFemale())
				femaleCount++;
			else
				maleCount++;
		
		System.out.println("\nMALE/FEMALE GUEST COUNT");
		System.out.println(maleCount + " MALE(S), " + femaleCount + " FEMALE(S).");
		
		// Display all guests' CreditCard numbers on screen
		System.out.println("\nGUEST CREDIT CARD DETAILS");
		for(Guest g:guests)
			System.out.println(g.getName()+" "+g.getPaymentCard());

	}
}
